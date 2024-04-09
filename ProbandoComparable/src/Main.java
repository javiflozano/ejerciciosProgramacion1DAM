import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Micifu", 3, 4);
        GatoSiames gatoSiames = new GatoSiames("Calcetines", 4,13);
        Perro perro = new Perro("Toby", 4, 6);
        ArrayList<Animal> misMascotas = new ArrayList<>();
        misMascotas.add(gato);
        misMascotas.add(gatoSiames);
        misMascotas.add(perro);

        Collections.sort(misMascotas);
        Collections.reverse(misMascotas);

        for (Animal animal: misMascotas){
            System.out.println(animal.getNombre());
        }
    }
}