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
public class DispositivosAPP {
    public String a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DispositivosElectronico de1 = new Televisor();
        de1.ensender();
        de1.consumeEnergia(110);
        de1.apagar();
        
        TelefonoAPP proceso1 = new CeuluarFlecha();
        
        DispositivosAPP asd= new DispositivosAPP();
        asd.nadar();
    }
    
    public static String correr(){
        return "hola";
    }
    
    public void nadar(){
    String asdf = correr();
        System.out.println(asdf);
    
    Math2.CINCO = 10;
    
    
    DispositivosElectronico.consumeEnergia(10000);
    
    Math2.senoA(5);
    Math2.senoA(10);
    
        System.out.println(Math2.CINCO);
    
    }
    
    
    
}
