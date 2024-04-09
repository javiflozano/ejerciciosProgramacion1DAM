import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alumno hugo = new Alumno("Hugo Jiménez");
        Alumno pilar = new Alumno("Pilar Larrosa");
        Alumno ayoub = new Alumno("Ayoub El Adili");
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(hugo);
        listaAlumnos.add(pilar);
        listaAlumnos.add(ayoub);


        hugo.setNotaBasesDatos(6);
        hugo.setNotaProgramacion(7);
        pilar.setNotaProgramacion(9);
        pilar.setNotaBasesDatos(4);
        ayoub.setNotaBasesDatos(8);
        ayoub.setNotaProgramacion(2);

        for (int contador = 0;contador < listaAlumnos.size();contador++){
            if (listaAlumnos.get(contador).aprobado()){
                System.out.println(listaAlumnos.get(contador).getNombre() + " está aprobado, y su media es: " + listaAlumnos.get(contador).calcularMedia());
            } else {
                System.out.println(listaAlumnos.get(contador).getNombre() + " no está aprobado");
            }
        }

    }
}
