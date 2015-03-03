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
public class Manager extends Employee{
    private String depName;
    
    public Manager(int empid, String name, String ssn, double salary, String depName) {
        super(empid, name, ssn, salary);
        this.depName= depName;
    }

    public Manager() {
    }
    
    

    @Override
    public String getDetails() {
        return super.getDetails() + "depName=" + depName + '}';
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    
    
}
