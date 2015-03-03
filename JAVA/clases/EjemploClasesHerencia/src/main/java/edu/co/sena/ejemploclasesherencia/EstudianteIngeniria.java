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
public class EstudianteIngeniria extends Estudiante{
    private String tesis;
    

    public EstudianteIngeniria(String tesis, String idEstudiante, String nombres, String apellidos, String telefono, int edad) {
        super(idEstudiante, nombres, apellidos, telefono, edad);
        this.tesis = tesis;
    }

   public EstudianteIngeniria(){
   }
    
     public final String getIdEstudiante() {
        return super.getIdEstudiante();
    }
    
    

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }
    
 
    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + super.getIdEstudiante() + ""
                + ", nombres=" + super.getNombres() + ", apellidos=" + super.getApellidos() + ""
                + ", telefono=" + super.getTelefono() + ", edad=" + super.getEdad()+" EstudianteIngeniria{" + "tesis=" + tesis + '}'+ '}';
    }
    
    
}
