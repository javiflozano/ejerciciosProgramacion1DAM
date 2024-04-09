public class Alumno {
    private String nombre;
    private int notaProgramacion = 4;
    private int notaBasesDatos;



    public int getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(int notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public int getNotaBasesDatos() {
        return notaBasesDatos;
    }

    public void setNotaBasesDatos(int notaBasesDatos) {
        this.notaBasesDatos = notaBasesDatos;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean aprobado(){
        if (notaProgramacion < 5 || notaBasesDatos < 5){
            return false;
        } else return true;
    }

    public float calcularMedia(){
        return (float) (notaBasesDatos + notaProgramacion)/2;
    }
}
