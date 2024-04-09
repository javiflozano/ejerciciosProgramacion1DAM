package models;

public class Producto {
    private String referencia;
    private float peso;
    private float precio;

    public Producto(String referencia, float peso, float precio) {
        this.referencia = referencia;
        this.peso = peso;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }
}
