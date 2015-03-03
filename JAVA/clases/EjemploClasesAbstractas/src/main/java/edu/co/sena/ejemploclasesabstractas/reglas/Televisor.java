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
public class Televisor extends DispositivosElectronico{

    @Override
    public void ensender() {
        System.out.println("prenddio el televisor");
    }

    @Override
    public void apagar() {
        System.out.println("se apago el televisor");
    }
    
}
