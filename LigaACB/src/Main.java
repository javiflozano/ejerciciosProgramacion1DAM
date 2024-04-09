import models.Equipo;
import models.Partido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Partido> liga = new ArrayList<>();
        Map<String, Equipo> misEquipos = new HashMap<>();
        cargarMisEquipos(misEquipos);
        cargarPartidos(liga,misEquipos);


        for (Partido partido:liga){
            // Añado 3 puntos por victoria, 1 por empate y 0 por derrota
            if (partido.getGolesLocal() > partido.getGolesVisitante()){
                partido.getEquipoLocal().incPartidosGanados();
                // TODO gestionar puntos, goles favor, goles contra
            }

        }
        System.out.println(String.format("%-15s  %-8s %-10s %-10s %-10s","Equipo", "Puntos", "Partidos", "Goles favor","Goles contra"));
        System.out.println("-".repeat(50));

        System.out.println(misEquipos.get("Real Madrid").toString());
    }

    private static void cargarMisEquipos(Map<String, Equipo> misEquipos) {
        misEquipos.put("Real Madrid",new Equipo("Real Madrid"));
        misEquipos.put("FC Barcelona",new Equipo("FC Barcelona"));
        misEquipos.put("Milan AC",new Equipo("Milan AC"));
        misEquipos.put("Huesca",new Equipo("Huesca"));
        misEquipos.put("Arsenal",new Equipo("Arsenal"));
        misEquipos.put("Bayern Munich",new Equipo("Bayern Munich"));
    }

    private static void cargarPartidos(ArrayList<Partido> liga, Map<String, Equipo> misEquipos) {
        liga.add(new Partido(misEquipos.get("Real Madrid"),misEquipos.get("FC Barcelona"),3,2));
        liga.add(new Partido(misEquipos.get("Milan AC"),misEquipos.get("FC Barcelona"),3,4));
        liga.add(new Partido(misEquipos.get("Real Madrid"),misEquipos.get("Milan AC"),3,3));
        liga.add(new Partido(misEquipos.get("Huesca"),misEquipos.get("FC Barcelona"),3,2));

    }
}