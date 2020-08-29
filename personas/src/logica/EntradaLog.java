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
import oovv.Persona;
import oovv.Personas;
import vista.EntradaDiag;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class EntradaLog implements ActionListener {

    private EntradaDiag ventana;
    private Persona persona;
    private Personas datosPersonas;

    public EntradaLog(VPrincipal padre, Personas datosPersonas, String accion) {
        this.datosPersonas = datosPersonas;
        ventana = new EntradaDiag(padre, true);
        ventana.setAccion(accion);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(padre);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "introducir":
                    if (ventana.getDNI().length() == 9) {
                        persona = ventana.getDatos();
                        ventana.dispose();
                    } else {
                        JOptionPane.showMessageDialog(ventana, "El DNI debe de tener una longitud de 9 caracteres");
                    }
                    break;
                case "buscar modificar":
                    persona = datosPersonas.damePersona(ventana.getDNI());
                    if (persona == null) {
                        JOptionPane.showMessageDialog(ventana, "No se ha encontrado ninguna persona con el DNI " + ventana.getDNI());
                    } else {
                        ventana.muestraDatosPersona(persona);
                        ventana.muestraModificar();
                    }
                    break;
                case "buscar eliminar":
                    persona = datosPersonas.damePersona(ventana.getDNI());
                    if (persona == null) {
                        JOptionPane.showMessageDialog(ventana, "No se ha encontrado ninguna persona con el DNI " + ventana.getDNI());
                    } else {
                        ventana.muestraDatosPersona(persona);
                        ventana.muestraEliminar();
                    }
                    break;
                case "modificar":
                    persona.modificaDatos(ventana.getDatos());
                    ventana.dispose();
                    break;
                case "eliminar":
                    datosPersonas.eliminaPersona(ventana.getDatos());
                    ventana.dispose();
                    break;
                case "cancelar":
                    ventana.dispose();
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (DateTimeException ex) {
            JOptionPane.showMessageDialog(ventana, "Fecha de nacimiento no valida");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "Fecha de nacimiento vacia");
        }
    }

    public Persona getPersona() {
        return persona;
    }

}
