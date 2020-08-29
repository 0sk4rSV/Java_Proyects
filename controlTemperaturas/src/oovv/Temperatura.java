/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Temperatura {

    private double temp;
    private LocalDate fecha;
    public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Temperatura(double temp, String fecha) {
        this.temp = temp;
        this.fecha = LocalDate.parse(fecha, DTF);
    }

    public Temperatura(String fecha) {
        this.fecha = LocalDate.parse(fecha, DTF);
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMes() {
        return fecha.getMonthValue();
    }

    @Override
    public String toString() {
        return String.format("El %s se registro una temperatura maxima de %.2fºC", fecha.format(DTF), temp);
    }

}
