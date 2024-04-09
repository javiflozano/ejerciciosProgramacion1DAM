package models;

public class Torre extends Producto{
    private String factorForma;

    public Torre(String referencia, String tipo, String marca, String modelo, float precio, String factorForma) {
        super(referencia, tipo, marca, modelo, precio);
        this.factorForma = factorForma;
    }

    public String getFactorForma() {
        return factorForma;
    }
}
