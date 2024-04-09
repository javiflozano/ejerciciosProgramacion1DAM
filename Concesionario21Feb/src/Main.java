import models.Concesionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Concesionario> listaConcesionarios = new ArrayList<>();
        try {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("concesionario.txt"));
            String linea = ficheroEntrada.readLine();
            while (linea != null){
                listaConcesionarios.add(new Concesionario(linea));
                linea = ficheroEntrada.readLine();
            }
            ficheroEntrada.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        Collections.sort(listaConcesionarios);
        try {
            BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter("concesionarioTop.txt"));
            for (int contador = 0;contador < 3; contador++){
                ficheroSalida.write(listaConcesionarios.get(contador).toString());
            }
            ficheroSalida.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }


}