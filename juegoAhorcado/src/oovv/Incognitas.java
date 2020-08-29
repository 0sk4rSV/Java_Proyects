/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.List;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Incognitas {
    
    private List<String> lasPeliculas;

 
    public Incognitas(List<String> lasPeliculas) {
        this.lasPeliculas = lasPeliculas;
    }

    public String getIncognita() throws NoQuedanPeliculasEX {
        if (lasPeliculas.isEmpty()) {
            throw  new NoQuedanPeliculasEX();
        }
        int pos = (int) (Math.random() * lasPeliculas.size());
        String incognita = lasPeliculas.get(pos);
        lasPeliculas.remove(pos);
        return incognita;
    }
    
    
    
}
