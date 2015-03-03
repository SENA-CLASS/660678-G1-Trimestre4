/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploclases1;

/**
 *
 * @author Enrique Moreno
 */
public class Empleado implements Comparable<Empleado>{
    public String tipoDocumento;
    public String numeroDocumeto;
    public String nombre;
    public String apelliedo;
    public String sexo;

    public Empleado() {
    }
    
    public Empleado(String tipoDocumento, String numeroDocumeto, String nombre, String apelliedo, String sexo) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumeto = numeroDocumeto;
        this.nombre = nombre;
        this.apelliedo = apelliedo;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumeto() {
        return numeroDocumeto;
    }

    public void setNumeroDocumeto(String numeroDocumeto) {
        this.numeroDocumeto = numeroDocumeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelliedo() {
        return apelliedo;
    }

    public void setApelliedo(String apelliedo) {
        this.apelliedo = apelliedo;
    }

    @Override
    public int compareTo(Empleado o) {
        int resultado =-1;
        if (this.tipoDocumento.equals(o.tipoDocumento) && this.numeroDocumeto.equals(o.numeroDocumeto)){
        resultado = 0;
        }
            return resultado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "tipoDocumento=" + tipoDocumento + ", numeroDocumeto=" + numeroDocumeto + ", nombre=" + nombre + ", apelliedo=" + apelliedo + ", sexo=" + sexo + '}';
    }

    
    
    
    
    
    
}
