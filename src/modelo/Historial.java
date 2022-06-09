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
public class Historial {
    ArrayList<Producto> publicados;
    ArrayList<Venta> ventas;
    
    public Historial(){
        publicados = new ArrayList();
        ventas = new ArrayList<>();
    }
    /**
     * Permite registrar una venta efectuada en la lista ventas
     * @param venta la venta a registrar
     * @return un true si se efectuó el registro, en su defecto un false.
     */
    public boolean registrar(Venta venta){
        Venta aux = buscarVenta(venta.getId());
        if(aux == null){
            ventas.add(venta);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar una venta en la lista ventas
     * @param id dato que identifica la venta
     * @return la venta buscada, si no se encontró un null.
     */
    public Venta buscarVenta(String id){
        for (Venta venta : ventas) {
            if(venta.getId().equals(id)){
                return venta;
            }
        }
        return null;
    }
    /**
     * Permite registrar una publicación en la lista publicaciones
     * @param p el producto a registrar en la publicación
     * @return un true al registrarse.
     */
    public boolean registrarPublicacion(Producto p){
        publicados.add(p);
        return true;
    }
    /**
     * Permite buscar una publicación
     * @param id el datos que identifica el producto algúna vez publicado
     * @return el producto publicado, en su defecto un null.
     */
    public Producto buscarPublicacion(String id){
        for (Producto publicado : publicados) {
            if(publicado.getId().equals(id)){
                return publicado;
            }
        }
        return null;
    }
    /**
     * Determina el numero identificador de cada venta realizada
     * @return si no existe ninguna venta retorna un String 500, si ya existe 
     * mas de una venta retorna el número de la ultima venta más 1
     */
    public String determinarIdVenta(){
        if (ventas.isEmpty()) {
            return "500";
        }else{
            int mayor = 0;
            for (Venta venta : ventas) {
                int id = Integer.parseInt(venta.getId());
                if(id > mayor){
                    mayor = id;
                }
            }
            return Integer.toString(mayor+1);
        }
    }
    /**
     * Determina el número identificador de cada producto publicado
     * @return si no existe ningún producto publicado retorna un String 100, 
     * si ya existe más de uno entonces retorna el número de la última publicación 
     * más uno.
     */
    public String asignarIdProducto(){
        if (publicados.isEmpty()) {
            return "1000";
        }else{
            int mayor = 0;
            for (Producto producto : publicados) {
                int id = Integer.parseInt(producto.getId());
                if(id > mayor){
                    mayor = id;
                }
            }
            return Integer.toString(mayor+1);
        }
    }
    /**
     * Permite obtener la cantidad de ventas que ha hecho un usuario.
     * @param user el user del usuario a consultar
     * @return la cantidad de ventas que ha hecho un usuario.
     */
    public int obtenerVentasUsuario(String user){
        int contador = 0;
        for (Venta venta : ventas) {
            if(venta.getVendedor().getUser().equals(user)){
                contador++;
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de cada venta de un usuario.
     * @param u el usuario a construir la matris
     * @return la matris con los datos de cada venta del usuario.
     */
    public String[][] construirMatrisVentasUsuario(Usuario u){
        String mtrx[][] = new String[obtenerVentasUsuario(u.getUser())][5];
        int i = 0;
        for (Venta venta : ventas) {
            if(venta.getVendedor().getUser().equals(u.getUser())){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getComprador().getUser();
                mtrx[i][2] = venta.getProducto().getNombre();
                mtrx[i][3] = Double.toString(venta.getPrecioTotal());
                mtrx[i][4] = venta.getFechaVenta();
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Construye una matris con los datos de cada venta de un usuario.
     * @param u el usuario a construir la matris
     * @return la matris con los datos de cada venta del usuario.
     */
    public String[][] matrisVentasUsuario(Usuario u){
        String mtrx[][] = new String[obtenerVentasUsuario(u.getUser())][7];
        int i = 0;
        for (Venta venta : ventas) {
            if(venta.getVendedor().getUser().equals(u.getUser())){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getProducto().getNombre();
                mtrx[i][2] = Double.toString(venta.getPrecioTotal());
                mtrx[i][3] = Integer.toString(venta.getProducto().getCantidad());
                mtrx[i][4] = venta.getVendedor().getUser();
                mtrx[i][5] = venta.getComprador().getUser();
                mtrx[i][6] = venta.getFechaVenta();
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de ventas totales efectuadas en la aplicación
     * @return un int con la cantidad de ventas totales.
     */
    public int obtenerVentasTotales(){
        int contador = 0;
        for (Venta venta : ventas) {
            contador++;
        }
        return contador;
    }
    /**
     * Generar una matris con los datos de cada venta hecha en la aplicación
     * @return la matris con los datos de cada venta.
     */
    public String[][] construirMatrisVentasTotales(){
        String mtrx[][] = new String[obtenerVentasTotales()][7];
        for (int i = 0; i < ventas.size(); i++) {
            mtrx[i][0] = ventas.get(i).getId();
            mtrx[i][1] = ventas.get(i).getProducto().getNombre();
            mtrx[i][2] = Double.toString(ventas.get(i).getPrecioTotal());
            mtrx[i][3] = Integer.toString(ventas.get(i).getProducto().getCantidad());
            mtrx[i][4] = ventas.get(i).getVendedor().getUser();
            mtrx[i][5] = ventas.get(i).getComprador().getUser();
            mtrx[i][6] = ventas.get(i).getFechaVenta();
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de compras hechas por un usuario
     * @param user el user que identifica el usuario.
     * @return la cantidad de compras hechas por un usuario en la aplicación
     */
    public int obtenerComprasUsuario(String user){
        int contador = 0;
        for (Venta venta : ventas) {
            if(venta.getComprador().getUser().equals(user)){
                contador++;
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de cada compra hecha por un usuario
     * @param u el usuario para construir la matris
     * @return una matris con los datos de cada compra de un usuario.
     */
    public String[][] construirMatrisComprasUsuario(Usuario u){
        String mtrx[][] = new String[obtenerComprasUsuario(u.getUser())][5];
        int i=0;
        for(Venta venta : ventas){
            if(venta.getComprador().getUser().equals(u.getUser())){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getVendedor().getUser();
                mtrx[i][2] = venta.getProducto().getNombre();
                mtrx[i][3] = Double.toString(venta.getPrecioTotal());
                mtrx[i][4] = venta.getFechaVenta();
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de publicaciónes hechas por un usuario alguna 
     * vez en la plataforma
     * @param user el user del usuario a consultar
     * @return la cantidad de publicaciónes hechas por un usuario.
     */
    public int obtenerPublicacionesTotalesUsuario(String user){
        int contador = 0;
        for (Producto publicado : publicados) {
            if(publicado.getUsuario().getUser().equals(user)){
                contador++;
            }
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de las publicaciónes hechas por un 
     * usuario algúna vez en la plataforma
     * @param user el user del usuario a construir la matris
     * @return la matris con los datos de cada publicación del usuario.
     */
    public String[][] construirMatrisPublicacionesUsuario(String user){
        String mtrx[][] = new String[obtenerPublicacionesTotalesUsuario(user)][4];
        int p = 0;
        for (Producto publicado : publicados) {
            if(publicado.getUsuario().getUser().equals(user)){
                mtrx[p][0] = publicado.getId();
                mtrx[p][1] = publicado.getNombre();
                mtrx[p][2] = publicado.getDesc();
                mtrx[p][3] = Double.toString(publicado.getPrecio());
                p++;
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de publicaciónes alguna vez hechas en la plataforma 
     * @return la cantidad de publicaciónes totales.
     */
    public int obtenerCantidadPublicaciones(){
        int contador = 0;
        for (Producto publicado : publicados) {
            contador++;
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de todas las publicaciónes hechas alguna 
     * vez en el programa
     * @return una matris con los datos de cada publicación
     */
    public String[][] construirMatrisPublicaciones(){
        String mtrx[][] = new String[publicados.size()][6];
        for (int i = 0; i < publicados.size(); i++) {
            mtrx[i][0] = publicados.get(i).getId();
            mtrx[i][1] = publicados.get(i).getNombre();
            mtrx[i][2] = publicados.get(i).getDesc();
            mtrx[i][3] = Double.toString(publicados.get(i).getPrecio());
            mtrx[i][4] = publicados.get(i).getUsuario().getUser();
            mtrx[i][5] = publicados.get(i).getFechaPublicacion();
        }
        return mtrx;
    }
    /**
     * Constuye una matris con los datos de cada venta de un usuario
     * @param user el user del usuario a construir la matris
     * @return la matris con los datos de cada venta de un usuario
     */
    public String[][] filtrarMatrisDineroGeneradoUsuario(String user){
        String mtrx[][] = new String[obtenerVentasUsuario(user)][4];
        int i = 0;
        for (Venta venta : ventas) {
            if(venta.getVendedor().getUser().equals(user)){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getProducto().getNombre();
                mtrx[i][2] = venta.getVendedor().getUser();
                mtrx[i][3] = "$"+Double.toString(venta.getPrecioTotal());
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Construye una matris con las compras hechas por un usuario
     * @param user el user identificador del usuario
     * @return una matris con datos de cada compra de un usuario.
     */
    public String[][] filtrarMatrisDineroGastadoUsuario(String user){
        String mtrx[][] = new String[obtenerComprasUsuario(user)][4];
        int i = 0;
        for (Venta venta : ventas) {
            if(venta.getComprador().getUser().equals(user)){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getProducto().getNombre();
                mtrx[i][2] = venta.getComprador().getUser();
                mtrx[i][3] = "$"+Double.toString(venta.getPrecioTotal());
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de dinero generado por un usuario con todas 
     * sus ventas
     * @param user el user identificador del usuario
     * @return un double con la cantidad de dinero total generado del usuario
     */
    public double dineroTotalGastadoUsuario(String user){
        double cantidad = 0;
        for (Venta venta : ventas) {
            if(venta.getComprador().getUser().equals(user)){
                cantidad += venta.getPrecioTotal();
            }
        }
        return cantidad;
    }
    /**
     * Construye una matris con los datos de las compras de un usuario.
     * @param user el user identificador de cada usuario.
     * @return la matris con los datos de cada compra de un usuario.
     */
    public String[][] construirMatrisDineroGastadoUsuario(String user){
        String mtrx[][] = new String[obtenerComprasUsuario(user)][3];
        int i = 0;
        for (Venta venta : ventas) {
            if(venta.getComprador().getUser().equals(user)){
                mtrx[i][0] = venta.getId();
                mtrx[i][1] = venta.getProducto().getNombre();
                mtrx[i][2] = "$"+Double.toString(venta.getPrecioTotal());
                i++;
            }
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de dinero total generado o gastado por todos 
     * los usuarios en la plataforma
     * @return la cantidad de dinero total generado en la plataforma
     */
    public double dineroTotalGastado(){
        double cantidad = 0;
        for (Venta venta : ventas) {
            cantidad += venta.getPrecioTotal();
        }
        return cantidad;
    }
    /**
     * Constuye una matris con los datos de cada venta hecha en la plataforma 
     * enfocandose en el dinero gastado de los compradores
     * @return la matris con los datos de cada venta.
     */
    public String[][] construirMatrisDineroTotalGastado(){
        String mtrx[][] = new String[ventas.size()][4];
        for (int i = 0; i < ventas.size(); i++) {
            mtrx[i][0] = ventas.get(i).getId();
            mtrx[i][1] = ventas.get(i).getProducto().getNombre();
            mtrx[i][2] = ventas.get(i).getComprador().getUser();
            mtrx[i][3] = "$"+Double.toString(ventas.get(i).getPrecioTotal());
        }
        return mtrx;
    }
    /**
     * Permite obtener la cantidad de dinero total generado por un usuario
     * @param user el user identificador del usuario a consultar
     * @return un double con la cantidad de dinero generado por un usuario.
     */
    public double dineroGeneradoUsuario(String user){
        double dinero = 0;
        for (Venta venta : ventas) {
            if(venta.getVendedor().getUser().equals(user)){
                dinero += venta.getPrecioTotal();
            }
        }
        return dinero;
    }
    /**
     * Construye una matris con los datos de cada venta hecha en la plataforma, 
     * enfocandose en el dinero generado por los vendedores.
     * @return 
     */
    public String[][] construirMatrisDineroTotalGenerado(){
        String mtrx[][] = new String[ventas.size()][4];
        for (int i = 0; i < ventas.size(); i++) {
            mtrx[i][0] = ventas.get(i).getId();
            mtrx[i][1] = ventas.get(i).getProducto().getNombre();
            mtrx[i][2] = ventas.get(i).getVendedor().getUser();
            mtrx[i][3] = "$"+Double.toString(ventas.get(i).getPrecioTotal());
        }
        return mtrx;
    }
    
}
