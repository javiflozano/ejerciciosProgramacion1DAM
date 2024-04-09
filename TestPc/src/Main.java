import data.Almacen;
import models.*;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Almacen zaragoza = new Almacen();
        zaragoza.cargarAlmacen();
        zaragoza.cargarPedidos();

        for (Map.Entry<Integer, ArrayList<Producto>> pedido: zaragoza.getPedidos().entrySet()) {
            Ordenador ordenador = new Ordenador();
            for (Producto producto:pedido.getValue()){
                switch (producto.getTipo()){
                    case "Procesador" -> ordenador.setProcesador((Procesador) producto);
                    case "Memoria Ram" -> ordenador.setMemoriaRAM((MemoriaRAM) producto);
                    case "Placa Base" -> ordenador.setPlacaBase((PlacaBase) producto);
                    case "Almacenamineto" -> ordenador.setAlmacenamiento((Almacenamiento) producto);
                    case "Torre" -> ordenador.setTorre((Torre) producto);
                }
            }
        }
    }
}