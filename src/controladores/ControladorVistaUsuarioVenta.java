/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
public class ControladorVistaUsuarioVenta {
    Singleton singleton;
    Tienda tienda;
    Historial historial;
    
    public ControladorVistaUsuarioVenta(){
        singleton = Singleton.getInstance();
        tienda = singleton.getTienda();
        historial = singleton.getHistorial();
    }
    public boolean agregar(Producto producto){
        return tienda.agregar(producto);
    }
    public Producto buscar(String id){
        return tienda.buscar(id);
    }
    public boolean eliminar(String id){
        return tienda.eliminar(id);
    }
    public boolean registrarPublicacion(Producto p){
        return historial.registrarPublicacion(p);
    }
    public String[] obtenerCategorias(){
        return tienda.obtenerCategorias();
    }
    public int obtenerProductosVentaUsuario(String user){
        return tienda.obtenerProductosEnVentaUsuario(user);
    }
    public String[][] construirMatrisProductosEnVentaUsuario(Usuario u){
        return tienda.construirMatrisProductosEnVentaUsuario(u);
    }
    public int obtenerProductosNoDisponiblesUsuario(String user){
        return tienda.obtenerProductosNoDisponiblesUsuario(user);
    }
    public String[][] construirMatrisProductosNoDisponiblesUsuario(Usuario u){
        return tienda.construirMatrisProductosNoDisponiblesUsuario(u);
    }
    public double dineroGeneradoUsuario(String user){
        return historial.dineroGeneradoUsuario(user);
    }
    public int obtenerVentasUsuario(String user){
        return historial.obtenerVentasUsuario(user);
    }
    public String[][] construirMatrisVentasUsuario(Usuario u){
        return historial.construirMatrisVentasUsuario(u);
    }
    public Venta buscarVenta(String id){
        return historial.buscarVenta(id);
    }
    public int obtenerPublicacionesTotalesUsuario(String user){
        return historial.obtenerPublicacionesTotalesUsuario(user);
    }
    public String[][] construirMatrisPublicacionesUsuario(String user){
        return historial.construirMatrisPublicacionesUsuario(user);
    }
    public Producto buscarPublicacion(String id){
        return historial.buscarPublicacion(id);
    }
    
}
