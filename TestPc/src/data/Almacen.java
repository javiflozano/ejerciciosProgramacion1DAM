package data;

import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Almacen {
    private Map<String, Producto> almacen = new HashMap<>();
    private Map<Integer,ArrayList<Producto>> pedidos = new HashMap<>();

    public Map<String, Producto> getAlmacen() {
        return almacen;
    }

    public Map<Integer, ArrayList<Producto>> getPedidos() {
        return pedidos;
    }

    public void cargarAlmacen(){
        almacen.put("REF-01", new Procesador("REF-01", "Procesador", "Intel", "i7-8700K", 350, 3.7f, 8, 64));
        almacen.put("REF-02", new Procesador("REF-02", "Procesador", "Intel", "i7-7700K", 300, 4.2f, 8, 64));
        almacen.put("REF-03", new Procesador("REF-03", "Procesador", "Intel", "i5-7600K", 250, 3.8f, 8, 64));
        almacen.put("REF-04", new Procesador("REF-04", "Procesador", "Intel", "i5-6600K", 200, 3.5f, 8, 64));
        almacen.put("REF-05", new Procesador("REF-05", "Procesador", "Intel", "i3-6100", 150, 3.7f, 8, 64));
        almacen.put("REF-06", new Procesador("REF-06", "Procesador", "AMD", "Ryzen 7 1800X", 350, 3.6f, 8, 64));
        almacen.put("REF-07", new Procesador("REF-07", "Procesador", "AMD", "Ryzen 7 1700X", 300, 3.4f, 8, 64));
        almacen.put("REF-08", new Procesador("REF-08", "Procesador", "AMD", "Ryzen 5 1600X", 250, 3.6f, 8, 64));
        almacen.put("REF-09", new Procesador("REF-09", "Procesador", "AMD", "Ryzen 5 1500X", 200, 3.5f, 8, 64));
        almacen.put("REF-10", new Procesador("REF-10", "Procesador", "AMD", "Ryzen 3 1300X", 150, 3.5f, 8, 64));
        almacen.put("REF-11", new MemoriaRAM("REF-11", "Memoria RAM", "Corsair", "Vengeance LPX", 100, 8, "DDR4"));
        almacen.put("REF-12", new MemoriaRAM("REF-12", "Memoria RAM", "Corsair", "Vengeance LPX", 150, 16, "DDR4"));
        almacen.put("REF-13", new MemoriaRAM("REF-13", "Memoria RAM", "Corsair", "Vengeance LPX", 200, 32, "DDR4"));
        almacen.put("REF-14", new MemoriaRAM("REF-14", "Memoria RAM", "Corsair", "Vengeance LPX", 250, 64, "DDR4"));
        almacen.put("REF-15", new MemoriaRAM("REF-15", "Memoria RAM", "Corsair", "Vengeance LPX", 300, 128, "DDR4"));
        almacen.put("REF-16", new MemoriaRAM("REF-16", "Memoria RAM", "Corsair", "Vengeance LPX", 100, 8, "DDR3"));
        almacen.put("REF-17", new Almacenamiento("REF-17", "Almacenamiento", "Samsung", "150 EVO", 100, "SSD", 48));
        almacen.put("REF-18", new Almacenamiento("REF-18", "Almacenamiento", "Samsung", "850 EVO", 150, "SSD", 500));
        almacen.put("REF-19", new Almacenamiento("REF-19", "Almacenamiento", "Samsung", "850 EVO", 200, "SSD", 1000));
        almacen.put("REF-20", new Almacenamiento("REF-20", "Almacenamiento", "Samsung", "850 EVO", 250, "M.2", 240));
        almacen.put("REF-21", new Almacenamiento("REF-21", "Almacenamiento", "Samsung", "850 EVO", 100, "HDD", 500));
        almacen.put("REF-22", new Almacenamiento("REF-22", "Almacenamiento", "Samsung", "850 EVO", 150, "HDD", 1000));
        almacen.put("REF-23", new Almacenamiento("REF-23", "Almacenamiento", "Kingston", "HDD SM", 50, "HDD", 48));
        almacen.put("REF-24", new Almacenamiento("REF-24", "Almacenamiento", "Kingston", "HDD SM", 100, "HDD", 100));
        almacen.put("REF-25", new Torre("REF-25", "Torre", "Corsair", "Carbide 100R", 50, "ATX"));
        almacen.put("REF-26", new Torre("REF-26", "Torre", "Corsair", "Carbide 200R", 100, "ATX"));
        almacen.put("REF-27", new Torre("REF-27", "Torre", "Corsair", "Carbide 300R", 150, "ATX"));
        almacen.put("REF-28", new Torre("REF-28", "Torre", "Corsair", "Carbide 400R", 200, "Nano-ATX"));
        almacen.put("REF-29", new Torre("REF-29", "Torre", "Corsair", "Carbide 500R", 250, "Mini-ATX"));
        almacen.put("REF-30", new Torre("REF-30", "Torre", "Corsair", "Carbide 600R", 300, "Nano-ATX"));
        almacen.put("REF-31", new Torre("REF-31", "Torre", "Corsair", "Carbide 700R", 350, "ATX"));
        almacen.put("REF-32", new Torre("REF-32", "Torre", "Corsair", "Carbide 800R", 400, "ATX"));
        almacen.put("REF-33", new Torre("REF-33", "Torre", "Corsair", "Carbide 900R", 450, "Mini-ATX"));
        almacen.put("REF-34", new PlacaBase("REF-34", "Placa Base", "Intel", "Prime Z270-A", 150, 128, 3.2f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-35", new PlacaBase("REF-35", "Placa Base", "Intel", "Prime Z270-A", 200, 48, 3.1f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-36", new PlacaBase("REF-36", "Placa Base", "Intel", "Prime Z270-A", 250, 16, 3.5f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-37", new PlacaBase("REF-37", "Placa Base", "AMD", "Prime Z270-A", 300, 64, 2.1f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-38", new PlacaBase("REF-38", "Placa Base", "AMD", "Prime Z270-A", 350, 128, 2.9f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-39", new PlacaBase("REF-39", "Placa Base", "Intel", "Prime Z270-A", 400, 16, 3.4f, new String[]{"ATX", "Nano-ATX"}));
        almacen.put("REF-40", new PlacaBase("REF-40", "Placa Base", "AMD", "Prime Z270-A", 450, 64, 4, new String[]{"ATX", "Mini-ATX"}));

    }

    public void cargarPedidos(){
        pedidos.put(1,new ArrayList<>(Arrays.asList(almacen.get("REF-01"),almacen.get("REF-11"),almacen.get("REF-21"),almacen.get("REF-31"),almacen.get("REF-34"))));
        pedidos.put(2,new ArrayList<>(Arrays.asList(almacen.get("REF-02"),almacen.get("REF-12"),almacen.get("REF-22"),almacen.get("REF-32"),almacen.get("REF-35"))));
        pedidos.put(3,new ArrayList<>(Arrays.asList(almacen.get("REF-03"),almacen.get("REF-13"),almacen.get("REF-23"),almacen.get("REF-33"),almacen.get("REF-36"))));
        pedidos.put(4,new ArrayList<>(Arrays.asList(almacen.get("REF-04"),almacen.get("REF-14"),almacen.get("REF-24"),almacen.get("REF-25"),almacen.get("REF-37"))));
        pedidos.put(5,new ArrayList<>(Arrays.asList(almacen.get("REF-05"),almacen.get("REF-15"),almacen.get("REF-17"),almacen.get("REF-26"),almacen.get("REF-38"))));
        pedidos.put(6,new ArrayList<>(Arrays.asList(almacen.get("REF-06"),almacen.get("REF-16"),almacen.get("REF-18"),almacen.get("REF-26"),almacen.get("REF-39"))));
        pedidos.put(7,new ArrayList<>(Arrays.asList(almacen.get("REF-07"),almacen.get("REF-15"),almacen.get("REF-19"),almacen.get("REF-27"),almacen.get("REF-40"))));
        pedidos.put(8,new ArrayList<>(Arrays.asList(almacen.get("REF-08"),almacen.get("REF-16"),almacen.get("REF-20"),almacen.get("REF-28"),almacen.get("REF-36"))));
        pedidos.put(9,new ArrayList<>(Arrays.asList(almacen.get("REF-09"),almacen.get("REF-12"),almacen.get("REF-21"),almacen.get("REF-29"),almacen.get("REF-35"))));
        pedidos.put(10,new ArrayList<>(Arrays.asList(almacen.get("REF-10"),almacen.get("REF-11"),almacen.get("REF-22"),almacen.get("REF-39"))));
    }


}
