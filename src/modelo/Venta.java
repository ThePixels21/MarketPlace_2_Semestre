package modelo;

/**
 *
 * @author Pixels
 */
public class Venta{
    private final String id;
    private Usuario vendedor;
    private Usuario comprador;
    private ProductoVendido producto;
    private final double precioTotal;
    private final String fechaVenta;

    public Venta(Usuario vendedor, Usuario comprador, ProductoVendido producto) {
        this.id = asignarId();
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.producto = producto;
        this.precioTotal = producto.getPrecio()*producto.getCantidad();
        this.fechaVenta = Producto.fechaActual();
    }

    public String getId() {
        return id;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public ProductoVendido getProducto() {
        return producto;
    }

    public void setProducto(ProductoVendido producto) {
        this.producto = producto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }
    /**
     * Permite asignarle un id a una venta
     * @return la id asignada a la venta
     */
    private String asignarId(){
        return Singleton.getInstance().getHistorial().determinarIdVenta();
    }
    
}
