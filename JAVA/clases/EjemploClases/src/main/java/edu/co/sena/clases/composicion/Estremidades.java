package edu.co.sena.clases.composicion;

public class Estremidades {
    private Femur femur;
    private Casco casco;

    public Estremidades(Femur femur, Casco casco) {
        this.femur = femur;
        this.casco = casco;
    }

    public Femur getFemur() {
        return femur;
    }

    public Casco getCasco() {
        return casco;
    }
    
    
    
    
}