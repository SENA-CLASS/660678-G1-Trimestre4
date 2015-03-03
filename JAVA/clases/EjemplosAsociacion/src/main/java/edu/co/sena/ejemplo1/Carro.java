/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

/**
 *
 * @author Enrique Moreno
 */
public class Carro {

    private String placa;
    private String modelo;
    private String marca;
    private int puestos;
    private Persona pasajeros[];
    private int contadorPuestos = 0;

    public Carro(String placa, String modelo, String marca, int puestos) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.puestos = puestos;
        this.pasajeros = new Persona[puestos];
    }

    public boolean buscarPasajeros(Persona pasajero) {
        boolean resultado = false;
        for (int i = 0; i < this.contadorPuestos; i++) {
            if (this.pasajeros[i].compareTo(pasajero) == 0) {
                resultado = true;
            }
        }
        return resultado;
    }

    public void agregarPasajeros(Persona pasajero) {
        if (buscarPasajeros(pasajero) == false && contadorPuestos < puestos) {
            this.pasajeros[contadorPuestos] = pasajero;
            contadorPuestos++;
        }
    }

    public void eliminarPasajero(Persona pasajero){
        if (buscarPasajeros(pasajero)== true) {
            Persona pasajerosTemp[] = new Persona[puestos];
            for (int i = 0; i < contadorPuestos; i++) {
                
            }
        
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public Persona[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Persona[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getContadorPuestos() {
        return contadorPuestos;
    }

    public void setContadorPuestos(int contadorPuestos) {
        this.contadorPuestos = contadorPuestos;
    }

}
