/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.repositorio;

import es.carmen.biblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergio
 */
public class LibroRepositorio {

// Patron singleton
    // creamos repositorio privado vacio
    private static LibroRepositorio libroRepositorio = null;
    //creamos el metodo getinstancia que si no existe el repositorio lo crea y devuelve el repositorio
    public static LibroRepositorio getInstancia() {
        if (libroRepositorio == null) {
            libroRepositorio = new LibroRepositorio();
        }
        return libroRepositorio;
    }
    //creamos el construnctor vacio
    private LibroRepositorio() {
    }
    //lista de libros
    private List<Libro> libros = new ArrayList();
    //contador de libros para ir poniendo ids a los libros
    private int contadorLibros = 0;

    public int getContadorLibros() {
        return contadorLibros;
    }
    
    public void altaLibro(Libro nuevoLibro){
        libros.add(nuevoLibro);
        contadorLibros++;
    }
    
    public void bajaLibro(Libro libro){
        libros.remove(libro);
    }
    
    public List<Libro> buscarPorTitulo(String titulo){
        //creo array en el que iré guardando las coincidencias
        List<Libro> librosEncontrados = new ArrayList();
        //busco en mi repositorio y lo añado al array de coincidencias

        for (Libro libro : libros) {
            if(libro.getTitulo().contains(titulo)){
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    
    public List<Libro> buscarPorAutor(String autor){
        //creo array en el que iré guardando las coincidencias
        List<Libro> librosEncontrados = new ArrayList();
        //busco en mi repositorio y lo añado al array de coincidencias

        for (Libro libro : libros) {
            if(libro.getAutor().contains(autor)){
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    //Esta parte será necesaria programarla cuando necesite hacer la baja del libro en el servicio
    public Libro buscarPorId (String id){
        Libro libroEncontrado = null;
        for (Libro libro : libros) {
            if (libro.getId().equals(id)){
                libroEncontrado=libro;
            }
        }
        return libroEncontrado;
    }
    //Esta parte será necesario programarla cuando preste un libro
    public boolean cambiarDisponible(String id, boolean disponible) {
        Libro libro = buscarPorId(id);
        if (libro == null) {
            return false;
        }
        libro.setDisponible(disponible);
        return true;
    }
    
    public List<Libro> verTodosLibros(){
        return libros;
    }
    
    
}
