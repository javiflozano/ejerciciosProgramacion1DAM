import models.Alumno;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("entrada.txt"));
            String linea = ficheroEntrada.readLine();
            while (linea != null) {
                procesar(linea);
                linea = ficheroEntrada.readLine();
            }
            ficheroEntrada.close();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    private static void procesar(String linea) {
        Alumno alumno = new Alumno(linea);
        System.out.println(alumno);
    }
}