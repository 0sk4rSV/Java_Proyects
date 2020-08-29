/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.List;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Medidor {

    public static String getDistancia(MisFiguras lasFiguras, String[] coordsPunto) {
        String cad = "Punto establecido en: (X=" + coordsPunto[0] + ", y=" + coordsPunto[1] + ")\n---------------------------------\n";
        int distanciaX, distanciaY;
        List<Figura> listaFiguras = lasFiguras.getMisFiguras();
        for (Figura laFigura : listaFiguras) {
            distanciaX = Math.abs(laFigura.x - Integer.parseInt(coordsPunto[0]));
            distanciaY = Math.abs(laFigura.y - Integer.parseInt(coordsPunto[1]));
            cad += laFigura + "\n-Distancia del punto (x=" + distanciaX + ", y=" + distanciaY + ")\n\n";
        }
        return cad;
    }

    public static String getDistancia(MisFiguras lasFiguras, Punto punto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
