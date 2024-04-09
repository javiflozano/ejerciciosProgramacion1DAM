import java.util.Scanner;

/***AUTHOR: Javi F. Lozano
 * CREATION DATE: 16/10/2023
 * PROGRAMA DE GESTIÓN DE AMAZON SA
 */

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        final int MAXCARGA = 4;
        Scanner sc = new Scanner(System.in);
        String camion [] = new String[MAXCARGA];
        int indicadorCarga = 0;
        int opcion = menu();


        while (opcion != 3){
            switch (opcion){
                case 1 -> {
                    // Opción 1 - Añadir carga
                    if (indicadorCarga < MAXCARGA){
                        System.out.println("Introduce carga");
                        String carga = sc.next();
                        camion [indicadorCarga] = carga;
                        indicadorCarga++;
                    } else System.out.println("El camión está lleno");
                }
                case 2 -> {
                    // Opción 2 - Buscar carga

                }

            }
            opcion = menu();
        }

        System.out.println("Gracias por utilizar nuestro programa");

    }

    private static void anadirCarga() {
    }

    private static int menu() {
        System.out.println("Elige opción: ");
        System.out.println("1.- Añadir carga ");
        System.out.println("2.- Buscar carga");
        System.out.println("3.- Salir ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}