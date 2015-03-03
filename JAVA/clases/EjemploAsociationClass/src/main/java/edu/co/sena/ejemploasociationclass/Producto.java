package edu.co.sena.ejemploasociationclass;

public class Producto {

	private String idProducto;
        private String nombre;
        private double precio;

    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
        
        

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
        
        

}