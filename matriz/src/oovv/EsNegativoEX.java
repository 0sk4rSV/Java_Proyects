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
public class EsNegativoEX extends Exception {

    /**
     * Creates a new instance of <code>EsNegativoEX</code> without detail
     * message.
     */
    public EsNegativoEX() {
    }

    /**
     * Constructs an instance of <code>EsNegativoEX</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EsNegativoEX(String msg) {
        super(msg);
    }
}
