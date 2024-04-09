import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private String apellidos;
    private ArrayList<String> enfermedades;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public Paciente(String nombre, String apellidos, ArrayList<String> enfermedades) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.enfermedades = enfermedades;
    }

    @Override
    public String toString() {
        return "Paciente: \nº" +
                "   Nombre; " + nombre + "\n" +
                "   Apellidos: " + apellidos + "\n" +
                "   Enfermedades: " + enfermedades +
                "   Nº enfermedades: " + enfermedades.size();
    }

    public void addEnfermedad(String enfermedad){
        enfermedades.add(enfermedad);
    }    
    public void deleteEnfermedades(String enfermedad){
        enfermedades.remove(enfermedad);
    }
}
