/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;

    public LogPrincipal() {
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "listar ordenadas":
                String textoEntrada = ventana.getTexto();
                if (!textoEntrada.isEmpty()) {
                    String[] palabras = textoEntrada.split("[ ,;.\n]");
                    Map<String, Integer> mapaPalabras = new TreeMap<>();
//                    Map<String, Integer> mapaPalabras = new TreeMap<>(Collections.reverseOrder());
                    for (int i = 0; i < palabras.length; i++) {
                        mapaPalabras.put(palabras[i], (mapaPalabras.get(palabras[i]) == null ? 1 : mapaPalabras.get(palabras[i]) + 1));
                    }
                    String cad = "---------------- PALABRAS TEXTO ORDENADAS ----------------\n\n";
                    for (Map.Entry<String, Integer> pareja : mapaPalabras.entrySet()) {
                        ventana.muestra(cad += "\"" + pareja.getKey() + "\"" + " se repite " + pareja.getValue() + (pareja.getValue() == 1 ? " vez.\n" : " veces.\n"));
                    }
                } else {
                    ventana.muestra("No se ha introducido ningun texto/palabra");
                }
                break;
            default:
                throw new AssertionError();
        }
    }

}
