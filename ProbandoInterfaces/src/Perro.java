public class Perro extends Animal implements HacerRuido {
    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }
}
