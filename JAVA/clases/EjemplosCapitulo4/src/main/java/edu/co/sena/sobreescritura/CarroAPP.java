/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.sobreescritura;

/**
 *
 * @author Enrique Moreno
 */
public class CarroAPP {
    
    public static void main(String[] args) {
      Carro carro1 = new CarroElectrico();
        carro1.arrancar();
        //carro1.descarga();
        System.out.println(carro1.getClass().getName());   
    }
}
