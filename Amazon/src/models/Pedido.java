package models;

import java.util.ArrayList;

public class Pedido {
    private String tipo;
    private String direccion;
    private ArrayList<Producto> listaProductos;
    private int numPaquetes;
    private float peso = 0;
    private float precio = 0;

    public Pedido(String tipo, String direccion, ArrayList<Producto> listaProductos) {
        this.tipo = tipo;
        this.direccion = direccion;
        this.listaProductos = listaProductos;
        this.numPaquetes = listaProductos.size();
        for (Producto producto:listaProductos){
            this.peso+=producto.getPeso();
            this.precio += producto.getPrecio();
        }
    }

    public String imprimirEtiqueta(){
        String respuesta = "";
        if (tipo.equals("Envío")){
            respuesta += "Tipo: " + tipo;
            respuesta += "\nDirección: " + direccion;
            respuesta += "\nNº paquetes: " + numPaquetes;
            respuesta += "\nPrecio: " + precio;


        }


        return respuesta;
    }
}
