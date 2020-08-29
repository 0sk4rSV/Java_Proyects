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
public class Circulo extends Figura {

    private double radio;// radio del círculo

    /**
     * Constructor de una instance de <code>Circulo</code>. llama al constructor
     * de Figura con la posición
     *
     * @param radio del círculo
     * @param x posición x del círculo
     * @param y posición y del círculo
     * @throws oovv.MiEX si el radio es 0 o negativo
     */
    public Circulo(double radio, int x, int y) throws MiEX {
        super(x, y);
        if (radio <= 0) {
            throw new MiEX("el radio no puede ser 0 o negativo");
        }
        this.radio = radio;
    }

    /**
     * @return el área del círculo
     */
    @Override
    public double calculaArea() {
        return Math.PI * radio * radio;
    }

    /**
     * @return el perímetro del círculo
     */
    @Override
    public double calculaPerimetro() {
        return Math.PI * radio * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" + "x=" + x + ", y=" + y + " radio=" + radio + '}';
    }

}
