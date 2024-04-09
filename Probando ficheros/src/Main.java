import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void procesar(String linea) {
        String [] lineaTroceada = linea.split(";");
        System.out.println("El Sr/Sra. " + lineaTroceada[0] + " ha sacado un " + lineaTroceada[1] + " y también un " + lineaTroceada[2]);
        System.out.println("La media es: " + (Integer.parseInt(lineaTroceada[1]) + Integer.parseInt(lineaTroceada[2]) )/2.0);
    }
}