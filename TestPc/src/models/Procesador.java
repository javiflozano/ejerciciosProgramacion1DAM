package models;

public class Procesador extends Producto {
    private float velocidad;
    private int memoriaMinima;
    private int memoriaMaxima;

    public Procesador(String referencia,String tipo, String marca, String modelo, float precio, float velocidad, int memoriaMinima, int memoriaMaxima) {
        super(referencia,tipo, marca, modelo, precio);
        this.velocidad = velocidad;
        this.memoriaMinima = memoriaMinima;
        this.memoriaMaxima = memoriaMaxima;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getMemoriaMinima() {
        return memoriaMinima;
    }

    public int getMemoriaMaxima() {
        return memoriaMaxima;
    }
}
