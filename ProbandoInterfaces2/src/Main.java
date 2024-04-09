import models.AvionAReaccion;
import models.Persona;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(new Persona("Ana","Pérez", "Gómez"));
        miLista.add(new Persona("Bea","García","Fernández"));
        Collections.sort(miLista);

    }
}