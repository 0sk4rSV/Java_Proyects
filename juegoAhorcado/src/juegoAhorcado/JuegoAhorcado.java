/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoAhorcado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.LogPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(LogPrincipal::new);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JuegoAhorcado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
