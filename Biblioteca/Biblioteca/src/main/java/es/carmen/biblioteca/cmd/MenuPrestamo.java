/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.cmd;

import es.carmen.biblioteca.modelo.Prestamo;
import es.carmen.biblioteca.servicio.PrestamoServicio;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class MenuPrestamo {
    
    private Scanner scanner = new Scanner(System.in);
    private PrestamoServicio prestamoGestor = new PrestamoServicio();
    
    public void muestraMenu() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Prestar nuevo libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Buscar prestamos de un usuario");
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
                this.nuevoPrestamo();
                break;
            case "2":
                this.devolverLibro();
                break;
            case "3":
                this.prestamosUsuario();
                break;
            case "0":
                break;
            default:
                System.out.println("Esa opcion es incorrecta.");
        }
    }
    
    private void nuevoPrestamo() {
        //pedimos datos de entrada
        System.out.println("Ingresa el dni del usuario:");
        String dniUsuario = this.scanner.nextLine();
        System.out.println("Ingresa el id del libro:");
        String idLibro = this.scanner.nextLine();
        try {
            this.prestamoGestor.prestarLibro(idLibro, dniUsuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void devolverLibro() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el id del libro:");
        String idLibro = this.scanner.nextLine();
        
        try {
            this.prestamoGestor.devolverLibro(idLibro);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void prestamosUsuario() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el dni del usuario:");
        String dniUsuario = this.scanner.nextLine();
        try {
            List<Prestamo> prestamos = this.prestamoGestor.verPrestamosUsuario(dniUsuario);
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.toString());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
