package com.iessanalberto.dam1.javiflozano.javabattle.model;

public class Personaje {
    private String name;
    private int atack;
    private int defense;
    private int life;

    public Personaje(String name, int atack, int defense, int life) {
        this.name = name;
        this.atack = atack;
        this.defense = defense;
        this.life = life;
    }
    public String atacar(Personaje enemy){
        int ataque = atack + atack * (int) (Math.random()*11);
        if ( ataque > enemy.defense){
            enemy.life -= 10;
            return "Tú ganas";
        } else if (ataque == enemy.defense) return "Empate";
        else {
            life -= 5;
            return "Tú pierdes";
        }
    }
}
