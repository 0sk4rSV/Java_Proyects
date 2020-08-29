/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import javax.swing.JOptionPane;
import oovv.Temperatura;
import vista.DialogoTemp;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class EntradaLog implements ActionListener {

    private DialogoTemp ventana;
    private Temperatura temperatura;

    public EntradaLog(VPrincipal padre) {
        ventana = new DialogoTemp(padre, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(padre);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "introducir":
                try {
                temperatura = ventana.getTemp();
                ventana.dispose();
            } catch (DateTimeException ex) {
                JOptionPane.showMessageDialog(ventana, "La fecha es incorrecta");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Solo se admiten numeros enteros");
            }
            break;

            case "cancelar":
                ventana.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }

    public Temperatura getTemp() {
        return temperatura;
    }

}
