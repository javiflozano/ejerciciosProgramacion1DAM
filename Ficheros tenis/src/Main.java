import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // Escritura de ficheros
            FileWriter ficheroSalida = new FileWriter("salida.txt");
            // Lectura de ficheros
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("entrada.txt"));
            String linea = ficheroEntrada.readLine();
            while (linea!= null){
                String [] registro = linea.split(";");
                ficheroSalida.write("Te llamas " + registro[0]);
                ficheroSalida.write(" te apellidas " + registro[1]);
                ficheroSalida.write(" y has sacado un " + registro[2] + "\n");

                linea = ficheroEntrada.readLine();
            }
            ficheroSalida.close();
            ficheroEntrada.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }


    }
}