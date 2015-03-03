package edu.co.sena.ejemploasociationclass;

import java.util.*;

public class Factura {

	
	List<Item> items;
	private int idFactura;
        private Date fecha;
        private Cuenta cliente;
        private double totalFactura=0; 

    public Factura(int idFactura, Cuenta cliente) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        items = new ArrayList<>();
    }
    
    public void agregarItem(Item item){
    this.items.add(item);
    this.totalFactura+=item.getValorTotal();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cuenta getCliente() {
        return cliente;
    }

    public void setCliente(Cuenta cliente) {
        this.cliente = cliente;
    }

    public double getTotalFactura() {
        return totalFactura;
    }
        
        
        

}