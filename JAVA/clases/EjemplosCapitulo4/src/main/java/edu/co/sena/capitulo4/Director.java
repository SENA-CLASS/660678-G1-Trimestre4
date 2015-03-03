/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.capitulo4;

/**
 *
 * @author Enrique Moreno
 */
public class Director extends Manager{
    private double bubget;
    
    public Director(){}

    public Director(double bubget, int empid, String name, String ssn, double salary, String depName) {
        super(empid, name, ssn, salary, depName);
        this.bubget = bubget;
    }

    public double getBubget() {
        return bubget;
    }

    public void setBubget(double bubget) {
        this.bubget = bubget;
    }
    
    
}
