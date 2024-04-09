import java.io.FileWriter;

public class EscribiendoFicheros {
    public static void main(String[] args) {
        try {
            FileWriter ficheroSalida = new FileWriter("salida.txt",true);
            ficheroSalida.write("Hola mundo\n");
            ficheroSalida.write("Adiós mundoooo\n");
            ficheroSalida.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
