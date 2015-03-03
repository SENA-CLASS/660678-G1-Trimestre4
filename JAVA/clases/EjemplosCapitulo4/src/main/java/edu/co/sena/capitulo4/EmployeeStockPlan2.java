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
public class EmployeeStockPlan2 {
    public static  int grantStock(Employee e) {
        int retorno =0;
        if (e instanceof Manager){
        retorno= 1;
        }else if (e instanceof Admin){
        retorno= 2;
        }else if(e instanceof Director){
        retorno= 3;
        }
        return retorno;
    }
    
    public static void modifyDepaforEmployed(Employee e, String dep){
        
        if (e instanceof Manager){
        Manager t = (Manager) e;
        t.setDepName(dep);
        }else if(e instanceof Director){
        Director t = (Director) e;
        t.setDepName(dep);
        }
        
    
    }
}
