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
public class OrdPorFechas implements Comparator<Temperatura> {

    @Override
    public int compare(Temperatura o1, Temperatura o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }

    @Override
    public Comparator<Temperatura> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

}
