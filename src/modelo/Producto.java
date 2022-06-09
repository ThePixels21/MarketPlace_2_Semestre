package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pixels
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private String desc;
    private Categoria categoria;
    private Usuario usuario;
    private int stock;
    private boolean disponible;
    private String fechaPublicacion;

    public Producto(String nombre, double precio, String desc, Categoria categoria, Usuario usuario, int stock, boolean disponible) {
        this.id = asignarId();
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
        this.categoria = categoria;
        this.usuario = usuario;
        this.stock = stock;
        this.disponible = disponible;
        this.fechaPublicacion = fechaActual();
    }
    //Producto publicado
    public Producto(String nombre, double precio, String desc, Categoria categoria, Usuario usuario, String id){
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
        this.categoria = categoria;
        this.usuario = usuario;
        this.id = id;
        this.fechaPublicacion = fechaActual();
    }
    //Producto vendido
    public Producto(String nombre, double precio, String desc, Categoria categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
        this.categoria = categoria;
    }
    public String getId() {
        return id;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean estado) {
        this.disponible = estado;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    /**
     * Permite obtener la fecha actual
     * @return un String con la fecha actual
     */
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    /**
     * Permite asignar un id a un producto
     * @return un String con el id asignado al producto
     */
    private String asignarId(){
        return Singleton.getInstance().getHistorial().asignarIdProducto();
    }
    /**
     * Cambia el estado de disponibilidad de un producto dependiendo de su stock
     */
    public void diponibilidad(){
        if(stock == 0){
            this.disponible = false;
        }
    }

}
