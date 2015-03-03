/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasesabstractas.carrostatic.constante;

/**
 *
 * @author Enrique Moreno
 */
public class CamputadorAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador c1= new Computador();
        c1.setState(Computador.PRENDIDO);
        c1.setState(42);
        System.out.println(c1.getState());
    }
    
}
