/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Circulo;
import oovv.Cuadrado;
import oovv.Medidor;
import oovv.MisFiguras;
import oovv.MiEX;
import oovv.Rectangulo;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana; // interfaz de usuario
    private MisFiguras lasFiguras; // el conjunto de figuras a manejar
    private Medidor miMedidor;

    public LogPrincipal() {
        lasFiguras = new MisFiguras();
        miMedidor = new Medidor();
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "añadir rectangulo":
                    DiagAñadir da = new DiagAñadir(ventana, "añadir rectangulo");
                    Rectangulo rec = (Rectangulo) da.getFigura();
                    if (rec != null) {
                        lasFiguras.añadir(rec);
                        ventana.muestra("Añadido\n" + rec);
                    }
                    break;
                case "añadir circulo":
                    da = new DiagAñadir(ventana, "añadir circulo");
                    Circulo cir = (Circulo) da.getFigura();
                    if (cir != null) {
                        lasFiguras.añadir(cir);
                        ventana.muestra("Añadido\n" + cir);
                    }
                    break;
                case "añadir cuadrado":
                    da = new DiagAñadir(ventana, "añadir cuadrado");
                    Cuadrado cua = (Cuadrado) da.getFigura();
                    if (cua != null) {
                        lasFiguras.añadir(cua);
                        ventana.muestra("Añadido\n" + cua);
                    }
                    break;
                case "añadir 10 figuras":
                    ventana.muestra("Añadidos\n" + lasFiguras.getListadoRandom());
                    break;
                case "eliminar Una figura":
                    DiagEliminar de = new DiagEliminar(ventana, "eliminar una figura");
                    lasFiguras.elimina(de.getPunto().getX(), de.getPunto().getY());
                    break;
                case "eliminar Un rango":
                    de = new DiagEliminar(ventana, "eliminar un rango");
                    lasFiguras.eliminaRango(Double.parseDouble(de.getRango()[0]), Double.parseDouble(de.getRango()[1]), de.getRango()[2]);
                    ventana.muestra("Se han eliminado las figuras con un " + de.getRango()[2] + " entre\n"
                            + Double.parseDouble(de.getRango()[0]) + " y " + Double.parseDouble(de.getRango()[1]));
                    break;
                case "eliminar Todas":
                    lasFiguras.eliminaTodas();
                    ventana.muestra("Se han eliminado todas las figuras.");
                    break;
                case "sumar Áreas":
                    ventana.muestra("las áreas suman " + lasFiguras.getSumaAreas());
                    break;
                case "sumar Perímetros":
                    ventana.muestra("las áreas suman " + lasFiguras.getSumaPerimetros());
                    break;
                case "sumar Figuras":
                    DiagLeerZona dl = new DiagLeerZona(ventana, "zona");
                    ventana.muestra(lasFiguras.sumaFigurasZona(dl.getZona()));
                    break;
                case "ver Figuras":
                    ventana.muestra("Lista de figuras\n----------------\n" + lasFiguras.getListado());
                    break;
                case "ver Área máx / mín":
                    ventana.muestra(lasFiguras.getAreaMaxMin());
                    break;
                case "ver Perímetro máx / mín":
                    ventana.muestra(lasFiguras.getPerimetroMaxMin());
                    break;
                case "ver Distancia a un punto":
                    dl = new DiagLeerZona(ventana, "punto");
                    ventana.muestra(miMedidor.getDistancia(lasFiguras, dl.getPunto()));
                    break;
                case "ver Distancia entre figuras":

                    break;
                default:
                    System.exit(0);
            }
        } catch (MiEX miEX) {
            JOptionPane.showMessageDialog(ventana, miEX.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "Revisa el formato de los datos.");
        }
    }

    public int[] dameCoordsZona(String[] coordsSupIzq, String[] coordsInfDer) {
        String[] coordsZonaTemp = new String[coordsSupIzq.length + coordsInfDer.length];
        System.arraycopy(coordsSupIzq, 0, coordsZonaTemp, 0, coordsSupIzq.length);
        System.arraycopy(coordsInfDer, 0, coordsZonaTemp, coordsSupIzq.length, coordsInfDer.length);
        int[] coordsZona = new int[coordsZonaTemp.length];
        for (int i = 0; i < coordsZonaTemp.length; i++) {
            coordsZona[i] = Integer.parseInt(coordsZonaTemp[i]);
        }
        return coordsZona;
    }

}
