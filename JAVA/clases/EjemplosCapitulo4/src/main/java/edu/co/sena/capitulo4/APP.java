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
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e= new Manager(12345, "jose", "45254234-234-52-54", 4352354, "contabilidad");
        
        System.out.println(e.getDetails());
        System.out.println(e.getClass().getName());
        
        
        System.out.println(e.getDetails());
        EmployeeStockPlan2.modifyDepaforEmployed(e, "cartera");
        System.out.println(e.getDetails());
        
        Employee ee= (Employee)e;
        System.out.println(ee.getDetails());
        System.out.println(ee.getClass().getName());
        
        Director d = new Director();
        Manager m = new Manager();
        System.out.println(d.getClass().getName());
        System.out.println(m.getClass().getName());
        
        Employee e2 = m;
        System.out.println(e2.getClass().getName());
        
        Manager mm = d;
        System.out.println(mm.getClass().getName());
        
        Manager dd = (Manager)e;
        System.out.println(dd.getClass().getName());
        
        
    }   
    
}
