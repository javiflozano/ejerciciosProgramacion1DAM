public class Persona implements Comparable<Persona> {
    private String name;
    private int edad;
    private int altura;

    @Override
    public String toString() {
        return name + " edad: " + edad + " altura: " + altura;
    }

    public Persona(String name, int edad, int altura) {
        this.name = name;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.altura - otraPersona.altura;
    }
}
