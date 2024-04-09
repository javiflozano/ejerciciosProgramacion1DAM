package models;

public class Ordenador {
    private Procesador procesador;
    private MemoriaRAM memoriaRAM;
    private PlacaBase placaBase;
    private Almacenamiento almacenamiento;
    private Torre torre;

    private boolean isOverLoaded = false;
    private final int ALMACENAMIENTO_MINIMO = 64;
    public boolean test3(){
        return procesador.getMarca().equals(placaBase.getMarca());
    }
    public boolean test4(){
        return memoriaRAM.getCapacidad() >= procesador.getMemoriaMinima();
    }
    public boolean test5(){
        return almacenamiento.getCapacidad() >= ALMACENAMIENTO_MINIMO;
    }
    public boolean test6(){
        for (String factorForma:placaBase.getFactoresForma()){
            if (factorForma.equals(torre.getFactorForma())) return true;
        }
        return false;
    }
    public boolean test7(){
        return (memoriaRAM.getCapacidad() <= procesador.getMemoriaMaxima() && memoriaRAM.getCapacidad() <= placaBase.getMemoriaMaxima());
    }

    public void setProcesador(Procesador procesador) {
        if (this.procesador == null) {
            this.procesador = procesador;
        } else isOverLoaded = true;

    }

    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        if (this.memoriaRAM == null) {
            this.memoriaRAM = memoriaRAM;
        } else isOverLoaded = true;

    }

    public void setPlacaBase(PlacaBase placaBase) {
        if (this.placaBase == null) {
            this.placaBase = placaBase;
        } else isOverLoaded = true;

    }

    public void setAlmacenamiento(Almacenamiento almacenamiento) {
        if (this.almacenamiento == null) {
            this.almacenamiento = almacenamiento;
        } else isOverLoaded = true;

    }

    public void setTorre(Torre torre) {
        if (this.torre == null) {
            this.torre = torre;
        } else isOverLoaded = true;
    }

    public boolean test8(){
        return Math.abs(procesador.getVelocidad() - placaBase.getVelocidad()) < 0.5f;
    }
    public boolean test2(){
        return isOverLoaded;
    }
    public boolean test1() {
        return !(procesador == null || memoriaRAM == null || almacenamiento == null || placaBase == null || torre == null);
    }
}
