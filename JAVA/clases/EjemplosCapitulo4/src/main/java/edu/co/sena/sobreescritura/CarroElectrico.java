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
public class CarroElectrico extends Carro{

    @Override
    public void arrancar() {
        System.out.println("arranca por meddio de corrinte");
    }
    
    public void descarga(){
        System.out.println("el carro esta descargado");
    }
    
}
