import models.MiClase;

public class Main {
    public static void main(String[] args) {

        MiClase miClase = new MiClase("Pública");
        MiClase otraClase = new MiClase("Pública");

        if (miClase.equals(otraClase)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }


    }
}