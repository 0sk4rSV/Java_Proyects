/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class MisFiguras {

    private List<Figura> misFiguras; // lista de Figura, admite objetos de tipo Figura, Circulo y Rectangulo

    /**
     * Constructor de una instance de <code>Figuras</code>. crea la lista para
     * poder manejar figuras
     *
     */
    public MisFiguras() {
        misFiguras = new ArrayList<>();
    }

    public List<Figura> getMisFiguras() {
        return misFiguras;
    }

    /**
     * añade una figura a la lista.
     *
     * @param figura a añadir
     * @throws MiEX si ya existe una figura en esa posición
     */
    public void añadir(Figura figura) throws MiEX {
        if (misFiguras.contains(figura)) {
            throw new MiEX("ya hay una figura en esa posición ");
        }
        misFiguras.add(figura);
    }

    public List<Figura> creaFigurasRandom() throws MiEX {
        List<Figura> figurasRandom = new ArrayList<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < 10; i++) {
            int tipoF = (int) (Math.random() * 3 + 1);
            if (tipoF == 1) {//circulo
                x = (int) (Math.random() * 50 + 1);
                y = (int) (Math.random() * 50 + 1);
                double radio = Math.round((Math.random() * 10 + 1) * 100) / 100d;
                Circulo cir = new Circulo(radio, x, y);
                if (!misFiguras.contains(cir)) {
                    misFiguras.add(cir);
                    figurasRandom.add(cir);
                } else {
                    i--;
                }
            }
            if (tipoF == 2) {//rectangulo
                x = (int) (Math.random() * 50 + 1);
                y = (int) (Math.random() * 50 + 1);
                double altura = Math.round((Math.random() * 10 + 1) * 100) / 100d;
                double anchura = Math.round((Math.random() * 10 + 1) * 100) / 100d;
                Rectangulo rec = new Rectangulo(altura, anchura, x, y);
                if (!misFiguras.contains(rec)) {
                    misFiguras.add(rec);
                    figurasRandom.add(rec);
                } else {
                    i--;
                }
            }
            if (tipoF == 3) {//cuadrado
                x = (int) (Math.random() * 50 + 1);
                y = (int) (Math.random() * 50 + 1);
                double lado = Math.round((Math.random() * 10 + 1) * 100) / 100d;
                Cuadrado cua = new Cuadrado(lado, x, y);
                if (!misFiguras.contains(cua)) {
                    misFiguras.add(cua);
                    figurasRandom.add(cua);
                } else {
                    i--;
                }
            }
        }
        return figurasRandom;
    }

    /**
     * crea un listado de las figuras. crea una cadena con los toString de las
     * figuras de la lista
     *
     * @return una cadena con las figuras de la lista
     */
    public String getListado() {
        String listado = "";
        for (Figura figura : misFiguras) {
            listado += figura + "\n";
        }
        return listado;
    }

    public String getListadoRandom() throws MiEX {
        String listado = "";
        for (Figura figura : creaFigurasRandom()) {
            listado += figura + "\n";
        }
        return listado;
    }

    /**
     * suma las áreas de las figuras de la lista.
     *
     * @return un double con la suma de las áreas de las figuras de la lista
     */
    public double getSumaAreas() {
        double suma = 0;
        for (Figura miFigura : misFiguras) {
            suma += miFigura.calculaArea();
        }
        return Math.round(suma * 100) / 100d;
    }

    public double getSumaPerimetros() {
        double suma = 0;
        for (Figura miFigura : misFiguras) {
            suma += miFigura.calculaPerimetro();
        }
        return Math.round(suma * 100) / 100d;
    }

    /**
     * elimina una figura de la lista.
     *
     * @param x posición x de la figura
     * @param y posición y de la figura
     * @throws MiEX si no hay ninguna figura en la posición
     */
    public void elimina(int x, int y) throws MiEX {
        for (Figura laFigura : misFiguras) {
            if (laFigura.x == x && laFigura.y == y) {
                misFiguras.remove(laFigura);
                return;
            }
        }
        throw new MiEX("No hay ninguna figura en la posición (" + x + ", " + y + ")");
    }

    /**
     * elimina una figura de la lista. busca la figura en la lista
     *
     * @param figura a eliminar
     * @throws oovv.MiEX si no hay ninguna figura en la posición
     */
    public void elimina(Figura figura) throws MiEX {
        if (!misFiguras.remove(figura)) {
            throw new MiEX("No hay ninguna figura en la posición (" + figura.x + ", " + figura.y + ")");
        }
    }

    public void eliminaRango(double rangoIni, double rangoFin, String tipoRango) {
        List<Figura> figurasRango = new ArrayList<>();
        if (rangoIni > rangoFin) {
            double cRangoIni = rangoIni;
            double cRangoFin = rangoFin;
            rangoFin = cRangoIni;
            rangoIni = cRangoFin;
        }
        if (tipoRango == "area") {
            for (Figura laFigura : misFiguras) {
                if (laFigura.calculaArea() >= rangoIni && laFigura.calculaArea() <= rangoFin) {
                    figurasRango.add(laFigura);
                }
            }
        } else {
            for (Figura laFigura : misFiguras) {
                if (laFigura.calculaPerimetro() >= rangoIni && laFigura.calculaPerimetro() <= rangoFin) {
                    figurasRango.add(laFigura);
                }
            }
        }
        for (Figura laFigura : figurasRango) {
            misFiguras.remove(laFigura);
        }
    }

    public void eliminaTodas() {
        misFiguras.clear();
    }

    public String getAreaMaxMin() {
        List<Figura> figurasOrdPorArea = new ArrayList<>(misFiguras);
        if (figurasOrdPorArea.size() > 0) {
            figurasOrdPorArea.sort(new OrdPorArea().reversed());
            return "La figura con el area mas grande es:\n" + figurasOrdPorArea.get(0) + "\nArea ="
                    + Math.round(figurasOrdPorArea.get(0).calculaArea() * 100) / 100d + "\n\nLa figura con el area mas pequeña es:\n"
                    + figurasOrdPorArea.get(figurasOrdPorArea.size() - 1) + "\nArea ="
                    + Math.round(figurasOrdPorArea.get(figurasOrdPorArea.size() - 1).calculaArea() * 100) / 100d;
        }
        return "Todavia no se han creado figuras.";
    }

    public String getPerimetroMaxMin() {
        List<Figura> figurasOrdPorPerimetro = new ArrayList<>(misFiguras);
        if (figurasOrdPorPerimetro.size() > 0) {
            figurasOrdPorPerimetro.sort(new OrdPorArea().reversed());
            return "La figura con el perimetro mas grande es:\n" + figurasOrdPorPerimetro.get(0) + "\nArea ="
                    + Math.round(figurasOrdPorPerimetro.get(0).calculaPerimetro() * 100) / 100d + "\n\nLa figura con el perimetro mas pequeño es:\n"
                    + figurasOrdPorPerimetro.get(figurasOrdPorPerimetro.size() - 1) + "\nArea ="
                    + Math.round(figurasOrdPorPerimetro.get(figurasOrdPorPerimetro.size() - 1).calculaPerimetro() * 100) / 100d;
        }
        return "Todavia no se han creado figuras.";
    }

    public String sumaFigurasZona(Zona miZona) {
        String cad = "";
        String cadFigurasZona = "\n\nLista de figuras en la zona:\n";
        List<Figura> figurasZona = new ArrayList<>();
        for (Figura laFigura : misFiguras) {
            if ((laFigura.x >= miZona.getXesi() && laFigura.y <= miZona.getYesi())
                    && (laFigura.x <= miZona.getXeid() && laFigura.y >= miZona.getYeid())) {
                figurasZona.add(laFigura);
                cadFigurasZona += laFigura + "\n";
            }
        }
        return cad += "Hay " + figurasZona.size() + ((figurasZona.size() == 1) ? " figura" : " figuras") + " en la "
                + miZona.toString() + cadFigurasZona;
    }

}
