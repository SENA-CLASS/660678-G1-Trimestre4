/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasesabstractas.carrostatic.constante;

/**
 *
 * @author Enrique Moreno
 */
public class Computador {
    public static final int APAGADO=2;
    public static final int PRENDIDO=1;
    public static final int SUSPENDIDO=0;
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        
        switch(state){
            case APAGADO:
                this.state = state;
                break;
            case PRENDIDO:
                this.state = state;
                break;
            case SUSPENDIDO:
                this.state = state;
                break;
            default:
                this.state=APAGADO;
        }
    }
    
    
}
