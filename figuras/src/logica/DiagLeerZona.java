/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oovv.Punto;
import oovv.Zona;
import vista.DLeerZona;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DiagLeerZona implements ActionListener {

    private DLeerZona ventana;
    private Zona zona;
    private Punto punto;

    public DiagLeerZona(JFrame parent, String accion) {
        ventana = new DLeerZona(parent, true);
        ventana.setAccion(accion);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(parent);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "valida":
                    zona = ventana.getZona();
                    ventana.dispose();
                    break;
                case "valida punto":
                    punto = ventana.getPunto();
                    ventana.dispose();
                    break;
                case "cancela":
                    ventana.dispose();
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "verifica el formato de los números");
        }
    }

    public Zona getZona() {
        return zona;
    }

    public Punto getPunto() {
        return punto;
    }

}
