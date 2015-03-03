/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.practico;

/**
 *
 * @author Enrique Moreno
 */
public class Arbol implements Comparable<Arbol>{
    private String idArbol;
    private double altura;
    private double diametro;
    private String tipo;

    public Arbol(String idArbol, double altura, double diametro, String tipo) {
        this.idArbol = idArbol;
        this.altura = altura;
        this.diametro = diametro;
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getIdArbol() {
        return idArbol;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Arbol o) {
        int resul = -20;
        if(this.idArbol.equals(o.idArbol)){
        resul = -50;
        }
        return resul;
    }

    @Override
    public String toString() {
        return "Arbol{" + "idArbol=" + idArbol + ", altura=" + altura + ", diametro=" + diametro + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
    
    
}
