/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploclasesabstractas.reglas;

/**
 *
 * @author Enrique Moreno
 */
public class StrEqual {
    
    

    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = new String("hi");//mala pract
        String s3 = "hola";
        
        s3="hhhh";
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s3);
        
        if (s1 == s2) {
            System.out.println("s1 and s2 equal");
        } else {
            System.out.println("s1 and s2 not equal");
        }
        if (s1 == s3) {
            System.out.println("s1 and s3 equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }
    }
}
