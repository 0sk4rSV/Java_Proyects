/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class Bombo {

    private ArrayList<Bola> bolasBombo;
    private ArrayList<Bola> bolasSacadas;
    ArrayList<Bola> bolasSacadasTemp;
    Bola bola = new Bola();

    public Bombo() {
        bolasBombo = new ArrayList<>();
        bolasSacadas = new ArrayList<>();
        bolasSacadasTemp = new ArrayList<>();
    }

    public void llenaBombo() {
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                bola = new Bola(fila, columna, bola.getImgCompleta());
                bolasBombo.add(bola);
            }
        }
    }

    public ArrayList<Bola> dameBolasBombo() {
        return bolasBombo;
    }

    public ArrayList<Bola> dameBolasSacadas() {
        return bolasSacadas;
    }

    public ArrayList<Bola> sacaBola() {
        ArrayList<Bola> bolaSacada = new ArrayList<>();
        Collections.shuffle(bolasBombo);
        bolasSacadas.add(bolasBombo.get(0));
        bolaSacada.add(bolasBombo.get(0));
        bolasBombo.remove(0);
        return bolaSacada;
    }
    
    public ArrayList<Bola> sacaNBolas(int numBolas) {
        ArrayList<Bola> bolasSacadasTemp = new ArrayList<>();
        for (int i = 0; i < numBolas; i++) {
            Collections.shuffle(bolasBombo);
            bolasSacadas.add(bolasBombo.get(0));
            bolasSacadasTemp.add(bolasBombo.get(0));
            bolasBombo.remove(0);
        }
        return bolasSacadasTemp;
    }

    public void borraBombo() {
        bolasBombo.clear();
    }

}
