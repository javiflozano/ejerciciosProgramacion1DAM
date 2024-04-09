package com.iessanalberto.dam1.loteria.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sorteo {
    // Declaramos las constantes
    private final int NUMERO_CUARTOS = 2;
    private final int NUMERO_QUINTOS = 8;
    private final int NUMERO_PREMIOS = 13;
    private final int PREMIO_GORDO = 400000;
    private final int SEGUNDO_PREMIO = 125000;
    private final int TERCER_PREMIO = 50000;
    private final int CUARTO_PREMIO = 20000;
    private final int QUINTO_PREMIO = 6000;
    private final int PEDREAS = 100;
    private int gordo;
    private int segundo;
    private int tercero;
    private int[] cuartos = new int[NUMERO_CUARTOS];

    private int[] quintos = new int[NUMERO_QUINTOS];


    public Sorteo() {

        ArrayList<Integer> premios = new ArrayList<>();
        while (premios.size() < NUMERO_PREMIOS){
            int numero = (int) (Math.random()*100000);
            if (!premios.contains(numero)){
                premios.add(numero);
            }
        }
        this.gordo = premios.get(0);
        this.segundo = premios.get(1);
        this.tercero = premios.get(2);
        for (int contador = 0;contador < NUMERO_CUARTOS;contador++){
            this.cuartos[contador] = premios.get(3+contador);
        }
        for (int contador = 0;contador < NUMERO_QUINTOS;contador++){
            this.quintos[contador] = premios.get(5+contador);
        }

    }

    public int comprobarDecimo(int decimo){
        if (decimo == this.gordo) return PREMIO_GORDO;
        if (decimo == this.segundo) return SEGUNDO_PREMIO;
        if (decimo == this.tercero) return TERCER_PREMIO;
        if (Arrays.asList(cuartos).contains(decimo)) return CUARTO_PREMIO;
        if (Arrays.asList(quintos).contains(decimo)) return QUINTO_PREMIO;

        return 0;
    }

    @Override
    public String toString() {
        return "Sorteo{" +
                "gordo=" + gordo +
                ", segundo=" + segundo +
                ", tercero=" + tercero +
                ", cuartos=" + Arrays.toString(cuartos) +
                ", quintos=" + Arrays.toString(quintos) +
                '}';
    }

    public int getGordo() {
        return gordo;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getTercero() {
        return tercero;
    }

    public int[] getCuartos() {
        return cuartos;
    }

    public int[] getQuintos() {
        return quintos;
    }
}
