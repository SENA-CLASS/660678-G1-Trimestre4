/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasesherencia;

/**
 *
 * @author Enrique Moreno
 */
public class EstudiantesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable{
        Estudiante e1 = new Estudiante("491124","hernando", "enrique", "3452354245",30);
        
        EstudianteIngeniria ei1 = new EstudianteIngeniria("poo","491124","hernando", "enrique", "3452354245",30);
        
        EstudinteArquitectura ea1 = new EstudinteArquitectura("491124","hernando", "enrique", "3452354245",30);
        
        Estudiante e2 = new EstudianteIngeniria("POO", "4345254", "camilo", "torres", "45235423", 20);
        
        System.out.println(e2.getClass().getName());
        
        EstudinteArquitectura ei3 = (EstudinteArquitectura)e1;
        
        System.out.println(e1.toString());
        System.out.println(ei1.toString());
        System.out.println(ea1.toString());
        System.out.println(ei3.toString());
        
        
    }
    
}
