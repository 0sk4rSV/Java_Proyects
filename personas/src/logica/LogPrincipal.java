/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oovv.Persona;
import oovv.Personas;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private Personas listaPersonas;

    public LogPrincipal() {
        listaPersonas = new Personas();
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "añadir":
                EntradaLog dialogo = new EntradaLog(ventana, listaPersonas, "añade");
                Persona persona = dialogo.getPersona();
                if (persona != null) {
                    listaPersonas.añadir(persona);
                }
                break;
            case "modificar":
                dialogo = new EntradaLog(ventana, listaPersonas, "modifica");
                persona = dialogo.getPersona();
                break;
            case "eliminar":
                dialogo = new EntradaLog(ventana, listaPersonas, "elimina");
                persona = dialogo.getPersona();
                break;
            case "listar":
                ventana.borra();
                ventana.muestra(listaPersonas.listar());
                break;
            case "ordenar edad":
                ventana.borra();
                listaPersonas.listarPorEdad();
                ventana.muestra(listaPersonas.listar());
                break;
            case "ordenar nombre":
                ventana.borra();
                listaPersonas.listarPorNombre();
                ventana.muestra(listaPersonas.listar());
                break;
            case "ordenar apellidos":
                ventana.borra();
                listaPersonas.listarPorApellidos();
                ventana.muestra(listaPersonas.listar());
                break;
            case "ordenar tiene coche":
                ventana.borra();
                listaPersonas.listarPorTieneCoche();
                ventana.muestra(listaPersonas.listar());
                break;
            default:
                throw new AssertionError();
        }
    }

}
