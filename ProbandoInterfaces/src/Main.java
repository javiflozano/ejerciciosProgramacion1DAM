import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana", 56,171);
        Persona paco = new Persona("Paco", 73,180);
        Persona alicia = new Persona("Alicia", 63,160);

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(ana);
        listaPersonas.add(paco);
        listaPersonas.add(alicia);

        Collections.sort(listaPersonas);
        Collections.reverse(listaPersonas);

        for(Persona persona: listaPersonas){
            System.out.println(persona);
        }

    }
}