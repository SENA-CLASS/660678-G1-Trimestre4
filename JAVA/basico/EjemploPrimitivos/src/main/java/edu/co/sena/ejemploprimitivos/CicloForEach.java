/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploprimitivos;
import java.util.ArrayList;

/**
 *
 * @author Enrique Moreno
 */
public class CicloForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arreglito = new ArrayList<>();
        arreglito.add(1);
        arreglito.add(2);
        arreglito.add(3);
        arreglito.add(4);
        arreglito.add(5);
        
        for (Integer integer : arreglito) {
            System.out.println(integer);
        }
        
    }
    
}
