/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplointefarce;

/**
 *
 * @author Enrique Moreno
 */
public class InterfacesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Esudiante e1= new Esudiante();
        e1.matricularse();
        
        Esudiante e2 = new EstIngenieria();
        e2.matricularse();
        
        EstIngenieria e3 = new EstIngenieria();
        e3.matricularse();
        e3.recogerCarnet();
        e3.revisarSalon();
        
        Monitor m1 = new EstIngenieria();
        m1.recogerCarnet();
        m1.revisarSalon();
        
        
    }
    
}
