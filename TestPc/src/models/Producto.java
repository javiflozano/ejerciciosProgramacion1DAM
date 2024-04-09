package models;

public abstract class Producto {
    private String referencia;
    private String tipo;
    private String marca;
    private String modelo;
    private float precio;

    public Producto(String referencia,String tipo, String marca, String modelo, float precio) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }
}
