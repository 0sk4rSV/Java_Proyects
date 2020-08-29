/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import oovv.Entrada;
import vista.MiDialogo;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class EntradaLog implements ActionListener{

    private MiDialogo ventana;
    private Entrada entrada;

    public EntradaLog(VPrincipal padre, String accion, List<String> listaPalabra, String titulo) {

        ventana = new MiDialogo(padre, true);
        ventana.setAccion(accion, listaPalabra);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setTitle(titulo);
        ventana.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "introducir":
                try {
                entrada = ventana.getEntrada();
                ventana.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Debes de introducir un entero");
            }
            break;
            case "cancelar":
                ventana.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }

    public Entrada getTexto() {
        return entrada;
    }

}
