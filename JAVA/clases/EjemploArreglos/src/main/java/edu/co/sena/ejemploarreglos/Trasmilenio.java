/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemploarreglos;

/**
 *
 * @author Enrique Moreno
 */
public class Trasmilenio {

    private String placa;
    private String color;
    private String marca;
    private String modelo;
    private int capacidad;
    private String clase;
    private Pasajero pasajeros[];
    public int contadorPasajeros = 0;

    public Trasmilenio(String placa, String color, String marca, String modelo, String clase) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.clase = clase;

        switch (this.clase) {
            case "articulado":
                this.capacidad = 4;
                break;
            case "biarticulado":
                this.capacidad = 189;
                break;
        }
        pasajeros = new Pasajero[capacidad];

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

    public void agregarPasajero(Pasajero pasajero) {
        if (contadorPasajeros < this.capacidad) {

            if (existePasajero(pasajero) == false) {
                
                if(pasajero.getSaldo()>= 1700){
                pasajero.cobrarPasaje();
                pasajeros[contadorPasajeros] = pasajero;
                contadorPasajeros++;
                
                }
                
            }
        }

    }
    
    public void sacarPasajeros(Pasajero pasajero){
    Pasajero pasajeroTemp[]= new Pasajero[capacidad];
    int contadorPasajeroTemp=0;
    boolean bandera= false;
        if (existePasajero(pasajero)) {
            for (int i = 0; i < this.contadorPasajeros; i++) {
                if (pasajeros[i].compareTo(pasajero)==-2) {
                    pasajeroTemp[contadorPasajeroTemp]=pasajeros[i];
                    contadorPasajeroTemp++;
                }else if (pasajeros[i].compareTo(pasajero)==-1){
                bandera=true;
                }
            }
            if(bandera){
            this.pasajeros= pasajeroTemp;
            contadorPasajeros=contadorPasajeroTemp;
            }
        }
    
    
    }

    public boolean existePasajero(Pasajero pasajero) {
        boolean retorno = false;
        for (int i = 0; i < contadorPasajeros; i++) {
            if (pasajeros[i].compareTo(pasajero) == -1) {
                retorno = true;
            }
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Trasmilenio{" + "placa=" + placa + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + ", clase=" + clase + ", contadorPasajeros=" + contadorPasajeros + '}';
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

}
