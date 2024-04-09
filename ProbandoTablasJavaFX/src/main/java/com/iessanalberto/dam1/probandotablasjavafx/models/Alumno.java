package com.iessanalberto.dam1.probandotablasjavafx.models;

import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private String nombre;
    private String apellido;
    private Map<String,Integer> mapaNotas = new HashMap<>();
    private int numSuspensos;
    private double media;

    public Alumno(String nombre, String apellido, int notaBD, int notaProgramacion, int notaEntornos, int notaIngles, int notaSistemas, int notaLenguajes, int notaFOL) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mapaNotas.put("Bases de Datos",notaBD);
        this.mapaNotas.put("Programación", notaProgramacion);
        this.mapaNotas.put("Entornos de desarrollo", notaEntornos);
        this.mapaNotas.put("Sistemas Informáticos", notaSistemas);
        this.mapaNotas.put("Lenguajes de marcas", notaLenguajes);
        this.mapaNotas.put("Inglés", notaIngles);
        this.mapaNotas.put("FOL", notaFOL);

        // Calculamos la media y el número de suspensos
        int mediaAux = 0;
        int suspensos = 0;
        for (Map.Entry<String,Integer> nota: mapaNotas.entrySet()){
            if (nota.getValue() < 5) suspensos++;
            mediaAux += nota.getValue();
        }
        this.numSuspensos = suspensos;
        this.media = mediaAux / mapaNotas.size();

        // Otra opción: Empleando Stream()
        /*
        this.numSuspensos = (int) mapaNotas.entrySet().stream().mapToInt(nota -> nota.getValue()).filter(nota -> nota < 5).count();
        this.media =
                mapaNotas.entrySet().stream().mapToInt(nota -> nota.getValue()).average().orElse(0);
        */
    }

}
