public class Vivienda {

    private String nombre;
    private int numHabitaciones;
    private int numServicios;
    private int precio;
    private boolean hayGaraje;
    private boolean hayAscensor;

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumServicios() {
        return numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isHayAscensor() {
        return hayAscensor;
    }

    public void setHayAscensor(boolean hayAscensor) {
        this.hayAscensor = hayAscensor;
    }

    public Vivienda(String nombre, int numHabitaciones, int numServicios, int precio, boolean hayGaraje, boolean hayAscensor) {
        this.nombre = nombre;
        this.numHabitaciones = numHabitaciones;
        this.numServicios = numServicios;
        this.hayGaraje = hayGaraje;
        this.hayAscensor = hayAscensor;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHayGaraje() {
        return hayGaraje;
    }

    public void setHayGaraje(boolean hayGaraje) {
        this.hayGaraje = hayGaraje;
    }
}
