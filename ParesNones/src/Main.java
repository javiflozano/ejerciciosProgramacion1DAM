import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        boolean jugando = true;
        Scanner sc = new Scanner(System.in);
        String seguirJugando;
        int numPartidasPlayer = 0;
        int numPartidasEnemy = 0;
        String paresNones;
        int numeroPlayer;
        int numeroEnemy;
        int suma;

        while(jugando){
            while(numPartidasEnemy < 3 && numPartidasPlayer < 3){
                System.out.println("Elige pares o nones");
                paresNones = sc.next();
                System.out.println("Saca un número entre 0 y 3");
                numeroPlayer = sc.nextInt();
                numeroEnemy = (int) (Math.random()*4);
                suma = numeroEnemy + numeroPlayer;
                System.out.println("Yo saco " + numeroEnemy + " suman " + suma);
                if (suma%2 == 0) {
                    if (paresNones.equals("pares")){
                        System.out.println("Salen pares tú ganas");
                        numPartidasPlayer++;
                    } else {
                        System.out.println("Salen pares tú pierdes");
                        numPartidasEnemy++;
                    }
                } else {
                    if (paresNones.equals("nones")){
                        System.out.println("Salen nones, tú ganas");
                        numPartidasPlayer++;
                    } else {
                        System.out.println("Salen nones, tú pierdes");
                        numPartidasEnemy++;
                    }
                }
                System.out.println("Partidas player: " + numPartidasPlayer + ". Partidas Enemy: " +numPartidasEnemy);
            }
            if (numPartidasPlayer == 3){
                System.out.println("Has ganado");
            } else {
                System.out.println("Has perdido");
            }
            System.out.println("¿Quieres seguir jugando ¿S/N?");
            seguirJugando = sc.next();
            if (seguirJugando.equals("N")){
                jugando = false;
            } else {
                numPartidasPlayer = 0;
                numPartidasEnemy = 0;
            }
        }
    }

    private static void jugar() {

    }
}