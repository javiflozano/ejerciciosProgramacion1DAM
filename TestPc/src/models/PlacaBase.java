package models;

import java.util.ArrayList;

public class PlacaBase extends Producto{
    private int memoriaMaxima;
    private float velocidad;
    private String [] factoresForma;

    public PlacaBase(String referencia, String tipo, String marca, String modelo, float precio, int memoriaMaxima, float velocidad, String[] factoresForma) {
        super(referencia, tipo, marca, modelo, precio);
        this.factoresForma = factoresForma;
        this.memoriaMaxima = memoriaMaxima;
        this.velocidad = velocidad;
    }

    public int getMemoriaMaxima() {
        return memoriaMaxima;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String[] getFactoresForma() {
        return factoresForma;
    }
}