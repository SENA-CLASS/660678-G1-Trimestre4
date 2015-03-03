/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemploasociationclass;

/**
 *
 * @author Enrique Moreno
 */
public class FacturacionAPP {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta();
        c1.setNombre("jose");
        c1.setNumeroDocumento("123455");
        c1.setTipoDocumento("cc");
        
        Producto p1 = new Producto("rsad5345", "papas", 1000);
        Producto p2 = new Producto("rsad534t", "tumix", 100);
        Producto p3 = new Producto("rsad534435", "malboro ice", 400);
        Producto p4 = new Producto("rsad5wgeg", "menta", 100);
        Producto p5 = new Producto("rsgsd89", "chocorramo", 1000);
        Producto p6 = new Producto("rsad987sdfg", "jugo", 1000);
        
        Item i1 = new Item(p1, 2);
        Item i2 = new Item(p2, 2);
        Item i3 = new Item(p3, 2);
        Item i4 = new Item(p4, 2);
        Item i5 = new Item(p5, 2);
        Item i6 = new Item(p6, 2);
        
        Factura factura = new Factura(1, c1);
        factura.agregarItem(i1);
        factura.agregarItem(i2);
        factura.agregarItem(i3);
        factura.agregarItem(i4);
        factura.agregarItem(i5);
        factura.agregarItem(i6);
        
        System.out.println(factura.getTotalFactura());
    }
}
