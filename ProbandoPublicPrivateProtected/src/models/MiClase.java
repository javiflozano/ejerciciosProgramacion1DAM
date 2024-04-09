package models;

import java.util.Objects;

public class MiClase {
    public String publica;
    protected String protegida;
    String defecto;
    private String privada;

    public MiClase(String publica) {
        this.publica = publica;
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "publica='" + publica + '\'' +
                ", protegida='" + protegida + '\'' +
                ", defecto='" + defecto + '\'' +
                ", privada='" + privada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MiClase miClase)) return false;
        return Objects.equals(publica, miClase.publica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publica);
    }
}
