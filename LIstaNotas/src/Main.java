import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaraciones
        ArrayList<Integer> listaNotas = new ArrayList<>();
        int notaMaxima = 0;
        int notaMinima = 10;
        int sumaNotas = 0;
        // Añadimos 10 notas del 0 al 10 de manera aleatoria
        for (int contador = 0;contador < 10; contador++){
            listaNotas.add((int) (Math.random()*11));
        }
        // Calculamos la media y las notas máximas y mínimas
        for (int nota: listaNotas ){
            sumaNotas += nota; // Calculamos la suma de todas las notas
            if (nota > notaMaxima) notaMaxima = nota;
            if (nota < notaMinima) notaMinima = nota;
        }
        System.out.println("La nota media es: " + (float) sumaNotas / listaNotas.size());
        System.out.println("La nota máxima es: " + notaMaxima);
        System.out.println("La nota mínima es: "+ notaMinima);
    }
}