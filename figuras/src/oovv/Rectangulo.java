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
public class Rectangulo extends Figura {

    private double altura;// altura del rectángulo
    private double anchura;// anchura del rectángulo

    /**
     * Constructor de una instance de <code>Rectangulo</code>. llama al
     * constructor de Figura con la posición
     *
     * @param altura del rectángulo
     * @param anchura del rectángulo
     * @param x posición x del rectángulo
     * @param y posición y del rectángulo
     * @throws oovv.MiEX si algún lado del rectángulo es 0 o negativo
     */
    public Rectangulo(double altura, double anchura, int x, int y) throws MiEX {
        super(x, y);
        if (altura <= 0 || anchura <= 0) {
            throw new MiEX("los lados del rectángulo no pueden ser 0 o negativo");
        }
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public double calculaArea() {
        return altura * anchura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (altura + anchura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "x=" + x + ", y=" + y + " altura=" + altura + ", anchura=" + anchura + '}';
    }

}
