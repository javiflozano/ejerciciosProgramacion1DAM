package models;

public class Partido {
    
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal.getNombre() + ";" + equipoVisitante.getNombre() + ";" + golesLocal + ";" + golesVisitante +"\n";
    }

    
    public void procesarPartido (){
        if (golesLocal > golesVisitante){
            equipoLocal.ganar();
        } else if (golesLocal == golesVisitante){
            equipoLocal.empatar();
            equipoVisitante.empatar();
        } else {
            equipoVisitante.ganar();
        }
        equipoLocal.sumarGoles(golesLocal,golesVisitante);
        equipoVisitante.sumarGoles(golesVisitante,golesLocal);
    }
}
