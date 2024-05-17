/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.cmd;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class MenuPrincipal {
    
    private Scanner scanner = new Scanner(System.in);
    private MenuUsuario menuUsuario = new MenuUsuario();
    private MenuLibro menuLibro = new MenuLibro();
    private MenuPrestamo menuPrestamo = new MenuPrestamo();
    
    public void muestraMenu() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Gestion de usuarios");
            System.out.println("2. Gestion de libros");
            System.out.println("3. Gestion de prestamos");
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
                this.menuUsuario.muestraMenu();
                break;
            case "2":
                this.menuLibro.muestraMenu();
                break;
            case "3":
                this.menuPrestamo.muestraMenu();
                break;
            case "0":
                break;
            default:
                System.out.println("Esa opcion es incorrecta.");
        }
    }
}
