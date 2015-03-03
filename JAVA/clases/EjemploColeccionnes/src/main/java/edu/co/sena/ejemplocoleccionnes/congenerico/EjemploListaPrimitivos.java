/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.congenerico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique Moreno
 */
public class EjemploListaPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> listaEnteros = new ArrayList();
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(8);
        
        for (Integer integer : listaEnteros) {
            System.out.println(integer);
        }
        
       
    }
    
}
