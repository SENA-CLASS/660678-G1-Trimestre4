/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.practico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Enrique Moreno
 */
public class Bosque {
    private String idBosque;
    private String nombre;
    private double tamano;
    private List<Arbol> arboles;

    public Bosque(String idBosque, String nombre, double tamano) {
        this.idBosque = idBosque;
        this.nombre = nombre;
        this.tamano = tamano;
        arboles= new ArrayList<>();
    }

    public void agregarArbol(Arbol arbolito){
        if (!existeArbol(arbolito)) {
            arboles.add(arbolito);
        }
    }    
    
    public void talarArbol(Arbol arbolito){
        
        int posicion;
        posicion= arboles.lastIndexOf(arbolito);
        System.out.println("borrado es"+arboles.get(posicion).getIdArbol());
        arboles.remove(posicion);
        
    }
    
   
    
    
    public boolean existeArbol(Arbol arbolito){
        boolean resul = false;
        for (Arbol arbol : arboles) {
            if(arbol.compareTo(arbolito)==-50){
                resul = true;
            }
        }
        return resul;
    }
    
    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getIdBosque() {
        return idBosque;
    }

    public void setIdBosque(String idBosque) {
        this.idBosque = idBosque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arbol> getArboles() {
        return arboles;
    }
    
    
}
