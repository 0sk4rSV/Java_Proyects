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
public class NoEsUnaLetraEX extends Exception {

    /**
     * Creates a new instance of <code>NoEsUnaLetraEXC</code> without detail
     * message.
     */
    public NoEsUnaLetraEX() {
        super("la entrada debe ser una letra");
    }

    /**
     * Constructs an instance of <code>NoEsUnaLetraEXC</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoEsUnaLetraEX(String msg) {
        super(msg);
    }
}
