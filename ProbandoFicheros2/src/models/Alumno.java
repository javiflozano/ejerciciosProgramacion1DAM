package models;

public class Alumno {
    private String name;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int nota5;

    public Alumno(String name, int nota1, int nota2, int nota3, int nota4, int nota5) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }

    public String getName() {
        return name;
    }

    public Alumno (String linea){
        String [] datosAlumno = linea.split(";");
        this.name = datosAlumno[0];
        this.nota1 = Integer.parseInt(datosAlumno[1]);
        this.nota2 = Integer.parseInt(datosAlumno[2]);
        this.nota3 = Integer.parseInt(datosAlumno[3]);
        this.nota4 = Integer.parseInt(datosAlumno[4]);
        this.nota5 = Integer.parseInt(datosAlumno[5]);
    }
    public boolean isAprobado(){
        return nota1 >= 5 && nota2 >=5 && nota3>=5 && nota4 >=5 && nota5 >=5;
    }
    public float calcularMedia(){
        return (float) ((nota1+nota2+nota3+nota4+nota5)/5.0);
    }
    public int numSuspensos(){
        int suspensos = 0;
        if (nota1 < 5) suspensos ++;
        if (nota2 < 5) suspensos ++;
        if (nota3 < 5) suspensos ++;
        if (nota4 < 5) suspensos ++;
        if (nota5 < 5) suspensos ++;
        return suspensos;
    }

    @Override
    public String toString() {
        if (this.isAprobado()){
            return this.name + ";APROBADO;" + this.calcularMedia();
        } else {
            return this.name + "SUSPENSO;" + this.numSuspensos();
        }
    }
}
