package models;

public class Producto {
    private String nombre;

    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public float getPrecio() {
        return precio;
    }
}
