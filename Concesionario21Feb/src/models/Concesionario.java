package models;

public class Concesionario implements Comparable<Concesionario> {
    private String nombre;
    private String ciudad;
    private String responsableVentas;
    private String[] listaMatriculas;
    private String[] listaPrecios;

    public Concesionario(String nombre, String ciudad, String responsableVentas, String[] listaMatriculas, String[] listaPrecios) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.responsableVentas = responsableVentas;
        this.listaMatriculas = listaMatriculas;
        this.listaPrecios = listaPrecios;
    }

    public Concesionario(String linea) {
        String[] registro = linea.split(";");
        this.nombre = registro[0];
        this.ciudad = registro[1];
        this.responsableVentas = registro[2];
        this.listaMatriculas = registro[3].split(",");
        this.listaPrecios = registro[4].split(",");
    }

    public int calcularTotalVentas() {
        int total = 0;
        for (String precio : listaPrecios) {
            total += Integer.parseInt(precio);
        }
        return total;
    }

    public int calcularNumCochesVendidos() {
        return listaMatriculas.length;
    }

    @Override
    public int compareTo(Concesionario otroConcesionario) {
        return otroConcesionario.calcularTotalVentas() - this.calcularTotalVentas();
    }

    @Override
    public String toString() {
        return nombre + ";"
                + ciudad + ";"
                + responsableVentas + ";"
                + calcularNumCochesVendidos() + ";"
                + calcularTotalVentas() + "\n";
    }
}
