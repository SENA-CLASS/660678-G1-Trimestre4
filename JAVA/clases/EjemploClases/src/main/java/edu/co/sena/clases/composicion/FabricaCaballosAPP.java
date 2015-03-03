/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.clases.composicion;

/**
 *
 * @author Enrique Moreno
 */
public class FabricaCaballosAPP {
    
    public static void main(String[] args) {
        //primera donde se destruye el objeto se destruyen las partes
        
        Caballo c1= new Caballo(new Cabeza(new Ojo(),new Ojo(),new Craneo(),new Cerebro(),new Boca(50)
        ),  new Tronco(new Columna(), new Corazon(), new Pulmones(), new Rinones()),
                new Estremidades(new Femur(), new Casco()));
        
        System.out.println(c1.getCabeza().getCraneo().getClass().getName());
        System.out.println(c1.getCabeza().getCerebro().getClass().getName());
        System.out.println(c1.getCabeza().getVisera().getClass().getName());
        
        System.out.println(c1.getCabeza().getBoca().getDientes());
        System.out.println(c1.getCabeza().getVisera().getMarca());
        Visera v1 = new Visera("caballo el algo");
        c1.getCabeza().setVisera(v1);
        System.out.println(c1.getCabeza().getVisera().getMarca());
      //cuando los objetos no se desrtruyen
        
        
        Ojo ojo1= new Ojo();
        Ojo ojo2= new Ojo();
        Craneo craneo1 = new Craneo();
        Cerebro cerebro1 = new Cerebro();
        Boca oca1 = new Boca(70);
        Cabeza ca1 = new Cabeza(ojo2, ojo2, craneo1, cerebro1, oca1);
        
        Columna columna1 =new Columna();
        Corazon cora = new Corazon();
        Rinones rinones = new Rinones();
        Pulmones pul = new Pulmones();
        Tronco t1 = new Tronco(columna1, cora, pul, rinones);
        
        Femur fen = new Femur();
        Casco casco = new Casco();
        Estremidades estre = new Estremidades(fen, casco);
        
        Caballo c2 = new Caballo(ca1, t1, estre);
        
        System.out.println(c2.getCabeza().getBoca().getDientes());
        
    }
    
    
    
    
}
