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
public class Math2 {
    
    
    public static int CINCO = 5;
    public final int VAR1=2;
    public static final int VAR2=3;
    
    public static void senoA(final int a){
        final double piNoExacto = 3.14;
        
        final Celular c1 = new CeuluarFlecha();
        Celular c2 = new CeuluarFlecha();
        c1.setMarca("samsung");
        System.out.println(c1.getMarca());
        c2 =c1;
        
        System.out.println(Math.sin(a));
    }
    
    
}
