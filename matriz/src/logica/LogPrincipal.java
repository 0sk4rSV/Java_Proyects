/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import oovv.EsNegativoEX;
import oovv.Miint;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private Set<Miint> conjunto;
    private Set<Miint> conjuntoPares;
    private Set<Miint> conjuntoImpares;

    public LogPrincipal() {
        conjunto = new TreeSet<>();
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "llena":
                ventana.borraPantalla();
                ventana.muestra("Se ha llenado la coleccion con valores del 1 al 99 \n\n");
                conjunto.clear();
                llenaConjunto();
                break;
            case "añade":
                try {
                añadeValores(conjunto);
                ventana.borraPantalla();
                ventana.muestra("Se han añadido los nuevos valores correctamente");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Solo se admiten valores enteros positivos");
            } catch (EsNegativoEX ex) {
                JOptionPane.showMessageDialog(ventana, ex.getMessage());
            }
            break;
            case "suma 1":
                ventana.borraPantalla();
                ventana.muestra("Se ha sumado 1 a todos los valores pares de la coleccion \n\n");
                sumaUno(conjunto);
                break;
            case "separa":
                ventana.borraPantalla();
                ventana.muestra("Se han separado los numeros pares e impares\n\n");
                separaParesImpares(conjunto);
                break;
            case "ver todo":
                ventana.borraPantalla();
                ventana.muestra("Valores del conjunto: \n\n");
                ventana.muestra(creaCadena(conjunto));
                break;
            case "ver pares":
                ventana.borraPantalla();
                ventana.muestra("Valores del conjunto PAR: \n\n");
                ventana.muestra(creaCadena(conjuntoPares));
                break;
            case "ver impares":
                ventana.borraPantalla();
                ventana.muestra("Valores del conjunto IMPAR: \n\n");
                ventana.muestra(creaCadena(conjuntoImpares));
                break;
        }
    }

    public void llenaConjunto() {
        conjunto = new HashSet<>(100);
        for (int i = 1; i < 100; i++) {
            conjunto.add(new Miint(i));
        }
    }

    public String creaCadena(Set<Miint> conjunto) {
        StringBuilder st = new StringBuilder("");
        int cont = 1;
        for (Miint elemento : conjunto) {
            st.append(String.format("%4d", elemento.getNum())).append(cont++ % 10 == 0 ? "\n" : " ");
        }
        return st.toString() + "\n\n" + "Se han añadido " + conjunto.size() + " elementos al conjunto";
    }

    private void añadeValores(Set<Miint> conjunto) throws EsNegativoEX {
        int copiaRandom = 0;
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de valores a añadir: "));
        if (cant > 0) {
            for (int i = 0; i < cant; i++) {
                int numRandom = (int) (Math.random() * 1000);
                if (copiaRandom != numRandom) {
                    conjunto.add(new Miint(numRandom));
                    copiaRandom = numRandom;
                } else {
                    i--;
                }
            }
        } else {
            throw new EsNegativoEX("No se admiten valores negativos");
        }
    }

    private void sumaUno(Set<Miint> conjunto) {
        for (Miint elemento : conjunto) {
            if (elemento.esPar()) {
                elemento.incrementa();
            }
        }
        Set<Miint> conjuntoParesCopia = new TreeSet<>(conjunto);
        conjunto.clear();
        conjunto.addAll(conjuntoParesCopia);
    }

    private void separaParesImpares(Set<Miint> conjunto) {
        conjuntoPares = new TreeSet<>();
        conjuntoImpares = new TreeSet<>();

        for (Iterator<Miint> it = conjunto.iterator(); it.hasNext();) {
            Miint elemento = it.next();
            if (elemento.esPar()) {
                conjuntoPares.add(elemento);
            } else {
                conjuntoImpares.add(elemento);
            }
        }
    }

}
