/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.carmen.biblioteca.servicio;

import es.carmen.biblioteca.modelo.Usuario;
import es.carmen.biblioteca.repositorio.UsuarioRepositorio;

/**
 *
 * @author sergio
 */
public class UsuarioServicio {
    //creo un repositorio de usuario para trabajar con él, es decir, mi servicio depende de mi repositorio
    //como he creado un patron singleton uso el método de getInstancia()
    private UsuarioRepositorio usuarioRepositorio = UsuarioRepositorio.getInstancia();
        
    public void altaUsuario(Usuario usuario) throws Exception {
        
        //Este método va a comprobar que el usuario que hemos introducido no esté ya guardado
        //para ello tenemos primero que buscar y si encontramos una coincidencia lanzar una excepcion
        //si no encontramos ocurrencia llamamos al alta del repositorio
        
        //recojo el array de usuarios
        Usuario[] usuarios = this.usuarioRepositorio.buscarTodosUsuarios();
        
        //Busco coincidencias
        for (Usuario usuarioArr : usuarios) {
            if(usuarioArr.getDni().equals(usuario.getDni())) {
                //si la encuentro lanzo excepcion
                throw new Exception("El usuario con dni " + usuario.getDni() + " ya existe.");
            }
        }
        //si no la encuentro llamo al alta del repositorio
        this.usuarioRepositorio.altaUsuario(usuario);
    }
    
    public void modificarUsuario(String dni, String nuevoNombre) throws Exception {
        //este metodo va a buscar en los usuarios para modificar
        //si encuentra una coincidencia va a llamar a modificar en el repositorio
        //si no encuentra una ocurrencia por dni va a lanzar una excepcion
        Usuario[] usuarios = this.usuarioRepositorio.buscarTodosUsuarios();
        for (Usuario usuarioArr : usuarios) {
            if(usuarioArr.getDni().equals(dni)) {
                usuarioRepositorio.modificarUsuario(dni, nuevoNombre);
                return;
            }
        }
        throw new Exception("El usuario con dni " + dni + " no existe.");
    }
    
    public void bajaUsuario(String dni) throws Exception {
        //Este método va a recibir un dni y dar de baja el usuario
        //para ello va a buscar en los usuarios
        //si encuentra coincidencia va a llamar a dar de baja
        //si no va a lanzar excepcion
        Usuario[] usuarios = this.usuarioRepositorio.buscarTodosUsuarios();
        for (Usuario usuarioArr : usuarios) {
            if(usuarioArr.getDni().equals(dni)) {
                usuarioRepositorio.bajaUsuario(dni);
                return;
            }
        }
        throw new Exception("El usuario con dni " + dni + " no existe.");
    }
    
    public Usuario[] verUsuarios() {
        //Este método va a devolver el array de todos los usuarios
        return this.usuarioRepositorio.buscarTodosUsuarios();
    }
    
    public Usuario buscarPorDni(String dni) throws Exception {
        //recojo todos los usuarios del array
        //recorro el array y si encuentro coincidencia lo devuelvo

        Usuario[] usuarios = this.usuarioRepositorio.buscarTodosUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                return usuario;
            }
        }
        throw new Exception("El usuario con dni " + dni + " no existe.");
    }
}
