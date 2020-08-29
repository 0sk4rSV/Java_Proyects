/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Personas {

    private List<Persona> listaPersonas;

    public Personas() {
        listaPersonas = new ArrayList<>();
    }

    public void añadir(Persona persona) {
        listaPersonas.add(persona);
    }

    public void eliminaPersona(Persona datos) {
        listaPersonas.remove(datos);
    }

    public String listar() {
        int cont = 0;
        StringBuilder cad = new StringBuilder("------------------ LISTADO COMPLETO PERSONAS ------------------\n\n");
        for (Persona unaPersona : listaPersonas) {
            cad.append(unaPersona.toString() + "\n");
            cont++;
        }
        return cad.toString();
    }

    public Persona damePersona(String dni) {
        for (Persona unaPersona : listaPersonas) {
            if (unaPersona.getDNI().equals(dni)) {
                return unaPersona;
            }
        }
        return null;
    }

    public void listarPorEdad() {
        listaPersonas.sort(new OrdPorEdad());
    }

    public void listarPorNombre() {
        listaPersonas.sort(new OrdPorNombre());
    }

    public void listarPorApellidos() {
        listaPersonas.sort(new OrdPorApellidos());
    }

    public void listarPorTieneCoche() {
        listaPersonas.sort(new OrdPorTieneCoche());
    }
}
