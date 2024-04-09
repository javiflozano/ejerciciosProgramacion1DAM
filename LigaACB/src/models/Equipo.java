package models;

public class Equipo {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }
    public void incPartidosGanados(){
        this.partidosGanados += 1;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int puntos;
    private int golesFavor;
    private int golesContra;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return String.format("%-15s  %-8s %-10s %-10s %-10s",nombre,puntos,partidosGanados+partidosEmpatados+partidosPerdidos, golesFavor,golesContra);

    }
}
