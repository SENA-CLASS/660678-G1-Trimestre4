package edu.co.sena.ejemploasociationclass;

import edu.co.sena.ejemploasociationclass.Producto;

public class Item {

	private Producto productos;
	private int cantidad;
	private double valorUnitario;
	private double valorTotal;

    public Item(Producto producto, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.valorUnitario=producto.getPrecio();
        this.valorTotal=this.valorUnitario*this.cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProductos() {
        return productos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    
    
        
        

}