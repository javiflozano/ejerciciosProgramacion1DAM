import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("entrada.txt"));
            String linea = ficheroEntrada.readLine();
            while (linea != null){
                Arrays.stream(linea.split(";")).filter(s -> s.contains("b")).forEach(System.out::println);
                linea = ficheroEntrada.readLine();
            }
            ficheroEntrada.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}