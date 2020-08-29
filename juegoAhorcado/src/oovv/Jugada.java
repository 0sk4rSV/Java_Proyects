/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.text.Collator;
import javax.swing.ImageIcon;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Jugada {

    private String incognita;
    private String guiones;
    private String letrasIntroducidas;
    private Ahorcado ahorcado;

    public Jugada(String incognita) {
        this.incognita = incognita;
        ahorcado = new Ahorcado();
        crearGuiones();
        this.letrasIntroducidas = "";
    }

    private void crearGuiones() {
        guiones = "";
        for (int i = 0; i < incognita.length(); i++) {
            Character caracter = incognita.charAt(i);
            if (Character.isAlphabetic(caracter)) {
                guiones += "-";
            } else {
                guiones += caracter;
            }
        }
    }

    public String getIncognita() {
        return incognita;
    }

    public String getLetrasIntroducidas() {
        return letrasIntroducidas;
    }

    public String getGuiones() {
        return guiones;
    }

    public String comprueba(String letra) throws LetraIntroducidaEX, NoEsUnaLetraEX {
        if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
            throw new NoEsUnaLetraEX();
        }
        letra = letra.toLowerCase();
        if (letrasIntroducidas.contains(letra)) {
            throw new LetraIntroducidaEX();
        }
        letrasIntroducidas += letra;

        Collator miCollator = Collator.getInstance();
        miCollator.setStrength(Collator.PRIMARY);
        String nuevosGuiones = "";
        for (int i = 0; i < incognita.length(); i++) {
            String letraIncognita = incognita.charAt(i) + "";
            if (miCollator.compare(letraIncognita, letra) == 0) {
                nuevosGuiones += incognita.charAt(i);
            } else {
                nuevosGuiones += guiones.charAt(i);
            }
        }
        if (nuevosGuiones.equals(guiones)) {
            ahorcado.incrementaFallos();
        } else {
            guiones = nuevosGuiones;
        }
        return guiones;
    }

    public boolean estaCompleta() {
        return incognita.equals(guiones);
    }

    public boolean estaMuerto() {
        return ahorcado.estasMuerto();
    }

    public ImageIcon getAhorcado() {
        return ahorcado.getIcon();
    }

}
