/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pixels
 */
public class Carrito {
    private Usuario usuario;
    private final ArrayList<Producto> productosCarrito;
    
    public Carrito(Usuario usuario){
        this.usuario = usuario;
        productosCarrito = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Producto> getCarrito() {
        return productosCarrito;
    }
    /**
     * Agregar un producto al carrito de un usuario.
     * @param producto recibe el producto a registrar
     * @return un true si se guardó correctamente, en su defecto un false.
     */
    public boolean agregar(Producto producto){
        Producto aux = buscar(producto.getId());
        if (aux == null) {
            productosCarrito.add(producto);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar un producto en el carrito de un usuario.
     * @param id id del producto
     * @return retorna el producto buscado en el carrito, en su defecto un null
     */
    public Producto buscar(String id){
        for (Producto producto : productosCarrito) {
            if(producto!=null && producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }
    /**
     * Permite eliminar un producto del carrito.
     * @param id id del producto a eliminar.
     * @return retorna un true si se eliminó, en su defecto un false.
     */
    public boolean eliminar(String id){
        for (Producto producto : productosCarrito) {
            if (producto.getId().equals(id)) {
                productosCarrito.remove(producto);
                return true;
            }
        }
        return false;
    }
    /**
     * Permite eliminar todos los productos del carrito
     */
    public void eliminarTodo(){
        productosCarrito.clear();
    }
    /**
     * Valida si los productos que hay en el carrito siguen estando disponibles
     * o no han sido eliminados
     */
    public void validarProductosCarrito(){
        Iterator<Producto> itr = productosCarrito.iterator();
        while(itr.hasNext()) {
            Producto p = itr.next();
            Producto aux = Singleton.getInstance().getTienda().buscar(p.getId());
            if(p.getStock() == 0 || !p.isDisponible() || aux == null){
                itr.remove();
            }
        }
    }
    /**
     * Construye una matris para la tabla del carrito con todos los productos que
     * existen en este
     * @return la matriz con todos los productos del carrito
     */
    public String[][] construirMatrisCarrito(){
        String mtrx[][] = new String[productosCarrito.size()][4];
        for(int i = 0; i<productosCarrito.size(); i++){
            mtrx[i][0] = productosCarrito.get(i).getNombre();
            mtrx[i][1] = Double.toString(productosCarrito.get(i).getPrecio());
            mtrx[i][2] = productosCarrito.get(i).getId();
            mtrx[i][3] = "1";
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de productos que hay en el carrito de un usuario
     * @return la cantidad de productos en el carrito.
     */
    public int obtenerCantidadProductos(){
        return productosCarrito.size();
    }
    /**
     * Permite obtener un producto específico del carrito dependiendo de un index
     * @param i la posición del producto en la lista
     * @return retorna el producto en la posición ingresada.
     */
    public Producto obtenerProductoIndex(int i){
        return productosCarrito.get(i);
    }
    
}
