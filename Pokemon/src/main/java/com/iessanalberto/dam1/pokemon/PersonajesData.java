package com.iessanalberto.dam1.pokemon;

import java.util.ArrayList;
import java.util.Collections;

public class PersonajesData {
    private ArrayList<Personaje> listaPersonajes = new ArrayList<>();

    public PersonajesData() {
        listaPersonajes.add(new Personaje("Pikachu",98,94,96,89,93));
        listaPersonajes.add(new Personaje("Pepe",97,94,96,89,93));
        listaPersonajes.add(new Personaje("Ana",96,94,96,89,93));
        listaPersonajes.add(new Personaje("Luisa",95,94,96,89,93));
        listaPersonajes.add(new Personaje("MariCarmen",48,94,96,89,93));
        listaPersonajes.add(new Personaje("Juana",38,94,96,89,93));
        listaPersonajes.add(new Personaje("Gloria",28,94,96,89,93));
        listaPersonajes.add(new Personaje("Paco",78,94,96,89,93));
    }
    public ArrayList<Personaje> obtenerPersonajes (int numeroPersonajes){
        Collections.shuffle(listaPersonajes);
        ArrayList<Personaje> personajesAux = new ArrayList<>();
        for (int contador = 0;contador < numeroPersonajes;contador++){
            personajesAux.add(listaPersonajes.get(contador));
        }
        return personajesAux;
    }
}
