/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import static oovv.Temperatura.DTF;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Temperaturas implements Iterable<Temperatura> {

    private List<Temperatura> listaTemperaturas;

    public Temperaturas() {
        listaTemperaturas = new ArrayList<>();
    }

    public Temperatura getTemperatura(int index) {
        return listaTemperaturas.get(index);
    }

    public void setTemperatura(int index, Temperatura temp) {
        listaTemperaturas.set(index, temp);
    }

    public boolean añadir(Temperatura temp) {
        if (listaTemperaturas.size() != 0
                && listaTemperaturas.get(0).getFecha().getYear() != temp.getFecha().getYear()) {
            return false;
        }
        for (Temperatura unaTemp : listaTemperaturas) {
            if (unaTemp.getFecha().equals(temp.getFecha())) {
                unaTemp.setTemp(temp.getTemp());
                return true;
            }
        }
        listaTemperaturas.add(temp);
        Collections.sort(listaTemperaturas, new OrdPorFechas());
        return true;
    }

    public boolean modificar(Temperatura temp) {
        for (Temperatura unaTemp : listaTemperaturas) {
            if (unaTemp.getFecha().equals(temp.getFecha())) {
                unaTemp.setTemp(temp.getTemp());
                return true;
            }
        }
        return false;
    }

    public void ListarPorFecha() {
        Collections.sort(listaTemperaturas, new OrdPorFechas());
    }

    public void ListarPorTemp() {
        Collections.sort(listaTemperaturas, new OrdPorTemp());
    }

    public String listar() {
        StringBuilder cad = new StringBuilder("------------------------- LISTADO COMPLETO -------------------------\n\n");
        for (Temperatura unaTemp : listaTemperaturas) {
            cad.append(unaTemp.toString()).append("\n");
        }
        return cad.toString();
    }

    public String getRangoTemp(LocalDate fechaIni, LocalDate fechaFin) {
        if (fechaIni.compareTo(fechaFin) > 0) {
            LocalDate tmp = fechaFin;
            fechaFin = fechaIni;
            fechaIni = tmp;
        }
        StringBuilder cad = new StringBuilder("-------- LISTADO DESDE " + fechaIni.format(DTF) + " HASTA " + fechaFin.format(DTF) + " --------\n\n");
        int cont = 0;
        for (Temperatura unaTemp : listaTemperaturas) {
            if (unaTemp.getFecha().compareTo(fechaIni) >= 0 && unaTemp.getFecha().compareTo(fechaFin) <= 0) {
                cad.append(unaTemp + "\n");
                cont++;
            }
        }
        if (cont != 0) {
            return cad.toString() + "\n" + "Se han devuelto " + cont + " temperaturas";
        }
        return "No existen datos para este rango de fechas";
    }

    public String getTempMaximaMinima(int mes) {

        List<Temperatura> listaTempsMes = new ArrayList<>();
        for (Temperatura unaTemp : listaTemperaturas) {
            if (unaTemp.getFecha().getMonthValue() == mes) {
                listaTempsMes.add(unaTemp);
            }
        }
        if (listaTempsMes.isEmpty()) {
            return "\n\nNo hay datos para este mes";
        }

        Collections.sort(listaTempsMes, new OrdPorTemp());
        double tempMinima = listaTempsMes.get(listaTempsMes.size() - 1).getTemp();
        double tempMaxima = listaTempsMes.get(0).getTemp();
        return "\n\nTemperatura maxima de " + tempMaxima + "ºC\nTemperatura minima de " + tempMinima + "ºC";
    }

    public Double getMedia() {
        if (listaTemperaturas.size() == 0) {
            return null;
        }
        double suma = 0;
        
        //Iteracion con la interfez Iterable que hemos definido en la subclase.
        for (Iterator<Temperatura> iterator = listaTemperaturas.iterator(); iterator.hasNext();) {
            Temperatura temp = iterator.next();
            suma += temp.getTemp();
        }
        
//        for (Temperatura unaTemp : listaTemperaturas) {
//            suma += unaTemp.getTemp();
//        }
        return suma / listaTemperaturas.size();
    }

    public void eliminar() {
        listaTemperaturas.clear();
    }

    
    //Creacion y definicion de la clase interna Iterator :
    @Override
    public Iterator<Temperatura> iterator() {
        return new IteradorDeTemperatura();

    }

    private class IteradorDeTemperatura implements Iterator<Temperatura> {

        protected int posicion;

        public IteradorDeTemperatura() {
            posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return posicion < listaTemperaturas.size();
        }

        @Override
        public Temperatura next() {
            posicion++;
            return getTemperatura(posicion - 1);
        }

        @Override
        public void remove() {
            setTemperatura(posicion - 1, new Temperatura(0, ""));
        }
    }

}
