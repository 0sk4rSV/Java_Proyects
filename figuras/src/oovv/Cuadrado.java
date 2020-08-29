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
public class Cuadrado extends Figura {

    private double lado;// lado del cuadrado

    /**
     * Constructor de una instance de <code>Cuadrado</code>. llama al
     * constructor de Figura con la posición
     *
     * @param lado del cuadrado
     * @param x posición x del cuadrado
     * @param y posición y del cuadrado
     * @throws oovv.MiEX si algún lado del cuadrado es 0 o negativo
     */
    public Cuadrado(double lado, int x, int y) throws MiEX {
        super(x, y);
        if (lado <= 0 || lado <= 0) {
            throw new MiEX("los lados del cuadrado no pueden ser 0 o negativo");
        }
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "x=" + x + ", y=" + y + " lado=" + lado + '}';
    }

}
