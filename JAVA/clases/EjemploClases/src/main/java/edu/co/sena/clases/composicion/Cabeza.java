package edu.co.sena.clases.composicion;

import java.util.*;

public class Cabeza {
    private Ojo ojoIzquierdo;
    private Ojo ojoDerecho;
    private Craneo craneo;
    private Cerebro cerebro;
    private Boca boca;
    private Visera visera = new Visera(null);

    public Cabeza(Ojo ojoIzquierdo, Ojo ojoDerecho, Craneo craneo, Cerebro cerebro, Boca boca) {
        this.ojoIzquierdo = ojoIzquierdo;
        this.ojoDerecho = ojoDerecho;
        this.craneo = craneo;
        this.cerebro = cerebro;
        this.boca = boca;
        
        
    }
    

    public Ojo getOjoIzquierdo() {
        return ojoIzquierdo;
    }

    public Ojo getOjoDerecho() {
        return ojoDerecho;
    }

    public Craneo getCraneo() {
        return craneo;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public Boca getBoca() {
        return boca;
    }

    public Visera getVisera() {
        return visera;
    }

    public void setVisera(Visera visera) {
        this.visera = visera;
    }
    
    
    
    
    

}