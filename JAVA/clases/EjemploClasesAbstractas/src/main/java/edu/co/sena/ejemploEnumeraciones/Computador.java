/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploEnumeraciones;

import edu.co.sena.ejemploclasesabstractas.carrostatic.constante.*;

/**
 *
 * @author Enrique Moreno
 */
public class Computador {
   private Estado estado;
    private int state;

    public Computador(Estado estado) {
        this.state=estado.ordinal();
        this.estado = estado;
    }
    
    
    
    
    public int getState() {
        return state;
    }

    public void setState(Estado estado) {
        this.state=estado.ordinal();
    }
    
    
}
