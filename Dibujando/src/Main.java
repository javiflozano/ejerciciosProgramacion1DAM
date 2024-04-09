import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura del triángulo");
        int altura = sc.nextInt();
        int incremento = 1;
        for (int contador = 1; contador > 0; contador += incremento){
            dibujaLinea(contador);
            if (altura == contador) incremento = -1;
        }

        for (int contador = 1; contador <= altura; contador++){
            imprimeLinea(altura - contador,contador);
        }


    }
    private static void imprimeLinea(int numeroEspacios, int numeroX){
        for (int index = 1;index <= numeroEspacios; index ++){
            System.out.print(" ");
        }
        for (int index = 1;index <= numeroX; index ++){
            System.out.print("X");
        }
        for (int index = 1;index <= numeroEspacios; index ++){
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void dibujaLinea(int contador) {
        for (int index = 1; index <= contador; index++){
            System.out.print('X');
        }
        System.out.println();
    }
}