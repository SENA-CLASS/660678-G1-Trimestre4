/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo2clases.visiblidad;

import edu.co.sena.ejemplo2clases.Persona;

/**
 *
 * @author Enrique Moreno
 */
public class Visibilidad{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        
        PersonaNatural p2 = new PersonaNatural();
        p2.setNumeroDocumento("52354354");
        
        System.out.println(p2.getNumeroDocumento());
    }
        
        
        
    
}
