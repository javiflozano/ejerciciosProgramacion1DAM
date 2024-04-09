package models;

import models.Vuelo;

public abstract class Avion implements Vuelo, Comparable<Avion> {
    int numeroAlas;

    @Override
    public int compareTo(Avion otroAvion) {
        return numeroAlas - otroAvion.numeroAlas;
    }
}
