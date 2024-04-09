package com.iessanalberto.dam1.pokemon;

public class Personaje {
    private String nombre;
    private int puntosSalud;
    private int ataqueFisico;
    private int ataqueEspecial;
    private int defensaFisica;
    private int defensaEspecial;

    public String getNombre() {
        return nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaFisica() {
        return defensaFisica;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public Personaje(String nombre, int puntosSalud, int ataqueFisico, int ataqueEspecial, int defensaFisica, int defensaEspecial) {
        this.nombre = nombre;
        this.puntosSalud = puntosSalud;
        this.ataqueFisico = ataqueFisico;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaFisica = defensaFisica;
        this.defensaEspecial = defensaEspecial;
    }
}
