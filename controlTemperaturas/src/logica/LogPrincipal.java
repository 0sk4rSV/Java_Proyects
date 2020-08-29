/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import oovv.Temperatura;
import oovv.Temperaturas;
import vista.VPrincipal;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class LogPrincipal implements ActionListener {

    private VPrincipal ventana;
    private Temperaturas temperaturasAño;

    public LogPrincipal() {
        temperaturasAño = new Temperaturas();
        ventana = new VPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "añadir":
                EntradaLog dialogoTemp = new EntradaLog(ventana);
                Temperatura temp = dialogoTemp.getTemp();
                if (temp != null) {
                    if (!temperaturasAño.añadir(temp)) {
                        JOptionPane.showMessageDialog(ventana, "No se ha añadido la temperatura");
                    }
                }
                break;
            case "modificar":
                dialogoTemp = new EntradaLog(ventana);
                temp = dialogoTemp.getTemp();
                if (temp != null) {
                    if (!temperaturasAño.modificar(temp)) {
                        JOptionPane.showMessageDialog(ventana, "La fecha " + temp.getFecha() + " no existe");
                    }
                }
                break;
            case "listar todas":
                ventana.borraPantalla();
                ventana.muestra(temperaturasAño.listar());
                break;
            case "listar por fecha":
                ventana.borraPantalla();
                temperaturasAño.ListarPorFecha();
                ventana.muestra(temperaturasAño.listar());
                break;
            case "listar por temp":
                ventana.borraPantalla();
                temperaturasAño.ListarPorTemp();
                ventana.muestra(temperaturasAño.listar());
                break;
            case "obtener rango":
                RangoLog dialogoRango = new RangoLog(ventana);
                LocalDate fechaIni = dialogoRango.getFechaIni();
                if (fechaIni != null) {
                    LocalDate fechaFin = dialogoRango.getFechaFin();
                    ventana.muestra(temperaturasAño.getRangoTemp(fechaIni, fechaFin));
                }
                break;
            case "maxima y minima":
                try {
                int mes = Integer.parseInt(JOptionPane.showInputDialog(ventana, "Introduce numero del mes: "));
                String nombreMes = LocalDate.of(2020, mes, 1).getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
                nombreMes = nombreMes.substring(0, 1).toUpperCase() + nombreMes.substring(1);
                ventana.muestra("Temperaturas maximas y minimas para el mes de " + nombreMes + ":" + temperaturasAño.getTempMaximaMinima(mes));
            } catch (DateTimeException ex) {
                JOptionPane.showMessageDialog(ventana, "La fecha es incorrecta (Solo valores entre 1 y 12)");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Solo se admiten numeros enteros");
            }
            break;
            case "obtener media":
                if (temperaturasAño.getMedia() != null) {
                    ventana.muestra("La temperatura media es de " + temperaturasAño.getMedia() + "ºC");
                } else {
                    ventana.muestra("No existen temperaturas para realizar la media.");
                }
                break;
            case "eliminar":
                ventana.borraPantalla();
                temperaturasAño.eliminar();
                break;
            default:
                throw new AssertionError();
        }
    }

}
