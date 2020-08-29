/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.Objects;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Entrada {

    private String palabra;
    private int posicion;

    public Entrada(String palabra, int posicion){
        this.palabra = palabra;
        this.posicion = posicion;
    }

    public Entrada(String palabra) {
        this.palabra = palabra;
        this.posicion = -1;
    }

    public Entrada(int posicion) {
        this.palabra = " ";
        this.posicion = posicion;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getPosicion() {
        return posicion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.palabra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entrada other = (Entrada) obj;
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        return true;
    }

}
