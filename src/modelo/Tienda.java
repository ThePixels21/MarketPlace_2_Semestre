/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pixels
 */
public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Categoria> categorias;
    private ArrayList<Carrito> carritos;
    
    public Tienda(){
        productos = new ArrayList<>();
        categorias = new ArrayList<>();
        carritos = new ArrayList<>();
        crearCategorias();
    }
    /**
     * Permite agregar un nuevo producto a la venta
     * @param producto el producto a agregar
     * @return un boleano true si se publicó, en su defecto false.
     */
    public boolean agregar(Producto producto){
        Producto aux = buscar(producto.getId());
        if(aux == null){
            productos.add(producto);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar un producto publicado en el sistema
     * @param id el id que identifica el producto a buscar
     * @return el producto si se encontró, en su defecto un null
     */
    public Producto buscar(String id){
        for (Producto producto : productos) {
            if(producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }
    /**
     * Permite eliminar un producto de la venta
     * @param id el id identificador del producto a eliminar
     * @return un boleano true si se eliminó, en su defecto un false.
     */
    public boolean eliminar(String id){
        for (Producto producto : productos) {
            if(producto.getId().equals(id)){
                productos.remove(producto);
                return true;
            }
        }
        return false;
    }
    /**
     * Permite agregar una nueva categoría en el sistema
     * @param c la categoría a agregar
     * @return un boleano true si se agregó, en su defecto un false.
     */
    public boolean agregarCategoria(Categoria c){
        Categoria aux = buscarCategoria(c.getNombre());
        if (aux == null) {
            categorias.add(c);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar una categoría registrada en el sistema
     * @param nombre el nombre de la categoría a buscar
     * @return la categoría si se encontró, de lo contrario un null
     */
    public Categoria buscarCategoria(String nombre){
        for (Categoria c : categorias) {
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }
        return null;
    }
    /**
     * Permite eliminar una categoría de la plataforma
     * @param nombre el nombre de la categoría a eliminar
     * @return un boleano true si se eliminó, de lo contrario un false
     */
    public boolean eliminarCategoria(String nombre){
        for (Categoria categoria : categorias) {
            if(categoria.getNombre().equals(nombre)){
                categorias.remove(categoria);
                return true;
            }
        }
        return false;
    }
    /**
     * Crea diferentes objetos de la clase Categoría y los añade a la lista categorias
     */
    private void crearCategorias(){
        categorias.add(new Categoria("Tecnologia"));
        categorias.add(new Categoria("Electrodomesticos"));
        categorias.add(new Categoria("Hogar y muebles"));
        categorias.add(new Categoria("Vehiculos"));
        categorias.add(new Categoria("Supermercado"));
        categorias.add(new Categoria("Deportes"));
        categorias.add(new Categoria("Belleza"));
        categorias.add(new Categoria("Moda"));
        categorias.add(new Categoria("Inmuebles"));
        categorias.add(new Categoria("Herramientas"));
        categorias.add(new Categoria("Juegos y juguetes"));
        categorias.add(new Categoria("Salud"));
        categorias.add(new Categoria("Servicios"));
    }
    /**
     * Crea un array con un String "Seleccionar" en la primera posición, y en 
     * las otras un el nombre de cada categoría registrada en la plataforma
     * @return un arreglo con las categorías en cada posición.
     */
    public String[] obtenerCategoriasSeleccionar(){
        String[] c = new String[categorias.size()+1];
        c[0] = "Seleccionar";
        int contador = 1;
        for (int i = 0; i < categorias.size(); i++) {
            c[contador] = categorias.get(i).getNombre();
            contador++;
        }
        return c;
    }
    /**
     * Crea un array con el nombre de las categorias registradas en cada posición
     * @return un array con todas las categorias en cada posición.
     */
    public String[] obtenerCategorias(){
        String[] c = new String[categorias.size()];
        for (int i = 0; i < categorias.size(); i++) {
            c[i] = categorias.get(i).getNombre();
        }
        return c;
    }
    /**
     * Crea una matris de una columna con el nombre de cada categoría registrada
     * @return la matris con el nombre de cada categoría
     */
    public String[][] matrisCategorias(){
        String[][] mtrx = new String[categorias.size()][1];
        for (int i = 0; i < categorias.size(); i++) {
            mtrx[i][0] = categorias.get(i).getNombre();
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de productos que un usuario tiene a la venta
     * @param user el user que identifica el usuario
     * @return la cantidad de productos en venta del usuario.
     */
    public int obtenerProductosEnVentaUsuario(String user) {
        int contador = 0;
        for (Producto producto : productos) {
            if (producto.isDisponible()) {
                if (producto.getUsuario().getUser().equals(user)) {
                    contador++;
                }
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de cada producto en venta de un usuario
     * @param u el usuario para construir la matris
     * @return una matris con los datos de cada producto en venta del usuario
     */
    public String[][] construirMatrisProductosEnVentaUsuario(Usuario u){
        String mtrx[][] = new String[obtenerProductosEnVentaUsuario(u.getUser())][5];
        int p = 0;
        for (Producto producto : productos) {
            if(producto.isDisponible()){
                if(producto.getUsuario().getUser().equals(u.getUser())){
                    mtrx[p][0] = producto.getId();
                    mtrx[p][1] = producto.getNombre();
                    mtrx[p][2] = producto.getDesc();
                    mtrx[p][3] = "$"+Double.toString(producto.getPrecio());
                    mtrx[p][4] = Integer.toString(producto.getStock());
                    p++;
                }
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de productos NO disponibles de un usuario
     * @param user el user identificador del usuario
     * @return la cantidad de productos NO disponibles del usuario.
     */
    public int obtenerProductosNoDisponiblesUsuario(String user){
        int contador = 0;
        for (Producto producto : productos) {
            if(!producto.isDisponible()){
                if(producto.getUsuario().getUser().equals(user)){
                    contador++;
                }
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de los productos no disponibles de un usuario
     * @param u el usuario con el cual se construirá la matris
     * @return la matris con los datos de los productos no disponibles del usuario.
     */
    public String[][] construirMatrisProductosNoDisponiblesUsuario(Usuario u){
        String mtrx[][] = new String[obtenerProductosNoDisponiblesUsuario(u.getUser())][5];
        int p = 0;
        for (Producto producto : productos) {
            if(!producto.isDisponible()){
                if(producto.getUsuario().getUser().equals(u.getUser())){
                    mtrx[p][0] = producto.getId();
                    mtrx[p][1] = producto.getNombre();
                    mtrx[p][2] = producto.getDesc();
                    mtrx[p][3] = "$"+Double.toString(producto.getPrecio());
                    mtrx[p][4] = Integer.toString(producto.getStock());
                    p++;
                }
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de productos disponibles y no disponibles que hay 
     * activos en la plataforma
     * @return la cantidad total de productos disponibles y no disponibles
     */
    public int obtenerTotalProductos(){
        return productos.size();
    }
    /**
     * Permite obtener la cantidad de productos disponibles que hay en venta en la plataforma
     * @return la cantidad total de productos disponibles
     */
    public int obtenerProductosEnVenta(){
        int contador = 0;
        for (Producto producto : productos) {
            if(producto.isDisponible()){
                contador++;
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de los productos disponibles y NO disppnibles 
     * registrados en la plataforma
     * @return la matris con todos los productos registrados
     */
    public String[][] construirMatrisProductosEnVenta(){
        String mtrx[][] = new String[obtenerTotalProductos()][6];
        for (int i = 0; i < obtenerTotalProductos(); i++) {
            mtrx[i][0] = productos.get(i).getId();
            mtrx[i][1] = productos.get(i).getNombre();
            mtrx[i][2] = productos.get(i).getDesc();
            mtrx[i][3] = Double.toString(productos.get(i).getPrecio());
            mtrx[i][4] = Integer.toString(productos.get(i).getStock());
            if(productos.get(i).isDisponible()){
                mtrx[i][5] = "SI";
            }else{
                mtrx[i][5] = "NO";
            }
        }
        return mtrx;
    }
    /**
     * Construye una matris de una fila con los datos de un producto en específico
     * @param id el id identificador del producto
     * @return la matrid con los datos del producto.
     */
    public String[][] contruirMatrisFiltroProducto(String id){
        String mtrx[][] = new String[1][6];
        Producto aux = buscar(id);
        if(aux!=null){
            mtrx[0][0] = aux.getId();
            mtrx[0][1] = aux.getNombre();
            mtrx[0][2] = aux.getDesc();
            mtrx[0][3] = Double.toString(aux.getPrecio());
            mtrx[0][4] = Integer.toString(aux.getStock());
            if(aux.isDisponible()){
                mtrx[0][5] = "SI";
            }else{
                mtrx[0][5] = "NO";
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de productos que el usuario puede comprar en la plataforma
     * @param u El usuario con el cual se obtendrá la cantidad de productos
     * @return la cantidad de productos que el usuario puede comprar
     */
    public int obtenerProductosDisponiblesUsuario(Usuario u){
        int contador = 0;
        for (Producto producto : productos) {
            if(producto.isDisponible()){
                if(!producto.getUsuario().getUser().equals(u.getUser())){
                    contador++;
                }
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de cada producto que un usuario puede comprar, 
     * los cuales son los que están disponibles y son diferentes a los productos publicados 
     * por el mimo usuario
     * @param u el usuario para construir la matris
     * @return la matris con todos los productos que el usuario puede comprar.
     */
    public String[][] costruirMatrisProductosDisponiblesUsuario(Usuario u){
        int productosDisp = obtenerProductosDisponiblesUsuario(u);
        String mtrx[][] = new String[productosDisp][3];
        int p = 0;
        for (Producto producto : productos) {
            if(producto.isDisponible()){
                if(!producto.getUsuario().getUser().equals(u.getUser())){
                    mtrx[p][0] = producto.getNombre();
                    mtrx[p][1] = "$"+Double.toString(producto.getPrecio());
                    mtrx[p][2] = producto.getId();
                    p++;
                }
            }
        }
        return mtrx;
    }
    /**
     * Construye una matris con los productos que un usuario puede comprar dependiendo 
     * de su categoría, precio mínimo y precio máximo
     * @param u el usuario con el cual se construirá la matris
     * @param categoria la categoría de los productos que apareceran en la matris
     * @param min el precio mínimo de cada producto
     * @param max el precio máximo de cada producto
     * @return la matris de los productos filtrada por la categoría, precio mínimo y máximo
     */
    public String[][] filtrarProductosUsuarioCategoriaPrecio(Usuario u, String categoria, double min, double max){
        int p = 0;
        for (Producto producto : productos) {
            if (producto.isDisponible()) {
                if (!producto.getUsuario().getUser().equals(u.getUser())) {
                    if (producto.getCategoria().getNombre().equals(categoria)) {
                        if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                            p++;
                        }
                    }
                }
            }
        }
        String mtrx[][] = new String[p][3];
        p = 0;
        for (Producto producto : productos) {
            if (producto.isDisponible()) {
                if (!producto.getUsuario().getUser().equals(u.getUser())) {
                    if (producto.getCategoria().getNombre().equals(categoria)) {
                        if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                            mtrx[p][0] = producto.getNombre();
                            mtrx[p][1] = "$"+Double.toString(producto.getPrecio());
                            mtrx[p][2] = producto.getId();
                            p++;
                        }
                    }
                }
            }
        }
        return mtrx;
    }
    /**
     * Construye una matris con los productos que un usuario puede comprar entre un 
     * intérvalo de precio mínimo y máximo
     * @param u el usuario con el cual se construirá la matris
     * @param min el precio mínimo de los productos
     * @param max el precio máximo de los productos
     * @return una matris con los productos que el usuario puede comprar dependiendo de 
     * el precio mínimo y máximo ingresado.
     */
    public String[][] filtrarProductosUsuarioPrecio(Usuario u, double min, double max){
        int p = 0;
        for (Producto producto : productos) {
            if (producto.isDisponible()) {
                if (!producto.getUsuario().getUser().equals(u.getUser())) {
                    if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                        p++;
                    }
                }
            }
        }
        String mtrx[][] = new String[p][3];
        p = 0;
        for (Producto producto : productos) {
            if (producto.isDisponible()) {
                if (!producto.getUsuario().getUser().equals(u.getUser())) {
                    if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                        mtrx[p][0] = producto.getNombre();
                        mtrx[p][1] = "$" + Double.toString(producto.getPrecio());
                        mtrx[p][2] = producto.getId();
                        p++;
                    }
                }
            }
        }
        return mtrx;
    }
    /**
     * Permite agregar un nuevo carrito a la lista carritos
     * @param carrito el carrito a agregar
     * @return un boleano true si se pudo agregar, de lo contrario un false.
     */
    public boolean agregarCarrito(Carrito carrito){
        Carrito aux = buscarCarrito(carrito.getUsuario().getUser());
        if(aux == null){
            carritos.add(carrito);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar un carrito registrado en la lista carritos
     * @param user el user del dueño del carrito
     * @return el carrito si se encontró, de lo contrario un null.
     */
    public Carrito buscarCarrito(String user){
        for (Carrito carrito : carritos) {
            if(carrito.getUsuario().getUser().equals(user)){
                return carrito;
            }
        }
        return null;
    }

}
