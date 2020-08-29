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
public class LetraIntroducidaEX extends Exception {

    /**
     * Creates a new instance of <code>LetraIntroducidaEXC</code> without detail
     * message.
     */
    public LetraIntroducidaEX() {
        super("la letra ya ha sido introducida");
    }

    /**
     * Constructs an instance of <code>LetraIntroducidaEXC</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LetraIntroducidaEX(String msg) {
        super(msg);
    }
}
