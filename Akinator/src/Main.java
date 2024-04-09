import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        String respuesta;
        // Inicio del programa
        System.out.println("Bienvenido a Akinator, voy a adivinar quién eres");
        System.out.println("¿Tienes gafas?");
        respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("Sí")){
            // Tiene gafas
            System.out.println("¿Tienes barba?");
            respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("Sí")) {
                System.out.println("Eres Carlos");
            } else {
                // Tienes gafas, no tienes barba
                System.out.println("¿Eres español?");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Sí")){
                    System.out.println("¿Eres repetidor?");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("Sí")){
                        System.out.println("Eres Hugo");
                    } else {
                        System.out.println("Eres David");
                    }
                } else {
                    System.out.println("Eres Ayoub");
                }
            }
        } else {
            // No tiene gafas
            System.out.println("¿Eres mujer?");
            respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("Sí")){
                System.out.println("Eres Pilar");
            } else {
                // NO es mujer
                System.out.println("¿Eres rubio");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Sí")){
                    System.out.println("¿Tienes el pelo largo?");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("Sí")){
                        System.out.println("Eres Ches");
                    } else{
                        // No tienes el pelo largo
                        System.out.println("¿Tienes más de 24 años?");
                        respuesta = sc.next();
                        if (respuesta.equalsIgnoreCase("Sí")){
                            System.out.println("Eres Juan");
                        } else {
                            System.out.println("Eres Fran");
                        }
                    }
                } else {
                    //No eres rubio
                    System.out.println("¿Eres profesor?");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("Sí")){
                        System.out.println("Eres Javi");
                    } else {
                        System.out.println("Eres Rodolfo");
                    }
                }
            }

        }
    }
}