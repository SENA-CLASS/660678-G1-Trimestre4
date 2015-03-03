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
public class Employee {
    private int empid;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {
    }
    
    

    public Employee(int empid, String name, String ssn, double salary) {
        this.empid = empid;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    
    

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    protected String getDetails() {
        return "Employee{" + "empid=" + empid + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + '}';
    }
    
    
    
}
