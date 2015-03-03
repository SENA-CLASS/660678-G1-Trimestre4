/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplocoleccionnes.practico;

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
        Arbol a1 = new Arbol("1", 120, 2, "naranjo");
        Arbol a2 = new Arbol("2", 120, 2, "naranjo");
        Arbol a3 = new Arbol("3", 120, 2, "naranjo");
        Arbol a4 = new Arbol("4", 120, 2, "naranjo");
        Arbol a5 = new Arbol("5", 120, 2, "naranjo");
        Arbol a6 = new Arbol("6", 120, 2, "naranjo");
        Arbol a7 = new Arbol("7", 120, 2, "naranjo");
        Arbol a8 = new Arbol("8", 120, 2, "naranjo");
        Arbol a9 = new Arbol("9", 120, 2, "naranjo");
    
        Bosque b1= new Bosque("1", "bosque adsi", 18000);
        b1.agregarArbol(a1);
        b1.agregarArbol(a2);
        b1.agregarArbol(a3);
        b1.agregarArbol(a4);
        b1.agregarArbol(a5);
        b1.agregarArbol(a6);
        b1.agregarArbol(a7);
        b1.agregarArbol(a8);
        b1.agregarArbol(a9);
        b1.agregarArbol(a1);
        
        
        
        List<Arbol> listaTempo = b1.getArboles();
        System.out.println(listaTempo.get(0).getIdArbol());
        listaTempo.remove(1);
        System.out.println(listaTempo.size());
        System.out.println(listaTempo.get(2).getIdArbol());
        
        for (Arbol arbol : listaTempo) {
            System.out.println(arbol.toString());
        }
        Arbol a10 = new Arbol("9", 120, 2, "naranjo");
    
        b1.talarArbol(a9);
        
        List<Arbol> listaTempo2 = b1.getArboles();
        for (Arbol arbol : listaTempo2) {
            System.out.println(arbol.toString());
        }
        
        
    
    
    }
    
}
