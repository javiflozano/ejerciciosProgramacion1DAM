import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Paciente paco = new Paciente("Paco","Pérez",new ArrayList<String>());

        paco.addEnfermedad("Otitis");
        paco.addEnfermedad("Apendicitis");

        System.out.println(paco.toString());

        paco.deleteEnfermedades("Apendicitis");
        System.out.println(paco.toString());
    }
}