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
public class OrdPorArea implements Comparator<Figura> {

    @Override
    public int compare(Figura o1, Figura o2) {
        Double f1 = o1.calculaArea();
        Double f2 = o2.calculaArea();
        return f1.compareTo(f2);
    }

    @Override
    public Comparator<Figura> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }
}
