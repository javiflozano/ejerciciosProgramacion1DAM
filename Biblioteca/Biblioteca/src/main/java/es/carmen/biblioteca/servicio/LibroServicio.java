/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.servicio;

import es.carmen.biblioteca.modelo.Libro;
import es.carmen.biblioteca.repositorio.LibroRepositorio;
import java.util.List;

/**
 *
 * @author sergio
 */
public class LibroServicio {
    private LibroRepositorio libroRepositorio = LibroRepositorio.getInstancia();
    
    public void altaLibro (Libro libro){
        //establezco el id del libro desde el servicio
        libro.setId(String.valueOf(libroRepositorio.getContadorLibros()));
        //establezco el libro como disponible
        libro.setDisponible(true);
        //llamo al repositorio para guardarlo
        libroRepositorio.altaLibro(libro);
    }
    
    public void bajaLibro (String id) throws Exception{
        //busco el libro que tiene ese id, primero tendremos que hacer la funcion buscarporID en el repositorio
        Libro libroBaja = libroRepositorio.buscarPorId(id);
        if (libroBaja == null){
            //si no lo he encontrado lanzo excepcion
            throw new Exception("Libro no encontrado");  
        }
        //si no llamo al método de baja del repositorio
        libroRepositorio.bajaLibro(libroBaja);
    }
    
    public List<Libro> buscarPorTitulo (String titulo) throws Exception{
        //busco los libros y manejo la excepcion de que no se encuentre naada
        List<Libro> librosEncontrados = libroRepositorio.buscarPorTitulo(titulo);
        if (librosEncontrados.isEmpty()){
            throw new Exception("No hay ningún libro que contenga ese titulo");  
        }
        return librosEncontrados;
    }
    
    public List<Libro> buscarPorAutor (String autor) throws Exception{
        //busco los libros y manejo la excepcion de que no se encuentre naada
        List<Libro> librosEncontrados = libroRepositorio.buscarPorAutor(autor);
        if (librosEncontrados.isEmpty()){
            throw new Exception("No hay ningún libro que contenga ese autor");  
        }
        return librosEncontrados;
    }

    //Esta parte va a ser necesaria programarla cuando programemos los prestamos
    public Libro buscarPorId(String idLibro) throws Exception {
        Libro libro = libroRepositorio.buscarPorId(idLibro);
        if (libro == null) {
          throw new Exception("No existe ningun libro con ese id");
        }
        return libro;
    }
    
    public void cambiarDisponible(String id, boolean disponible) throws Exception {
        if (!libroRepositorio.cambiarDisponible(id, disponible)) {
            throw new Exception("No existe ningun libro con ese id");
        }
    }
}
