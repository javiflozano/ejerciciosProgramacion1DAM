package models;

public class AvionAReaccion  extends Avion{
    private int numeroMotores;
    @Override
    public void despegar() {
        System.out.println("Hacia arriba a toda velocidad");
    }

    @Override
    public void volar() {
        System.out.println("Volar haciendo ruido");
    }

    @Override
    public void aterrizar() {
        System.out.println("Pista para aterrizar");
    }


    public AvionAReaccion(int numeroAlas) {
        super.numeroAlas = numeroAlas;
    }
}
