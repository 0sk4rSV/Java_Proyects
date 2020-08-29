/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Bombo;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private Bombo bombo;

    public LogPrincipal() {
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "nuevo bombo":
                    bombo = new Bombo();
                    bombo.llenaBombo();
                    ventana.muestraBolas(bombo.dameBolasBombo());
                    break;
                case "ver bolas bombo":
                    if (bombo != null) {
                        ventana.muestraBolas(bombo.dameBolasBombo());
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Primero tienes que crear un nuevo bombo.");
                    }
                    break;
                case "ver bolas sacadas":
                    if (bombo != null) {
                        ventana.muestraBolas(bombo.dameBolasSacadas());
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Primero tienes que crear un nuevo bombo.");
                    }
                    break;
                case "sacar bola":
                    if (bombo != null) {
                        ventana.muestraBolas(bombo.sacaBola());
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Primero tienes que crear un nuevo bombo.");
                    }
                    break;
                case "sacar n bolas":
                    if (bombo != null) {
                        int numBolas = Integer.parseInt(JOptionPane.showInputDialog(ventana, "Indica cuantas bolas quieres sacar del bombo: "));
                        if (numBolas > 0 && numBolas < 91) {
                            ventana.muestraBolas(bombo.sacaNBolas(numBolas));
                        } else {
                            JOptionPane.showMessageDialog(ventana, "Solo se admiten numeros mayores entre 0 y 90");
                        }
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Primero tienes que crear un nuevo bombo.");
                    }
                    break;
                case "vaciar bombo":
                    if (bombo != null) {
                        bombo.borraBombo();
                        ventana.borraPantalla();
                        JOptionPane.showMessageDialog(ventana, "El bombo se ha eliminado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Primero tienes que crear un nuevo bombo.");
                    }
                    break;
                case "salir":
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "Solo se admiten numero enteros.");
        }
    }
}
