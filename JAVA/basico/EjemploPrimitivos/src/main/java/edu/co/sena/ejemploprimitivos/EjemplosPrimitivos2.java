/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploprimitivos;

/**
 *
 * @author Enrique Moreno
 */
public class EjemplosPrimitivos2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        byte dpbyte=12;
        short dpshort = 31524;
        int dpint = 3443534;
        long dplong = 435235;
        
        float dpfloat= 3.5F;
        double dpdouble = 3.45;
        
        char dpchar = 'a';
        
        boolean dpboolean= true;
        
        System.out.println(dpbyte);
        System.out.println(dpshort);
        System.out.println(dpint);
        System.out.println(dplong);
        
        System.out.println(dpfloat);
        System.out.println(dpdouble);
        
        System.out.println(dpchar);
        System.out.println(dpboolean);
        
        //literales
        float vlfloat = 324_233_423F;
        long vllong = 5_254_424_523_542_354L;        
        
        System.out.println(vlfloat);
        System.out.println(vllong);
        
        //casting
        
        int a = 120;
        float b= (float)a;
        
        float af= 120.56F;
        int bf = (int)af;
        
        boolean gg = true;
        System.out.println(!gg);
        
        //string
        
        String holaMundo= "hola mundo"+" de java";
        String holaMundoMalaPractiva= new String("hola mundo mal hecho");//mala practica
        
        System.out.println(holaMundo.length());
        System.out.println(holaMundoMalaPractiva);
        
        int aaaa=5;
        int bbbb=6;
        int res = (a>b)?aaaa:bbbb;
        System.out.println(res);
        
        if (holaMundo instanceof String) {
            System.out.println("string");
        } else {
            System.out.println("no string");
        }
        
        
    }
    
}
