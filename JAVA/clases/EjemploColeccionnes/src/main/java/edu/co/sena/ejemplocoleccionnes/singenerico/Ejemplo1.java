/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.singenerico;

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
        
        Perro p1 = new Perro("ciguagua","pili");
        Perro p2 = new Perro("labrador","tony");
        Perro p3 = new Perro("pilbur","oscar");
        
        Moto m1 = new Moto("5325","yamaha");
        Moto m2 = new Moto("2354","yamaha");
        Moto m3 = new Moto("568","yamaha");
        
        List lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);
        
        for (Object object : lista) {
            System.out.println(object.getClass().getName());
            if(object instanceof Perro){
            Perro pt = (Perro)object;
                System.out.println(pt.getNombre());
                System.out.println(pt.getRaza());
            }else if (object instanceof Moto){
            Moto mt = (Moto)object;
                System.out.println(mt.getMarca());
                System.out.println(mt.getPlaca());
            }
            
        }
        
        System.out.println("fin");
    }
    
}
