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
public final class EstudinteArquitectura extends Estudiante{

    public EstudinteArquitectura(String idEstudiante, String nombres, String apellidos, String telefono, int edad) {
        super(idEstudiante, nombres, apellidos, telefono, edad);
    }
    
    
    
    
    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + super.getIdEstudiante() + ""
                + ", nombres=" + super.getNombres() + ", apellidos=" + super.getApellidos() + ""
                + ", telefono=" + super.getTelefono() + ", edad=" + super.getEdad()+'}';
    }
    
    
    
}
