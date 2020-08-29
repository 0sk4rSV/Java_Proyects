/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;

    public LogPrincipal() {
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "piedra":
                ventana.activaPiedra();
                Jugada jugadaOrdenador = getJugadaOrdenador();
                ventana.verJugadaOrdenador(jugadaOrdenador);
                comprobarGanador(Jugada.PIEDRA, jugadaOrdenador);
                ventana.verResultado(comprobarGanador(Jugada.PIEDRA, jugadaOrdenador));
                break;
            case "papel":
                ventana.activaPapel();
                jugadaOrdenador = getJugadaOrdenador();
                ventana.verJugadaOrdenador(jugadaOrdenador);
                comprobarGanador(Jugada.PAPEL, jugadaOrdenador);
                ventana.verResultado(comprobarGanador(Jugada.PAPEL, jugadaOrdenador));
                break;
            case "tijeras":
                ventana.activaTijeras();
                jugadaOrdenador = getJugadaOrdenador();
                ventana.verJugadaOrdenador(jugadaOrdenador);
                comprobarGanador(Jugada.TIJERAS, jugadaOrdenador);
                ventana.verResultado(comprobarGanador(Jugada.TIJERAS, jugadaOrdenador));
                break;
            case "otra jugada":
                ventana.JuegoNuevo();
                break;
            default:
                throw new AssertionError();
        }
    }

    private Jugada getJugadaOrdenador() {
        return Jugada.values()[(int) (Math.random() * 3)];
    }

    private String comprobarGanador(Jugada jugada, Jugada jugadaOrdenador) {
        if (jugada == Jugada.PIEDRA && jugadaOrdenador == Jugada.TIJERAS
                || jugada == Jugada.PAPEL && jugadaOrdenador == Jugada.PIEDRA
                || jugada == Jugada.TIJERAS && jugadaOrdenador == Jugada.PAPEL) {
            return "Has ganado";
        }
        if (jugadaOrdenador == Jugada.PIEDRA && jugada == Jugada.TIJERAS
                || jugadaOrdenador == Jugada.PAPEL && jugada == Jugada.PIEDRA
                || jugadaOrdenador == Jugada.TIJERAS && jugada == Jugada.PAPEL) {
            return "Has perdido";
        }
        return "Empate";
    }

}
