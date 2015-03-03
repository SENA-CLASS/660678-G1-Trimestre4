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
public abstract class DispositivosElectronico {
    public abstract void ensender();
    public abstract void apagar();
    
    public static void consumeEnergia(double voltage){
        System.out.println("estoy consumiendo tantos"+voltage);
        Math2.CINCO = 20;
    }
    
}
