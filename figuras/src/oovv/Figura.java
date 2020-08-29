/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public abstract class Figura implements Comparable<Figura> {

    protected Punto posicion;
    protected int x;
    protected int y;

    public Figura(Punto posicion) {
        this.posicion = posicion;
    }

    /**
     * Constructor de una instance de <code>Figura</code>.
     *
     * @param x posición x de la figura
     * @param y posición y de la figura
     */
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    /**
     * @return el área de la figura.
     */
    public abstract double calculaArea();

    /**
     * @return el perímetro de la figura.
     */
    public abstract double calculaPerimetro();

    /**
     * @return la posición x de la figura.
     */
    public int getX() {
        return x;
    }

    /**
     * asigna la posición x de la figura.
     *
     * @param x posición x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return la posición y de la figura.
     */
    public int getY() {
        return y;
    }

    /**
     * asigna la posición y de la figura.
     *
     * @param y posición y
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.x;
        hash = 11 * hash + this.y;
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
        if (!(obj instanceof Figura)) { // accepta cualquier objeto compatible con Figura, es decir, Figura, Circulo y Rectangulo (la jerarquía de herencia)
            return false;
        }
        final Figura other = (Figura) obj;
        /*
        dos objetos Figura son iguales si coinciden las posiciones x e y
         */
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Figura other) {
        Double f1 = this.calculaArea();
        Double f2 = other.calculaArea();
        return f1.compareTo(f2);
    }
}
