import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader ficheroEntrada1 = new BufferedReader(new FileReader("entrada1.txt"));
            BufferedReader ficheroEntrada2 = new BufferedReader(new FileReader("entrada2.txt"));
            FileWriter ficheroSalida = new FileWriter("salida.txt");
            String linea1 = ficheroEntrada1.readLine();
            String linea2 = ficheroEntrada1.readLine();
            while (linea1!= null || linea2 !=null){
                
                String [] registro1 = linea1.split(";");
                String [] registro2 = linea2.split(";");
                ficheroSalida.write(
                        registro1[0] + ";" + registro1[1] + ";" + registro1[2] + ";" + registro2 [1] + "\n"
                );
                linea1 = ficheroEntrada1.readLine();
                linea2 = ficheroEntrada2.readLine();
            }
            ficheroEntrada1.close();
            ficheroEntrada2.close();
            ficheroSalida.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}