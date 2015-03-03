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
public class Pasajero implements Comparable<Pasajero>{
    private String tipoDocumeto;
    private String numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellidos;
    private String segundoApellidos;
    private double saldo;

    public Pasajero(String tipoDocumeto, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellidos, String segundoApellidos) {
        this.tipoDocumeto = tipoDocumeto;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellidos = primerApellidos;
        this.segundoApellidos = segundoApellidos;
        this.saldo=0;
    }

    public String getTipoDocumeto() {
        return tipoDocumeto;
    }

    public void setTipoDocumeto(String tipoDocumeto) {
        this.tipoDocumeto = tipoDocumeto;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellidos() {
        return primerApellidos;
    }

    public void setPrimerApellidos(String primerApellidos) {
        this.primerApellidos = primerApellidos;
    }

    public String getSegundoApellidos() {
        return segundoApellidos;
    }

    public void setSegundoApellidos(String segundoApellidos) {
        this.segundoApellidos = segundoApellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void agregarSaldo(double valor) {
        this.saldo+=valor;
    }
    
    public void cobrarPasaje(){
        this.saldo-=1700;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "tipoDocumeto=" + tipoDocumeto + ", numeroDocumento=" + numeroDocumento + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellidos=" + primerApellidos + ", segundoApellidos=" + segundoApellidos + ", saldo=" + saldo + '}';
    }

    @Override
    public int compareTo(Pasajero o) {
        int retorno = -2;
        if(this.tipoDocumeto.equals(o.tipoDocumeto) && this.numeroDocumento.equals(o.numeroDocumento)){
        retorno=-1;
        }
        return retorno;
    }
    
    
    
    
    
}
