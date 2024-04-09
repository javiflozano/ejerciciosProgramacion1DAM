import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa resolver ecuaciones de segundo grado");
        System.out.println("Introduce a");
        float a = sc.nextFloat();
        System.out.println("Introduce b");
        float b = sc.nextFloat();
        System.out.println("Introduce c");
        float c = sc.nextFloat();

        if (a == 0) {
            if (b != 0){
                System.out.println("La única solución es: " + resolverMas(b,c));
            } else {
                if (c == 0) System.out.println("Cualquier número es solución");
                else System.out.println("No hay solución");
            }
        }
        else {
            if (discriminante(a,b,c) > 0) {
                System.out.println("Hay dos soluciones: ");
                System.out.println(resolverMas(a,b,c));
                System.out.println(resolverMenos(a,b,c));
            } else if (discriminante(a,b,c) == 0 ){
                System.out.println("Hay una única solución: ");
                System.out.println(resolverMas(a,b,c));
            } else {
                System.out.println("No hay soluciones enteras");
            }
        }
    }

    private static float discriminante(float a, float b, float c) {
        return b*b - 4*a*c;
    }
    private static double resolverMas(float a, float b, float c) {
        return ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
    }
    private static double resolverMas(float b, float c){
        return (-c / b);
    }

    private static double resolverMenos(float a, float b, float c) {
        return ((-b - Math.sqrt(b*b - 4*a*c))/(2*a));
    }
}