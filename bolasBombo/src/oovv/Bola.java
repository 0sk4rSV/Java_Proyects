/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Bola {

    private int fila;
    private int columna;
    private static ImageIcon imgBola;

    public Bola(int fila, int columna, ImageIcon imgBola) {
        this.fila = fila;
        this.columna = columna;
        this.imgBola = recortaImagen(fila, columna, imgBola);
    }

    public Bola() {
    }

    public static ImageIcon recortaImagen(int fila, int columna, ImageIcon imagenCompleta) {
        final int ancho = 65;
        final int alto = 65;
        Image img = imagenCompleta.getImage();
        BufferedImage bimg = new BufferedImage(imagenCompleta.getIconWidth(),
                imagenCompleta.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimg.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        return new ImageIcon(bimg.getSubimage(columna * ancho, fila * alto, ancho, alto));
    }

    public ImageIcon getImgCompleta() {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/img/bolas-bingo.png"));
        return imagen;
    }

    public ImageIcon getImgBola() {
        return recortaImagen(fila, columna, getImgCompleta());
    }

}
