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
public class Moto {
    private Motor motor;
    private String serial;
    private String modelo;
    private String marca;
    private Llanta llantas[] = new Llanta[2];
    private int contadorLlantas=0;

    
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void agregarLlantas(Llanta llanta) {
        if (this.contadorLlantas<=1){
        this.llantas[contadorLlantas] =llanta;
        this.contadorLlantas++;
        }
        
        
        
    }

    public int getContadorLlantas() {
        return contadorLlantas;
    }

    public void setContadorLlantas(int contadorLlantas) {
        this.contadorLlantas = contadorLlantas;
    }
    
    
    public class Marco extends MarcoMoto{
        private String color;
        private String material;
        private String serial;
        

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getSerial() {
            return serial;
        }

        public void setSerial(String serial) {
            this.serial = serial;
        }
        
    
    
    }
    
    
    
    
}
