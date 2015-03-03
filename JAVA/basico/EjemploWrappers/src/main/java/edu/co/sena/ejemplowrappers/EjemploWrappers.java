/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplowrappers;

/**
 *
 * @author Enrique Moreno
 */
public class EjemploWrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String tecla = "123";
       
       int ap=2;
       Integer aWrapper=ap;
       
       int intTecla= Integer.parseInt(tecla);
       
        System.out.println(ap);
        System.out.println(aWrapper);
       
        Integer entero;
        Byte bytes;
        Short enteroCorto;
        Long eneroLargo;
        Boolean verdaderoFalso;
        Float realCorto;
        Double realLargo;
        Character caracter;
        
       
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        
        
    }
    
}
