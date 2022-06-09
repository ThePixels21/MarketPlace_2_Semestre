package modelo;


/**
 *
 * @author Pixels
 */
public class Singleton {
    private static Singleton instance;
    private static Registro registro;
    private static Tienda tienda;
    private static Historial historial;
    /**
     * El constructor privado de la clase para que no se puedan crear instancias de esta
     */
    private Singleton() {
        
    }
    /**
     * Permite obtener la única instancia de la clase Singleton
     * @return la instancia de la clase
     */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    /**
     * Permite obtener la única instancia de la clase Registro
     * @return la instancia de la clase
     */
    public Registro getRegistro(){
        if(registro == null){
            registro = new Registro();
        }
        return registro;
    }
    /**
     * Permite obtener la única instancia de la clase Tienda
     * @return la instancia de la clase
     */
    public Tienda getTienda(){
        if(tienda == null){
            tienda = new Tienda();
        }
        return tienda;
    }
    /**
     * Permite obtener la única instancia de la clase Historial
     * @return la unica instancia de la clase
     */
    public Historial getHistorial(){
        if(historial == null){
            historial = new Historial();
        }
        return historial;
    }
    
}
