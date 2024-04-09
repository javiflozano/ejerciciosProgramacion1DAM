package com.iessanalberto.dam1.probandotablas;

public class Persona {
    String nombre;
    String apellidos;
    String domicilio;

    public Persona(String nombre, String apellidos, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
