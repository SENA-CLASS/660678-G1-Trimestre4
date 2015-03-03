/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sen.clases.contenida;

/**
 *
 * @author Enrique Moreno
 */
public class ContenidaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        
        
        Motor motor1= new Motor();
        motor1.setCaballosFuerza("50");
        motor1.setCilindraje("1200 cc");
        motor1.setPeso("1000 kl");
        
        Llanta llanta1 = new Llanta();
        llanta1.setMarca("bron");
        llanta1.setMaterial("caucho");
        llanta1.setTamano("15 pulgadas");
        Llanta llanta2 = new Llanta();
        llanta2.setMarca("goodyears");
        llanta2.setMaterial("caucho");
        llanta2.setTamano("15 pulgadas");
//        Llanta llanta3 = new Llanta();
//        llanta3.setMarca("pajarito");
//        llanta3.setMaterial("caucho");
//        llanta3.setTamano("15 pulgadas");
//        
        Moto m1 = new Moto();
        m1.setMotor(motor1);
        m1.setModelo("2014");
        m1.setSerial("r55jk23h45kj");
        m1.setMarca("yamaha");
        m1.agregarLlantas(llanta1);
        m1.agregarLlantas(llanta2);
        //m1.agregarLlantas(llanta3);
        
        Moto.Marco marco1 = m1.new Marco();
        marco1.setColor("rojo");
        marco1.setMaterial("acero");
        marco1.setSerial("545273529834");
        
        Llanta llantasTempo[] = m1.getLlantas();
        
        for (Llanta llanta : llantasTempo) {
            System.out.println(llanta.getMarca());
            System.out.println(llanta.getMaterial());
            //System.out.println(llanta.getSerial());
        }
        
        for (int i = 0; i < m1.getContadorLlantas(); i++) {
            System.out.println(llantasTempo[i].getMarca());     
            //System.out.println(llantasTempo[i].getSerial());     
            System.out.println(llantasTempo[i].getMaterial());     
            }
        
    }
    
}
