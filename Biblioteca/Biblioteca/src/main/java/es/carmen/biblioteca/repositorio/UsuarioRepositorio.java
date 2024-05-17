package es.carmen.biblioteca.repositorio;

import es.carmen.biblioteca.modelo.Usuario;

public class UsuarioRepositorio {
    
    // Patron singleton
    //El patrón Singleton es un patrón de diseño creacional que garantiza que 
    //una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia.

//    Características clave del patrón Singleton:
//
//    Constructor privado: El constructor de la clase Singleton se declara como privado para evitar que otros objetos
//    creen instancias de la clase mediante el operador new.
//
//    Instancia estática: La clase Singleton mantiene una única instancia de sí misma como una variable estática privada.
//
//    Método estático de acceso: Se proporciona un método estático público (a menudo llamado getInstance())
//    que permite a los clientes acceder a la instancia única de la clase Singleton. Si la instancia aún no existe,
//    este método crea una nueva instancia; de lo contrario, devuelve la instancia existente.

    private static UsuarioRepositorio usuarioRepositorio = null;
    
    public static UsuarioRepositorio getInstancia() {
        if (usuarioRepositorio == null) {
            usuarioRepositorio = new UsuarioRepositorio();
        }
        return usuarioRepositorio;
    }
    
    private UsuarioRepositorio() {
    }
    
    //creo el array de usuarios donde voy a ir guardando los usuarios
    private Usuario[] usuarios = new Usuario[0];

    public void altaUsuario(Usuario usuario) {
        //creo un array temporal para guardar los usuarios que haya hasta el momento
        Usuario[] tempUsuarios = this.usuarios;
        //modifico el array de usuarios para que tenga longitud n+1
        this.usuarios = new Usuario[tempUsuarios.length + 1];
        //copio el array temporal en el actual
        for (int i = 0; i < tempUsuarios.length; i++) {
            this.usuarios[i] = tempUsuarios[i];
        }
        //añado en el ultimo lugar el nuevo usuario
        this.usuarios[this.usuarios.length - 1] = usuario;
    }
    
    public void modificarUsuario(String dni, String nuevoNombre) {
        //recorro el array de usuarios
        for (Usuario usuarioArr : this.usuarios){
            //si el dni coincide cambio el nombre y corto el bucle
            if (usuarioArr.getDni().equals(dni)) {
                usuarioArr.setNombre(nuevoNombre);
                break;
            }
        }
    }
    
    public void bajaUsuario(String dni) {
        //creo un array temporal para almacenar la lista de usuarios
        Usuario[] tempUsuarios = this.usuarios;
        //moduifico el array de usuarios para que esté vacío con longitud 1 menos
        this.usuarios = new Usuario[tempUsuarios.length - 1];
        //recorro el array temporal
        for (int i = 0; i < tempUsuarios.length; i++){
            //si el dni del usuario coincide con el que he encontrado salto esta iteracion del for
            if (tempUsuarios[i].getDni().equals(dni)) {
                continue;
            }
            //si no he saltado la iteracion guardo el usuario en el array del repositorio
            this.usuarios[i] = tempUsuarios[i];
        }
    }
    
    public Usuario[] buscarTodosUsuarios() {
        return this.usuarios;
    }
}
