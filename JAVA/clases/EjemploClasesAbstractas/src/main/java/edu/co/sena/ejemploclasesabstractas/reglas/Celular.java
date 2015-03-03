/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclasesabstractas.reglas;

/**
 *
 * @author Enrique Moreno
 */
public abstract class Celular extends DispositivosElectronico implements TelefonoAPP{
    public abstract void llamar();
    public abstract String numeroContacto(int contacto);
    
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
