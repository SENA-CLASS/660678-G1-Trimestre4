/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclaseanonima;

/**
 *
 * @author Enrique Moreno
 */
public class EjemploAnonimo {
    private Object o = new Object(){

        @Override
        public String toString() {
            return "hola mundo"; //To change body of generated methods, choose Tools | Templates.
        }
    
    
    
    };

    public Object getO() {
        return o;
    }
    
    
    
}
