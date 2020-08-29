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
import oovv.MiEX;
import oovv.Punto;
import vista.DEliminar;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class DiagEliminar implements ActionListener {

    private DEliminar ventana;
    private Punto punto;

    public DiagEliminar(JFrame parent, String accion) {
        ventana = new DEliminar(parent, true);
        ventana.setAccion(accion);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(parent);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "elimina figura":
                    punto = ventana.getPosicion();
                    ventana.dispose();
                    break;
                case "elimina rango":
                    getRango();
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

    public Punto getPunto() {
        return punto;
    }

    public String[] getRango() throws MiEX {
        String[] rango = new String[3];
        rango[0] = ventana.getRangoIni();
        rango[1] = ventana.getRangoFin();
        rango[3] = ventana.tipoRango();
        return rango;
    }

}
