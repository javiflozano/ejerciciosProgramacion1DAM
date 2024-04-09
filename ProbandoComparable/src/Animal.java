public abstract class Animal implements Comparable<Animal> {
    private String nombre;
    private int numeroPatas;
    private int peso;

    public Animal(String nombre, int numeroPatas, int peso) {
        this.nombre = nombre;
        this.numeroPatas = numeroPatas;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Animal otroAnimal) {
        if (this.numeroPatas == otroAnimal.numeroPatas){
            return this.peso - otroAnimal.peso;
        }
        return this.numeroPatas - otroAnimal.numeroPatas;


    }
}
