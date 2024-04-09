package com.iessanalberto.dam1.javiflozano.holamundojavafx.clases;

public class Personaje {
    private String nombre;
    private int ataque;
    private int defensa;
    private int puntosVida;

    public Personaje(String nombre, int ataque, int defensa, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.puntosVida = puntosVida;
    }

    public Personaje() {
        this.nombre = "Enemy";
        this.ataque = 50 +(int) (Math.random()*50 + 1 );
        this.defensa = 50 +(int) (Math.random()*50 + 1 );
        this.puntosVida = 50 + (int) (Math.random()*50 + 1 );
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
    public boolean atacar(Personaje enemy){
        return (Math.random()*ataque > enemy.defensa * Math.random());
    }
}
