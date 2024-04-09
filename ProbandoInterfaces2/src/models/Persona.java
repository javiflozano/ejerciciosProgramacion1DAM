package models;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Persona(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        if (primerApellido.equals(otraPersona.primerApellido)){
            if (segundoApellido.equals(otraPersona.segundoApellido)){
                return nombre.compareTo(otraPersona.nombre);
            }
            return segundoApellido.compareTo(otraPersona.segundoApellido);
        }
        return primerApellido.compareTo(otraPersona.primerApellido);
    }
}
