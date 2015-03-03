/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploenum.complejas;

/**
 *
 * @author Enrique Moreno
 */
public enum PowerState {
    APAGADO("El flujo de energia es cero"),
    PRENDIDO("El flujo de energia esta activo"),
    SUSPENDIDO("El flujo de energia es my bajo");
    
    private String descricion;
    
    private PowerState(String d){
    this.descricion=d;
    }

    public String getDescricion() {
        return descricion;
    }
    
    
    
    
    
}
