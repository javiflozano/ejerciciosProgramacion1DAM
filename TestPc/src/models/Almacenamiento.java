package models;

public class Almacenamiento extends Producto{
    private String subTipo;
    private int capacidad;

    public Almacenamiento(String referencia, String tipo, String marca, String modelo, float precio, String subTipo, int capacidad) {
        super(referencia, tipo, marca, modelo, precio);
        this.subTipo = subTipo;
        this.capacidad = capacidad;
    }

    public String getSubTipo() {
        return subTipo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
