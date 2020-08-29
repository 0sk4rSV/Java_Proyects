/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijeras;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.LogPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Piedrapapeltijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        new LogPrincipal();
    }

}
