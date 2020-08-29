/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.Comparator;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class OrdPorTieneCoche implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return Boolean.compare(o1.getTieneCoche(), o2.getTieneCoche());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

}
