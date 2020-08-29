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
public class Zona {

    private Punto esquinaSupIz;// esquina superior izquierda de la zona
    private Punto esquinaInfDe;// esquina inferior derecha de la zona

    /**
     * constructor de Zona.
     *
     * @param esquinaSupIz Punto de la esquina superior izquierda
     * @param esquinaInfDe Punto de la esquina inferior derecha
     */
    public Zona(Punto esquinaSupIz, Punto esquinaInfDe) {
        this.esquinaSupIz = esquinaSupIz;
        this.esquinaInfDe = esquinaInfDe;
    }

    /**
     * @return la X de la esquina superior izquierda
     */
    public int getXesi() {
        return esquinaSupIz.getX();
    }

    /**
     * @return la Y de la esquina superior izquierda
     */
    public int getYesi() {
        return esquinaSupIz.getY();
    }

    /**
     * @return la X de la esquina inferior derecha
     */
    public int getXeid() {
        return esquinaInfDe.getX();
    }

    /**
     * @return la Y de la esquina inferior derecha
     */
    public int getYeid() {
        return esquinaInfDe.getY();
    }

    @Override
    public String toString() {
        return "Zona:\n" + "{esquinaSupIz=" + esquinaSupIz + "\nesquinaInfDe=" + esquinaInfDe + "}";
    }

}
