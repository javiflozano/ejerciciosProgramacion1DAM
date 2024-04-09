import models.Pedido;
import models.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Producto> almacen = new HashMap<>();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();


        cargarAlmacen(almacen);
        cargarPedidos(listaPedidos,almacen);
        for (Pedido pedido: listaPedidos){
            System.out.println(pedido.imprimirEtiqueta());
        }
    }

    private static void cargarPedidos(ArrayList<Pedido> listaPedidos, Map<String, Producto> almacen) {
        listaPedidos.add(new Pedido("Envío","Paseo La Corona 2",
                new ArrayList<Producto>(Arrays.asList(almacen.get("REF-01"),
                        almacen.get("REF-02")))
                ));
    }

    private static void cargarAlmacen(Map<String, Producto> almacen) {
        almacen.put("REF-01",new Producto("REF-01",3,21.45f));
        almacen.put("REF-02",new Producto("REF-01",31,25.45f));
    }
}