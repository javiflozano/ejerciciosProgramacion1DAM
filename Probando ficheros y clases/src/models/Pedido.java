package models;

import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private String cliente;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Pedido(int numPedido, String cliente, ArrayList<Producto> listaProductos) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
    }
    public Pedido (String linea) {
        String [] registro = linea.split(";");
        ArrayList<Producto> productos = new ArrayList<>();
        for (int contador = 2;contador < registro.length - 1; contador += 2){
            productos.add(new Producto(registro[contador],Float.parseFloat(registro[contador + 1]) ));
        }
        this.numPedido = Integer.parseInt(registro[0]);
        this.cliente = registro[1];
        this.listaProductos = productos;

    }

    private float calcularTotal(){
        float precioTotal = 0;
        for (Producto producto: listaProductos){
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }
    @Override
    public String toString() {
        return "Pedido: " + numPedido + "\n" +
                "Cliente: " + cliente + "\n" +
                "Precio Total: " + calcularTotal();
    }
}
