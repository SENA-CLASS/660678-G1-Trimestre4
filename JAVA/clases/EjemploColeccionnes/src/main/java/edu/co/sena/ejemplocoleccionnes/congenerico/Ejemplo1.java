/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.congenerico;

import edu.co.sena.ejemplocoleccionnes.singenerico.Moto;
import edu.co.sena.ejemplocoleccionnes.singenerico.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique Moreno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Perro> listaPerro = new ArrayList();
        
        Perro p1 = new Perro("ciguagua","pili");
        Perro p2 = new Perro("labrador","tony");
        Perro p3 = new Perro("pilbur","oscar");
        
        Moto m1 = new Moto("5325","yamaha");
        Moto m2 = new Moto("2354","yamaha");
        Moto m3 = new Moto("568","yamaha");
        
        
        
    }
    
}
