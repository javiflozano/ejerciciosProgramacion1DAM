/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.cmd;

import es.carmen.biblioteca.modelo.Libro;
import es.carmen.biblioteca.servicio.LibroServicio;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class MenuLibro {
    private Scanner scanner = new Scanner(System.in);
    private LibroServicio libroGestor = new LibroServicio();
    
    public void muestraMenu() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar por titulo");
            System.out.println("4. Buscar por autor");
            System.out.println("0. Salir");
            opcion = this.pideOpcion();
            this.procesaOpcion(opcion);
        } while (!opcion.equals("0"));
    }
    
    private String pideOpcion() {
        return this.scanner.nextLine();
    }
    
    private void procesaOpcion(String opcion) {
        switch(opcion) {
            case "1":
                this.altaLibro();
                break;
            case "2":
                this.bajaLibro();
                break;
            case "3":
                this.buscarPorTitulo();
                break;
            case "4":
                this.buscarPorAutor();
                break;
            case "0":
                break;
            default:
                System.out.println("Esa opcion es incorrecta.");
        }
    }
    
    private void altaLibro() {
        //pedimos datos de entrada
        System.out.println("Ingresa el titulo:");
        String titulo = this.scanner.nextLine();
        System.out.println("Ingresa el autor:");
        String autor = this.scanner.nextLine();
        this.libroGestor.altaLibro(new Libro(titulo, autor));
    }
    
    private void bajaLibro() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el id:");
        String id = this.scanner.nextLine();
        
        try {
            this.libroGestor.bajaLibro(id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void buscarPorTitulo() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el titulo:");
        String titulo = this.scanner.nextLine();
        try {
            List<Libro> librosEncontrados = this.libroGestor.buscarPorTitulo(titulo);
            for (Libro librosEncontrado : librosEncontrados) {
                System.out.println(librosEncontrado.toString());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    private void buscarPorAutor() {
        
        System.out.println("Ingresa el autor:");
        String autor = this.scanner.nextLine();
        try {
            List<Libro> librosEncontrados = this.libroGestor.buscarPorAutor(autor);
            for (Libro librosEncontrado : librosEncontrados) {
                System.out.println(librosEncontrado.toString());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
