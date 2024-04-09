package models;

import java.util.Objects;

public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int puntos;
    private int golesFavor;
    private int golesContra;
    private int partidosGanados;


    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
    public void ganar(){
        this.puntos +=3;
        this.partidosGanados++;
    }
    public void empatar(){
        this.puntos +=1;
    }
    public void sumarGoles(int golesFavor, int golesContra){
        this.golesFavor += golesFavor;
        this.golesContra += golesContra;
    }

    @Override
    public int compareTo(Equipo equipo) {

        if (puntos != equipo.getPuntos()){
            return puntos - equipo.getPuntos();
        } else if (golesContra - golesFavor != equipo.getGolesContra() - equipo.getGolesFavor()){
            return golesContra - golesFavor - (equipo.getGolesContra() - equipo.getGolesFavor());
        } else if (partidosGanados != equipo.getPartidosGanados()){
            return partidosGanados - equipo.getPartidosGanados();
        } else return this.nombre.compareTo(equipo.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo equipo)) return false;
        return Objects.equals(getNombre(), equipo.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}
