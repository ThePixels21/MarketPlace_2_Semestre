/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Carrito;
import modelo.Historial;
import modelo.Producto;
import modelo.Singleton;
import modelo.Tienda;
import modelo.Usuario;
import modelo.Venta;

/**
 *
 * @author Pixels
 */
public class ControladorVistaUsuarioCompra {
    Singleton singleton;
    Tienda tienda;
    Historial historial;
    
    public ControladorVistaUsuarioCompra(){
        singleton = Singleton.getInstance();
        tienda = singleton.getTienda();
        historial = singleton.getHistorial();
    }
    
    public int obtenerProductosDisponiblesUsuario(Usuario u){
        return tienda.obtenerProductosDisponiblesUsuario(u);
    }
    public String[][] costruirMatrisProductosDisponiblesUsuario(Usuario u){
        return tienda.costruirMatrisProductosDisponiblesUsuario(u);
    }
    public Producto buscarProducto(String id){
        return tienda.buscar(id);
    }
    public String[] obtenerCategoriasSeleccionar(){
        return tienda.obtenerCategoriasSeleccionar();
    }
    public String[][] filtrarProductosUsuarioCategoriaPrecio(Usuario u, String categoria, double max, double min){
        return tienda.filtrarProductosUsuarioCategoriaPrecio(u, categoria, max, min);
    }
    public String[][] filtrarProductosUsuarioPrecio(Usuario u, double max, double min){
        return tienda.filtrarProductosUsuarioPrecio(u, max, min);
    }
    public boolean agregarCarrito(Carrito carrito){
        return tienda.agregarCarrito(carrito);
    }
    public Carrito buscarCarrito(String user){
        return tienda.buscarCarrito(user);
    }
    public boolean registrarVenta(Venta venta){
        return historial.registrar(venta);
    }
    public Venta buscarVenta(String id){
        return historial.buscarVenta(id);
    }
    public int obtenerComprasUsuario(String user){
        return historial.obtenerComprasUsuario(user);
    }
    public String[][] construirMatrisComprasUsuario(Usuario u){
        return historial.construirMatrisComprasUsuario(u);
    }
    public double dineroTotalGastadoUsuario(String user){
        return historial.dineroTotalGastadoUsuario(user);
    }
    public String[][] construirMatrisDineroGastadoUsuario(String user){
        return historial.construirMatrisDineroGastadoUsuario(user);
    }
    
}
