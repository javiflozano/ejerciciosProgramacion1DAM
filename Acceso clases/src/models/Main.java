package models;


/**
 * Proyecto para ver los distintos tipos de acceso: public, protected, default y private
 */

public class Main {
    public static void main(String[] args) {

        // Clase pública - Accesible desde cualquier lugar
        PublicClass publicClass = new PublicClass();
        // Acceso a la propiedad pública desde cualquier paquete
        String publicProperty = publicClass.clasePublicaPropiedadPublica;
        // Acceso a la propiedad protected desde el mimso paquete
        String protectedProperty = publicClass.clasePublicaPropiedadProtected;






    }
}