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
public class Miint implements Comparable<Miint> {

    private int num;

    public Miint() {
    }

    public Miint(int valor) {
        this.num = valor;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void incrementa() {
        num++;
    }

    public boolean esPar() {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.num;
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
        final Miint other = (Miint) obj;
        if (this.num != other.num) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return num + ", ";
    }

    @Override
    public int compareTo(Miint valor) {
        return this.num;
    }

}
