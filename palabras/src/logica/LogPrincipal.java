/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import oovv.SoyUtil;
import oovv.Entrada;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private List<String> listaPalabra;
    private String separador;

    public LogPrincipal() {
        listaPalabra = new ArrayList<String>();
        separador = " ";
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "añadir":
                EntradaLog dialogo = new EntradaLog(ventana, "desactivaPos", listaPalabra, "Añade una palabra al final de la lista.");
                Entrada entrada = dialogo.getTexto();
                if (entrada != null) {
                    String[] palabras = entrada.getPalabra().split(separador);
                    String primeraPalabra = getPrimeraPalabra(palabras);
                    if (primeraPalabra != null) {
                        listaPalabra.add(primeraPalabra);
                    }
                }
                break;
            case "insertar":
                dialogo = new EntradaLog(ventana, "activaPos", listaPalabra, "Inserta una palabra en la posición indicada.");
                entrada = dialogo.getTexto();
                if (entrada != null) {
                    String[] palabras = entrada.getPalabra().split(separador);
                    String primeraPalabra = getPrimeraPalabra(palabras);
                    if (primeraPalabra != null) {
                        try {
                            listaPalabra.add(entrada.getPosicion(), primeraPalabra);
                        } catch (IndexOutOfBoundsException ex) {
                            JOptionPane.showMessageDialog(ventana, "Debes introducir una posicion entre 0 y " + listaPalabra.size());
                        }
                    }
                }
                break;
            case "intercambio":
                dialogo = new EntradaLog(ventana, "activaIntercambio", listaPalabra, "Visualiza una palabra en la posición indicada");
                entrada = dialogo.getTexto();
                if (listaPalabra.contains(entrada.getPalabra())) {
                    for (String palabra : listaPalabra) {
                        if (palabra.equals(entrada.getPalabra())) {
                            int copiaPosicion = listaPalabra.indexOf(palabra);
                            Collections.swap(listaPalabra, copiaPosicion, entrada.getPosicion());
                            break;
                        }
                    }
                } else {
                    listaPalabra.add(entrada.getPalabra());
                    for (String palabra : listaPalabra) {
                        if (palabra.equals(entrada.getPalabra())) {
                            int copiaPosicion = listaPalabra.indexOf(palabra);
                            Collections.swap(listaPalabra, copiaPosicion, entrada.getPosicion());
                            break;
                        }
                    }
                }
                break;

            case "borrar":
                dialogo = new EntradaLog(ventana, "activaBorrar", listaPalabra, "Borra una palabra de la lista. (Acepta palabra o posicion).");
                entrada = dialogo.getTexto();
                if (entrada.getPalabra() != null) {
                    if (entrada.getPosicion() != -1) {
                        try {
                            listaPalabra.remove(entrada.getPosicion());
                        } catch (IndexOutOfBoundsException ex) {
                            JOptionPane.showMessageDialog(ventana, "Debes de introducir una posicion entre 0 y " + (listaPalabra.size()));
                        }
                    }
                    if (!entrada.getPalabra().isEmpty()) {
                        // forma 1
//                    while (listaPalabra.contains(entrada.getPalabra())) {
//                        listaPalabra.remove(entrada.getPalabra());
//                    }
//                }

                        // forma 2
//            for (int i = listaPalabra.size()-1; i >= 0; i--) {
//                if (listaPalabra.get(i).equalsIgnoreCase(entrada.getPalabra())) {
//                    listaPalabra.remove(i);
//                }
//            }
                        for (Iterator<String> iterator = listaPalabra.iterator(); iterator.hasNext();) {
                            if (iterator.next().equalsIgnoreCase(entrada.getPalabra())) {
                                iterator.remove();
                            }
                        }
                    }
                }
                break;
            case "quitar repetidas":
                Set<String> copiaListaPalabra = new LinkedHashSet<String>(listaPalabra);
                listaPalabra = new ArrayList<>(copiaListaPalabra);
                break;
            case "ver lista":
                ventana.borraPantalla();
                ventana.muestraLista(getLista());
                break;
            case "añadir palabras texto":
                dialogo = new EntradaLog(ventana, "desactivaPos", listaPalabra, "Añade todas las palabras de un texto");
                entrada = dialogo.getTexto();
                if (entrada != null) {
                    String[] palabras = SoyUtil.separa(entrada.getPalabra(), separador);
                    for (String palabra : palabras) {
                        if (!palabra.isEmpty()) {
                            listaPalabra.add(palabra);
                        }
                    }
                }
                break;
            case "borrar palabras texto":
                dialogo = new EntradaLog(ventana, "desactivaPos", listaPalabra, "Borra todas las palabras de un texto");
                entrada = dialogo.getTexto();
                if (entrada != null) {
                    String[] palabras = SoyUtil.separa(entrada.getPalabra(), separador);
                    for (String palabra : palabras) {
                        for (Iterator<String> iterator = listaPalabra.iterator(); iterator.hasNext();) {
                            if (iterator.next().equalsIgnoreCase(palabra)) {
                                iterator.remove();
                            }
                        }
                    }
                }
                break;
            case "definir separaciones":
                dialogo = new EntradaLog(ventana, "activaSep", listaPalabra, "Indica el separador de palabras al introducir un texto");
                entrada = dialogo.getTexto();
                separador = entrada.getPalabra();
                try {
                    SoyUtil.separa(getLista(), separador);
                } catch (PatternSyntaxException ex) {
                    JOptionPane.showMessageDialog(ventana, "No se admiten los separadores: ^ | \\ []");
                }
                break;
            case "todo mayus":
                for (int i = 0; i < listaPalabra.size(); i++) {
                    listaPalabra.set(i, listaPalabra.get(i).toUpperCase());
                }
                break;
            case "todo minus":
                for (int i = 0; i < listaPalabra.size(); i++) {
                    listaPalabra.set(i, listaPalabra.get(i).toLowerCase());
                }
                break;
            case "iniciales mayus":
                for (int i = 0; i < listaPalabra.size(); i++) {
                    String incialPalabraMayus = listaPalabra.get(i).substring(0, 1).toUpperCase() + listaPalabra.get(i).substring(1);
                    listaPalabra.set(i, incialPalabraMayus);
                }

                for (int i = 0; i < listaPalabra.size(); i++) {
                    listaPalabra.set(i, inicialMayuscula(separador));
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    private String getLista() {
        String cad = "Lista completa:\n";
        int cont = 1;
        int posicion = 0;
        for (String entrada : listaPalabra) {
            cad += "[" + posicion + "]" + entrada + (cont++ % 10 == 0 ? "\n" : ", ");
            posicion++;
        }
        return cad.substring(0, cad.length() - 2);
    }

    private String getPrimeraPalabra(String[] palabras) {

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                return palabras[i];
            }
        }
        return null;
    }

    private String inicialMayuscula(String texto) {
        char[] letras = texto.toCharArray();
        if (letras[0] >= 'a' && letras[0] <= 'z') {
            letras[0] -= 32;
        }
        return new String(letras);
    }

}
