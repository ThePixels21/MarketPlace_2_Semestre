/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Categoria;
import modelo.Historial;
import modelo.Producto;
import modelo.Registro;
import modelo.Singleton;
import modelo.Tienda;
import modelo.Usuario;
import modelo.Venta;

/**
 *
 * @author Pixels
 */
public class ControladorVistaAdministrador {
    Registro registro;
    Tienda tienda;
    Historial historial;
    Singleton singleton;
    
    public ControladorVistaAdministrador(){
        singleton = Singleton.getInstance();
        registro = singleton.getRegistro();
        tienda = singleton.getTienda();
        historial = singleton.getHistorial();
    }
    public boolean registrar(Usuario usuario){
        return registro.registrar(usuario);
    }
    public Usuario buscar(String user){
        return registro.buscar(user);
    }
    public Usuario buscarId(String id){
        return registro.buscarId(id);
    }
    public Usuario buscarCorreo(String correo){
        return registro.buscarCorreo(correo);
    }
    public Usuario buscarTelefono(String telefono){
        return registro.buscarTelefono(telefono);
    }
    public boolean eliminar(String user){
        return registro.eliminar(user);
    }
    public Usuario buscarAdmin(String user){
        return registro.buscarAdmin(user);
    }
    public boolean validarUsuario(Usuario usuario){
        return registro.validarUsuario(usuario);
    }
    public int contarUsuarios(){
        return registro.contarUsuarios();
    }
    public String[][] construirMatris(){
        return registro.construirMatris();
    }
    public String[][] contruirMatrisPorUsiario(Usuario u){
        return registro.contruirMatrisPorUsiario(u);
    }
    public String[] obtenerDiasMes(String mes){
        return registro.obtenerDiasMes(mes);
    }
    public int obtenerTotalProductos(){
        return tienda.obtenerTotalProductos();
    }
    public int obtenerProductosEnVenta(){
        return tienda.obtenerProductosEnVenta();
    }
    public String[][] construirMatrisProductosEnVenta(){
        return tienda.construirMatrisProductosEnVenta();
    }
    public String[][] contruirMatrisFiltroProducto(String id){
        return tienda.contruirMatrisFiltroProducto(id);
    }
    public Producto buscarProducto(String id){
        return tienda.buscar(id);
    }
    public boolean eliminarProducto(String id){
        return tienda.eliminar(id);
    }
    public Venta buscarVenta(String idVenta){
        return historial.buscarVenta(idVenta);
    }
    public int obtenerVentasTotales(){
        return historial.obtenerVentasTotales();
    }
    public String[][] construirMatrisVentasTotales(){
        return historial.construirMatrisVentasTotales();
    }
    public String[] obtenerCategorias(){
        return tienda.obtenerCategorias();
    }
    public Producto buscarPublicacion(String id){
        return historial.buscarPublicacion(id);
    }
    public int obtenerCantidadPublicaciones(){
        return historial.obtenerCantidadPublicaciones();
    }
    public String[][] construirMatrisPublicaciones(){
        return historial.construirMatrisPublicaciones();
    }
    public double dineroTotalGastado(){
        return historial.dineroTotalGastado();
    }
    public String[][] construirMatrisDineroTotalGastado(){
        return historial.construirMatrisDineroTotalGastado();
    }
    public String[][] construirMatrisDineroTotalGenerado(){
        return historial.construirMatrisDineroTotalGenerado();
    }
    public double dineroTotalGastadoUsuario(String user){
        return historial.dineroTotalGastadoUsuario(user);
    }
    public double dineroGeneradoUsuario(String user){
        return historial.dineroGeneradoUsuario(user);
    }
    public int obtenerComprasUsuario(String user){
        return historial.obtenerComprasUsuario(user);
    }
    public int obtenerVentasUsuario(String user){
        return historial.obtenerVentasUsuario(user);
    }
    public String[][] matrisVentasUsuario(Usuario u){
        return historial.matrisVentasUsuario(u);
    }
    public String[][] filtrarMatrisDineroGastadoUsuario(String user){
        return historial.filtrarMatrisDineroGastadoUsuario(user);
    }
    public String[][] filtrarMatrisDineroGeneradoUsuario(String user){
        return historial.filtrarMatrisDineroGeneradoUsuario(user);
    }
    public Categoria buscarCategoria(String nombre){
        return tienda.buscarCategoria(nombre);
    }
    public boolean agregarCategoria(Categoria c){
        return tienda.agregarCategoria(c);
    }
    public boolean eliminarCategoria(String nombre){
        return tienda.eliminarCategoria(nombre);
    }
    public String[][] matrisCategorias(){
        return tienda.matrisCategorias();
    }
    
}
