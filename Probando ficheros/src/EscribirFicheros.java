import java.io.FileWriter;
import java.util.Scanner;

public class EscribirFicheros {
    public static void main(String[] args) {
        try {
            FileWriter ficheroSalida = new FileWriter("salida.txt");
            for (int contador = 0;contador < 11;contador ++){
                ficheroSalida.write(String.valueOf(contador*2));
                ficheroSalida.write("\n");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce despedida");
            ficheroSalida.write(sc.next());
            ficheroSalida.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
