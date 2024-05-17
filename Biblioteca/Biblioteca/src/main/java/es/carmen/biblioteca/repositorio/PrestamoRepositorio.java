/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.repositorio;

import es.carmen.biblioteca.modelo.Libro;
import es.carmen.biblioteca.modelo.Prestamo;
import es.carmen.biblioteca.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;


public class PrestamoRepositorio {
    //lista de prestamos
    private List<Prestamo> prestamos = new ArrayList();

    //patron singleton
    private static PrestamoRepositorio prestamoRepositorio =null;
    private PrestamoRepositorio() {
    }
    public static PrestamoRepositorio getInstancia(){
        if(prestamoRepositorio == null){
            prestamoRepositorio = new PrestamoRepositorio();
        }
        return prestamoRepositorio;
    }
//funciones

    public void nuevoPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
    //no queremos eliminar el prestamo, solo sustituirlo por uno igual pero con fecha de fin
    public void devolverLibro(Prestamo prestamoOrigen, Prestamo prestamoModificado) {
        prestamos.remove(prestamoOrigen);
        prestamos.add(prestamoModificado);
    }
    //ver los prestamos por cada usuario
    public List<Prestamo> prestamosPorUsuario(Usuario usuario) {
        List<Prestamo> prestamosDelUsuario = new ArrayList();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuario)) {
                prestamosDelUsuario.add(prestamo);
            }
        }     
        return prestamosDelUsuario;
    }
    //Esta funcion la va a necesitar el servicio
    //ver los prestamos que tiene un libro que esten activos
    public Prestamo buscarPrestamoDeLibro(Libro libro) {
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getLibro().equals(libro) && prestamo.getFechaDevolucion() == null) {
                return prestamo;
            }
        }
        return null;
    }
}
