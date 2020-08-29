/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.DatosPelis;
import oovv.Incognitas;
import oovv.Jugada;
import oovv.LetraIntroducidaEX;
import oovv.NoEsUnaLetraEX;
import oovv.NoQuedanPeliculasEX;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private Incognitas misIcognitas;
    private Jugada laJugada;

    public LogPrincipal() {
        try {
            misIcognitas = new Incognitas(DatosPelis.getPelis());
            laJugada = new Jugada(misIcognitas.getIncognita());
            ventana = new VPrincipal();
            ventana.muestraGuiones(laJugada.getGuiones());
            ventana.setFrame(laJugada.getAhorcado());
            ventana.setOyente(this);
            ventana.setLocationRelativeTo(ventana);
            ventana.setVisible(true);
        } catch (NoQuedanPeliculasEX ex) {
            JOptionPane.showMessageDialog(ventana, ex.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "EntraLaLetra":
                    String letra = ventana.dameLetra();
                    ventana.muestraLetraIntroducidas(laJugada.getLetrasIntroducidas());
                    ventana.muestraGuiones(laJugada.comprueba(letra));
                    if (laJugada.estaCompleta()) {
                        JOptionPane.showMessageDialog(ventana, "BRAVO!!!!");
                        ventana.activaLeerLetra(false);
                    }else{
                        ventana.setFrame(laJugada.getAhorcado());
                        if (laJugada.estaMuerto()) {
                            ventana.muestraGuiones(laJugada.getIncognita());
                            ventana.activaLeerLetra(false);
                        }
                    }
                    break;
                case "JuegoNuevo":
                    ventana.borraJugadaAnterior();
                    laJugada = new Jugada(misIcognitas.getIncognita());
                    ventana.muestraGuiones(laJugada.getGuiones());
                    ventana.setFrame(laJugada.getAhorcado());
                    ventana.activaLeerLetra(true);
                    break;
            }
        } catch (NoQuedanPeliculasEX | LetraIntroducidaEX | NoEsUnaLetraEX ex) {
            JOptionPane.showMessageDialog(ventana, ex.getMessage());
        }
    }

}
