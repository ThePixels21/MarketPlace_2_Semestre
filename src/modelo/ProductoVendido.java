/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pixels
 */
public class ProductoVendido extends Producto{
    private final int cantidad;
    
    public ProductoVendido(String nombre, double precio, String desc, Categoria categoria, int cantidad) {
        super(nombre, precio, desc, categoria);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
