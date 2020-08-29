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
import oovv.Figura;
import oovv.MiEX;
import vista.DAñadir;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DiagAñadir implements ActionListener {

    private DAñadir ventana;
    private Figura figura;

    public DiagAñadir(JFrame parent, String accion) {
        ventana = new DAñadir(parent, true);
        ventana.setAccion(accion);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(parent);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "valida rectángulo":
                    figura = ventana.getRectangulo();
                    ventana.dispose();
                    break;
                case "valida círculo":
                    figura = ventana.getCírculo();
                    ventana.dispose();
                    break;
                case "valida cuadrado":
                    figura = ventana.getCuadrado();
                    ventana.dispose();
                    break;
                case "cancela":
                    ventana.dispose();
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "verifica el formato de los números");
        } catch (MiEX ex) {
            JOptionPane.showMessageDialog(ventana, ex.getMessage());
        }
    }

    public Figura getFigura() {
        return figura;
    }

}
