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
public class EstIngenieria extends Esudiante implements Monitor{

    @Override
    public void revisarSalon() {
        System.out.println("reviso salon");
    }

    @Override
    public void recogerCarnet() {
        System.out.println("recojo carntet");
    }
    
}
