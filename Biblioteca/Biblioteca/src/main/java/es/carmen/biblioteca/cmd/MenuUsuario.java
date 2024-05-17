/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.cmd;

import es.carmen.biblioteca.modelo.Usuario;
import es.carmen.biblioteca.servicio.UsuarioServicio;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class MenuUsuario {
    
    private Scanner scanner = new Scanner(System.in);
    private UsuarioServicio usuarioGestor = new UsuarioServicio();
    
    public void muestraMenu() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Agreagar nuevo usuario");
            System.out.println("2. Modificar usuario existente.");
            System.out.println("3. Baja de usuario.");
            System.out.println("4. Ver usuarios activos.");
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
                this.altaUsuario();
                break;
            case "2":
                this.modificarUsuario();
                break;
            case "3":
                this.bajaUsuario();
                break;
            case "4":
                this.verUsuarios();
                break;
            case "0":
                break;
            default:
                System.out.println("Esa opcion es incorrecta.");
        }
    }
    
    private void altaUsuario() {
        //pedimos datos de entrada
        System.out.println("Ingresa el DNI:");
        String dni = this.scanner.nextLine();
        System.out.println("Ingresa el nombre:");
        String nombre = this.scanner.nextLine();
        //llamamos a altaUsuario capturando la posible excepcion
        try {
            this.usuarioGestor.altaUsuario(new Usuario(dni, nombre));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void modificarUsuario() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el DNI:");
        String dni = this.scanner.nextLine();
        System.out.println("Ingresa el nuevo nombre:");
        String nuevoNombre = this.scanner.nextLine();
        //llamamos a modificarUsuario capturando la posible excepcion
        try {
            this.usuarioGestor.modificarUsuario(dni, nuevoNombre);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void bajaUsuario() {
        //pedimos los datos de entrada
        System.out.println("Ingresa el DNI:");
        String dni = this.scanner.nextLine();
        //llamamos a bajaUsuario capturando la posible excepcion
        try {
            this.usuarioGestor.bajaUsuario(dni);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void verUsuarios() {
        //llamamos a ver usuarios y recorremos el array para imprimirlo
        Usuario[] usuarios = this.usuarioGestor.verUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("DNI: " + usuario.getDni());
            System.out.println("Nombre: " + usuario.getNombre());
        }
    }
    
}
