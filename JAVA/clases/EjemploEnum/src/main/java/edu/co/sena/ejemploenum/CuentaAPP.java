/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploenum;

/**
 *
 * @author Enrique Moreno
 */
public class CuentaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1= new Cuenta(TipoDocumento.NIUP, "58932579834", "moreno", "Hernando", "Moreno", "Enrique");
        
        System.out.println(c1.getTipoDocumento());
        System.out.println(c1.getTipoDocumento().ordinal());
        
    }
    
}
