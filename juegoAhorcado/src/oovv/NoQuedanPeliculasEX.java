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
public class NoQuedanPeliculasEX extends Exception {

    /**
     * Creates a new instance of <code>NoQuedanPeliculasEXC</code> without
     * detail message.
     */
    public NoQuedanPeliculasEX() {
        super("no quedan películas");
    }

    /**
     * Constructs an instance of <code>NoQuedanPeliculasEXC</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoQuedanPeliculasEX(String msg) {
        super(msg);
    }
}
