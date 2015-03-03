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
public class Estudiante implements Monitores {
    private String idEstudiante;
    private String nombres;
    private String apellidos;
    private String telefono;
    private int edad;

    public Estudiante(String idEstudiante, String nombres, String apellidos, String telefono, int edad) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    public Estudiante(){
    }
    
    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }
    
    public void setEdad(double edad) {
        this.edad = (int)edad;
    }
    
    public void setEdad(char edad) {
        this.edad = (int)edad;
    }
    
    public void setEdad(float edad) {
        this.edad = (int)edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", edad=" + edad + '}';
    }

    @Override
    public void revisarCompuatores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pedirCarnets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
