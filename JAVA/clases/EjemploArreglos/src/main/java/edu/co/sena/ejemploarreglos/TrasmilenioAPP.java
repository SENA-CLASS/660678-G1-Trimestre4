/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploarreglos;

/**
 *
 * @author Enrique Moreno
 */
public class TrasmilenioAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("cc", "452345", "jose", "vicente", "rojas", "pinilla");
        Pasajero p2 = new Pasajero("cc", "452346", "jose", "vicente", "rojas", "pinilla");
        Pasajero p3 = new Pasajero("cc", "452347", "jose", "vicente", "rojas", "pinilla");
        Pasajero p4 = new Pasajero("cc", "452348", "jose", "vicente", "rojas", "pinilla");
        Pasajero p5 = new Pasajero("cc", "452349", "jose", "vicente", "rojas", "pinilla");
  
        p1.agregarSaldo(50000);
        p2.agregarSaldo(2000);
        p3.agregarSaldo(3000);
        p4.agregarSaldo(2500);
        p5.agregarSaldo(1000);
        
        Trasmilenio t1 = new Trasmilenio("aaa123", "rojo", "trasmileio", "2012", "articulado");
        t1.agregarPasajero(p1);
        t1.agregarPasajero(p2);
        t1.agregarPasajero(p3);
        t1.agregarPasajero(p4);
        t1.agregarPasajero(p5);
        System.out.println(t1.toString());
        t1.sacarPasajeros(p1);
        System.out.println(t1.toString());

        Pasajero pasajerosTemp[] = t1.getPasajeros();
        for (int i = 0; i < t1.contadorPasajeros; i++) {
            System.out.println(pasajerosTemp[i].toString());
        }
        
        
    }
    
}
