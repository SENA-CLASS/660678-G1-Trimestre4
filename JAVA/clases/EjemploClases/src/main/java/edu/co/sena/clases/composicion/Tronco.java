package edu.co.sena.clases.composicion;

public class Tronco {
    private Columna columna;
    private Corazon corazon;
    private Pulmones pulmones;
    private Rinones rinones;

    public Tronco(Columna columna, Corazon corazon, Pulmones pulmones, Rinones rinones) {
        this.columna = columna;
        this.corazon = corazon;
        this.pulmones = pulmones;
        this.rinones = rinones;
    }

    public Columna getColumna() {
        return columna;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmones getPulmones() {
        return pulmones;
    }

    public Rinones getRinones() {
        return rinones;
    }
    
    
    
}