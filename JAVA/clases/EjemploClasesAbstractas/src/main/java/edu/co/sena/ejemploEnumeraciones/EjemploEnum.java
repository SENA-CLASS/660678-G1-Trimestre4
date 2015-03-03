/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploEnumeraciones;

/**
 *
 * @author Enrique Moreno
 */
public class EjemploEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computador c1 = new Computador(Estado.APAGADO);
        Computador c2 = new Computador(Estado.PRENDIDO);
        Computador c3 = new Computador(Estado.SUSPENDIDO);
        Computador c4 = new Computador(Estado.PRENDIDO);
        
        System.out.println(c1.getState());
        System.out.println(c2.getState());
        System.out.println(c3.getState());
        System.out.println(c4.getState());
        
    }
    
}
