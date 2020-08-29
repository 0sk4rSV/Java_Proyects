/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Ahorcado {

    private int numFallos; //número de fallos del ahorcado
    private int fallosMaximos; //número de fallos máximos
    private static BufferedImage img;  // la imagen completa con los distintos frames del ahorcado

    /**
     * constructor de ElAhorcado. carga la imagen completa
     */
    public Ahorcado() {
        numFallos = 0;
        fallosMaximos = 9;
        ImageIcon ima = (new ImageIcon(getClass().getResource("/imag/sahorcado.jpg")));
        img = new BufferedImage(ima.getIconWidth(), ima.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = img.createGraphics();
        g.drawImage(ima.getImage(), 0, 0, null);
    }

    /**
     * devuelve la imagen del ahorcado en función del número de fallos.
     *
     * @return un ImageIcon con la subimagen del ahorcado
     */
    public ImageIcon getIcon() {
        BufferedImage copia = new BufferedImage(470, 644, BufferedImage.TYPE_INT_ARGB);
        Graphics g = copia.createGraphics();
        g.drawImage(img.getSubimage(470 * numFallos, 0, 470, 644), 0, 0, null);
        return new ImageIcon(copia);
    }

    /**
     * incrementa los fallos.
     *
     */
    public void incrementaFallos() {
        numFallos++;
    }

    /**
     * indica si el jugador está muerto. si se ha llegado al número de fallos máximo
     *
     * @return <code>true</code> si aun se pueden hacer
     * fallos<br><code>false</code> si ya se han hecho todos los fallos
     */
    public boolean estasMuerto() {
        return numFallos >= fallosMaximos;
    }

    /**
     * inicia el número de fallos del ahorcado.
     */
    public void iniciar() {
        numFallos = 0;
    }

}
