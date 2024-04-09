import java.util.Scanner;

public class NonesFunciones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean jugando = true;
        final int LIMITE_PARTIDAS = 3;
        int numPartidasPlayer = 0;
        int numPartidasEnemy = 0;
        while (jugando){
            while(numPartidasEnemy < LIMITE_PARTIDAS && numPartidasPlayer < LIMITE_PARTIDAS){
                boolean ganaPlayer = jugar();
                if (ganaPlayer){
                    System.out.println("Tú ganas");
                    numPartidasPlayer++;
                } else {
                    System.out.println("Tú pierdes");
                    numPartidasEnemy++;
                }
            }
            System.out.println("¿Desea seguir jugando S/N");
            if (sc.next().equals("N")){
                jugando = false;
            } else {
                numPartidasEnemy = 0;
                numPartidasPlayer = 0;
            }
        }
    }

    private static boolean jugar() {
        System.out.println("Elige pares o nones");
        String paresNones = sc.next();
        System.out.println("Saca un número entre 0 y 3");
        int numeroPlayer = sc.nextInt();
        int numeroEnemy = (int) (Math.random()*4);
        int suma = numeroEnemy + numeroPlayer;
        System.out.println("Yo saco " + numeroEnemy + " suman " + suma);
        if (suma%2 == 0) {
            return paresNones.equals("pares");
        } else {
            return paresNones.equals("nones");
        }
    }
}
