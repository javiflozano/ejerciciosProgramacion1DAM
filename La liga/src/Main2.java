import models.Equipo;
import models.Partido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // Definimos y cargamos los equipos en el mapaEquipos
        TreeMap<String, Equipo> mapaEquipos = new TreeMap<>();
        cargarEquipos(mapaEquipos);

        try {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader("resultados.txt"));
            String linea = ficheroEntrada.readLine();
            while (linea != null) {
                cargarPartidos(mapaEquipos, linea);
                linea = ficheroEntrada.readLine();
            }
            ficheroEntrada.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        mostrarResultados(mapaEquipos);
    }

    private static void mostrarResultados(TreeMap<String, Equipo> mapaEquipos) {
        // Guardamos los equipos en listaEquipos
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        for (Map.Entry<String, Equipo> equipo : mapaEquipos.entrySet()) {
            listaEquipos.add(equipo.getValue());
        }
        // Ordenamos la lista
        Collections.sort(listaEquipos);
        Collections.reverse(listaEquipos);


        for (Equipo equipo: listaEquipos){
            System.out.println(equipo.getNombre() + " " + equipo.getPuntos());
        }

    }

    private static void cargarEquipos(TreeMap<String, Equipo> mapaEquipos) {
        try {
            BufferedReader ficheroEquipos = new BufferedReader(new FileReader("ficheroequipos.txt"));
            String linea = ficheroEquipos.readLine();
            while (linea != null) {
                mapaEquipos.put(linea, new Equipo(linea));
                linea = ficheroEquipos.readLine();
            }
            ficheroEquipos.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void cargarPartidos(TreeMap<String, Equipo> mapaEquipos, String linea) {
        String[] registro = linea.split(";");
        Partido partido =
                new Partido(mapaEquipos.get(registro[0]),
                        mapaEquipos.get(registro[1]),
                        Integer.parseInt(registro[2]),
                        Integer.parseInt(registro[3])
                );
        partido.procesarPartido();
    }

    public static Comparator<Equipo> ordenarEquipos = new Comparator<Equipo>() {
        @Override
        public int compare(Equipo equipoLocal, Equipo equipoVisitante) {
            if (equipoLocal.getPuntos() != equipoVisitante.getPuntos()) {
                return equipoLocal.getPuntos() - equipoVisitante.getPuntos();
            } else if (equipoLocal.getGolesFavor() - equipoLocal.getGolesFavor() != equipoVisitante.getGolesContra() - equipoVisitante.getGolesFavor()) {
                return equipoLocal.getGolesFavor() - equipoLocal.getGolesContra() - (equipoVisitante.getGolesContra() - equipoVisitante.getGolesFavor());
            } else if (equipoLocal.getPartidosGanados() != equipoVisitante.getPartidosGanados()) {
                return equipoLocal.getPartidosGanados() - equipoVisitante.getPartidosGanados();
            } else return equipoLocal.getNombre().compareTo(equipoVisitante.getNombre());

        }
    };

}
