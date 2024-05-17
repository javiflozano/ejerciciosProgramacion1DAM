/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.servicio;

import es.carmen.biblioteca.modelo.Libro;
import es.carmen.biblioteca.modelo.Prestamo;
import es.carmen.biblioteca.modelo.Usuario;
import es.carmen.biblioteca.repositorio.PrestamoRepositorio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sergio
 */
public class PrestamoServicio {
    //necesitaremos el repositorio de prestamos y los gestores de libros y usuarios
    private PrestamoRepositorio prestamoRepositorio = PrestamoRepositorio.getInstancia();
    
    private LibroServicio libroGestor = new LibroServicio();
    private UsuarioServicio usuarioGestor = new UsuarioServicio();

    //prestar libro
    public void prestarLibro(String idLibro, String dniUsuario) throws Exception {
        //busca el libro por id desde el gestor de libros (programar si aun no lo hemos hecho)
        Libro libro = libroGestor.buscarPorId(idLibro);
        //si el libro no esta disponible lanzamos excepcion de que no está disponible
        if(!libro.isDisponible()) {
            throw new Exception("Ese libro no esta disponible");
        }
        //si si está disponible
        //buscamos el usuario por su dni desde el gestor de usuarios (programar si no está hecho)
        Usuario usuario = usuarioGestor.buscarPorDni(dniUsuario);
        //ponemos el libro como no disponible tanto en la instancia del libro
        // //como llamando a su gestor (programar si no está hecho cambiarDisponible en el servicio de libro)
        libro.setDisponible(false);
        libroGestor.cambiarDisponible(libro.getId(), false);
        //añadimos el nuevo prestamo al repositorio
        prestamoRepositorio.nuevoPrestamo(new Prestamo(usuario, libro, new Date()));

    }
    
    public void devolverLibro(String idLibro) throws Exception {
        //buscamos el libro en su servicio por id
        Libro libro = libroGestor.buscarPorId(idLibro);
        //buscamos el préstamo de ese libro en el repositorio (programar si no está hecho)
        Prestamo prestamo = prestamoRepositorio.buscarPrestamoDeLibro(libro);
        //si no hay prestamo lanzamos la excepcion
        if (prestamo == null) {
            throw new Exception("Ese libro no tiene un prestamo vigente");
        }
        //si hay prestamo vamos hacer un nuevo préstamo igual pero le vamos a asignar fecha de devolución
        Prestamo finPrestamo = prestamo;
        finPrestamo.setFechaDevolucion(new Date());
        prestamoRepositorio.devolverLibro(prestamo, finPrestamo);
        //cambiamos la disponibilidad del libro en el gestor de libros
        libroGestor.cambiarDisponible(libro.getId(), true);
    }
    
    public List<Prestamo> verPrestamosUsuario(String dniUsuario) throws Exception {
        //busco el usuario con su dni en su servicio
        Usuario usuario = usuarioGestor.buscarPorDni(dniUsuario);
        List<Prestamo> prestamos = prestamoRepositorio.prestamosPorUsuario(usuario);
        //si no tiene prestamos lanzo excepcion
        if (prestamos.isEmpty()) {
            throw new Exception("Este usuario no tiene prestamos");
        }
        return prestamos;
    }
}
