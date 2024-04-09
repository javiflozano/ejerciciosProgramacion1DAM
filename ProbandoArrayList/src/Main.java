/***
 *  Adivina un número del 1 al 100 en 10 intentos
 *  VERSIÓN 2.0 Con opción de volver a jugar e indicando si el número es mayor o menor
 *  Author: Javi F.Lozano
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        final int LIMITE_INTENTOS = 10;
        boolean jugando = true;
        // Inicio programa
        while (jugando) {
            System.out.println("Adivina en qué número estoy pensando (del 1 al 100)");
            int numeroSecreto = (int) (Math.random() * 100 + 1);  // Obtenemos el número aleatorio entre 100 y 1 incluídos
            int numeroPlayer = 0;
            int numeroIntentos = 1;
            System.out.println("Introduce número: ");
            numeroPlayer = sc.nextInt();
            while (numeroSecreto != numeroPlayer && numeroIntentos < LIMITE_INTENTOS) {
                if (numeroSecreto < numeroPlayer) {
                    System.out.println("No es correcto, el número secreto es menor. Introduce número: ");
                } else {
                    System.out.println("No es correcto, el número secreto es mayor. Introduce número: ");
                }
                numeroPlayer = sc.nextInt();
                numeroIntentos++;
            }
            if (numeroSecreto != numeroPlayer) {
                System.out.println("Lo siento has superado el número máximo de intentos");
            } else {
                System.out.println("Acertaste, el número secreto era " + numeroSecreto);
            }
            System.out.println("¿Quieres volver a jugar S/N");
            if (sc.next().equals("N")) jugando = false;
        }
    }
}