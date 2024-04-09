package models;

public class MemoriaRAM extends Producto{
    private int capacidad;
    private String tipoMemoria;
    public MemoriaRAM(String referencia, String tipo, String marca, String modelo, float precio, int capacidad, String tipoMemoria) {
        super(referencia, tipo, marca, modelo, precio);
        this.capacidad = capacidad;
        this.tipoMemoria = tipoMemoria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }
}
