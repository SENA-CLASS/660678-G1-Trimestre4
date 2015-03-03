package edu.co.sena.clases.composicion;

public class Caballo {
    
    private Cabeza cabeza; 
    private Tronco tronco; 
    private Estremidades estremidades;
    private Silla silla= null;
    
    public Caballo(Cabeza cabeza, Tronco tronco, Estremidades estremidades) {
    this.cabeza= cabeza;
    this.tronco= tronco;
    this.estremidades=estremidades;
    }

    public Cabeza getCabeza() {
        return cabeza;
    }

    public Tronco getTronco() {
        return tronco;
    }

    public Estremidades getEstremidades() {
        return estremidades;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }
    
    
    
    
    
    
}