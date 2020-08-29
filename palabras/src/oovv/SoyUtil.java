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
public class SoyUtil {

    public static String[] separa(String texto, String separadores) {
        return texto.split("[" + separadores + "]");
    }

}
