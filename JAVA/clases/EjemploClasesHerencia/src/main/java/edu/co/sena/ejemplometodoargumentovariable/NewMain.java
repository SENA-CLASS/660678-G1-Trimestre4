/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplometodoargumentovariable;

/**
 *
 * @author Enrique Moreno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(suma(1,2,3,4,5,6,7,8,9,0,12));
        System.out.println(suma(1,2));
        System.out.println(suma(1));
    }
    
    public static int suma(int... num){
        int suma=0;
        for (int i = 0; i < num.length; i++) {
            suma=suma+num[i];
        }
    return suma;
    }
    
}
