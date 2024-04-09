import models.Pedido;
import models.Producto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("entrada.txt"));
            String linea = ficheroEntrada.readLine();

            while (linea != null){
                procesar(linea);
                linea = ficheroEntrada.readLine();
            }
            ficheroEntrada.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void procesar(String linea) {
        Pedido pedido = new Pedido(linea);
        System.out.println(pedido);
    }
}