/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasesabstractas.carrostatic;

/**
 *
 * @author Enrique Moreno
 */
public class CarroAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         new CarroDiesel();
         new CarroDiesel();
         new CarroDiesel();
         new CarroDiesel();
        CarroDiesel c5 = new CarroDiesel();
        CarroDiesel c6 = new CarroDiesel();
        CarroElectrico c7 =new CarroElectrico();
        Carro c8 = new CarroDiesel();
        System.out.println(c8.getContadorCarros());
        
        System.out.println(Carro.contadorCarros);
    }
    
}
