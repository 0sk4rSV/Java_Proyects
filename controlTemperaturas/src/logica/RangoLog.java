/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import vista.RangoFechasDialogo;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class RangoLog implements ActionListener {

    private RangoFechasDialogo ventana;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public RangoLog(VPrincipal padre) {
        ventana = new RangoFechasDialogo(padre, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(padre);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "introducir":
                try {
                fechaInicio = ventana.getFechaInicio();
                fechaFinal = ventana.getFechaFinal();
                if (fechaInicio.compareTo(fechaFinal) > 0) {
                    LocalDate tmp = fechaFinal;
                    fechaFinal = fechaInicio;
                    fechaInicio = tmp;
                }
                ventana.dispose();
            } catch (DateTimeException ex) {
                JOptionPane.showMessageDialog(ventana, "La fecha es incorrecta");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Solo se admiten numeros enteros");
            }
            break;
            case "cancelar":
                fechaInicio = null;
                fechaFinal = null;
                ventana.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }

    public LocalDate getFechaIni() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFinal;
    }

}
