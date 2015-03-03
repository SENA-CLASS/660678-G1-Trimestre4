/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclases1;

import edu.co.sena.ejemploclases1.constructora.Obrero;


/**
 *
 * @author Enrique Moreno
 */
public class ClaseEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado("CC", "83714823", "Juan Carlos", "arvelaes algo", "macho");
        emp1.nombre= "dsfasdfa";//mala practiva no esta encapsulado
        Empleado emp2 = new Empleado("CC", "83714823", "Juan Carlos", "arvelaes algo", "macho");
        System.out.println(emp1.getTipoDocumento());
        System.out.println(emp1.getNumeroDocumeto());
        System.out.println(emp1.getNombre());
        System.out.println(emp1.getApelliedo());
        System.out.println(emp1.getSexo());
        
        
        
        System.out.println(emp1);
        System.out.println(emp2);
        if (emp1.compareTo(emp2)==0) {
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }
        
        
        
        if (emp1 instanceof Empleado) {
            System.out.println("es un empleado");
            
        }
        
        Obrero ob1 = new Obrero();
        
        
    }
    
}
