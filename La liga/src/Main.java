/***
 * Author:
 * Date:
 * Description:
 * Version:
 * 
 */

import models.Equipo;
import models.Partido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Partido> liga = new ArrayList<>();
        // Cargamos los equipos del fichero "ficheroequipos.txt" al ArrayList "equipos"
        cargarEquipos(equipos);
        // Genera los partidos y los resultados en el ArrayList "liga"
        cargarPartidos(equipos,liga);
        // Guardamos los resultados del Array en el fichero "resultados.txt"
        guardarResultados(liga);
    }

    public static void cargarEquipos(ArrayList<Equipo> equipos) {
        try {
            BufferedReader ficheroEquipos = new BufferedReader(new FileReader("ficheroequipos.txt"));
            String linea = ficheroEquipos.readLine();
            while (linea != null){
                equipos.add(new Equipo(linea));
                linea = ficheroEquipos.readLine();
            }
            ficheroEquipos.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
    private static void cargarPartidos(ArrayList<Equipo> equipos, ArrayList<Partido> liga) {
        Random random = new Random();
        for (Equipo equipoLocal: equipos){
            for (Equipo equipoVisitante: equipos){
                if (!equipoLocal.getNombre().equals(equipoVisitante.getNombre())){
                    liga.add(new Partido(equipoLocal,equipoVisitante, random.nextInt(3), random.nextInt(3) ));
                }
            }
        }
    }
    private static void guardarResultados(ArrayList<Partido> liga) {
        try {
            FileWriter ficheroSalida = new FileWriter("resultados.txt");
            for (Partido partido: liga){
                ficheroSalida.write(partido.toString());
            }
            ficheroSalida.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }

    }
}