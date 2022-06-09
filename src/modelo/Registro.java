package modelo;

import java.util.ArrayList;

/**
 *
 * @author Pixels
 */
public class Registro {
    private ArrayList<Usuario> usuarios;
    public Registro(){
        usuarios = new ArrayList<>();
        usuarios.add(new Administrador("admin", "admin@gmail.com", "admin", "admin", "admin", "000", "000", 17));
    }
    /**
     * Permite registrar un usuario en el sistema
     * @param usuario el usuario a registrar
     * @return boleano true si se registró, en su defecto false
     */
    public boolean registrar(Usuario usuario){
        boolean respuesta = validarUsuario(usuario);
        if(respuesta){
            usuarios.add(usuario);
            return true;
        }
        return false;
    }
    /**
     * Permite buscar un usuario en el sistema
     * @param user el user identificador del usuario
     * @return El usuario si se encontró, en su defecto un objeto nulo
     */
    public Usuario buscar(String user){
        for(Usuario usuario : usuarios){
            if (usuario.getUser().equals(user)) {
                return usuario;
            }
        }
        return null;
    }
    /**
     * Permite eliminar un usuario del sistema
     * @param user el user identificador del usuario.
     * @return un boleano true si se pudo registrar, en su defecto false
     */
    public boolean eliminar(String user){
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(user)) {
                usuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }
    /**
     * Permite buscar un usuario en el sistema mediante el correo
     * @param correo el correo del usuario a buscar
     * @return el usuario si se encontró, en su defecto un null
     */
    public Usuario buscarCorreo(String correo){
        for (Usuario usuario : usuarios) {
            if(usuario.getCorreo().equals(correo)){
                return usuario;
            }
        }
        return null;
    }
    /**
     * Permite buscar un usario en el sistema mediante el id
     * @param id el id o dni identificador del usuario
     * @return el usuario si se encontró, en su defecto un null
     */
    public Usuario buscarId(String id){
        for(Usuario usuario : usuarios){
            if(usuario.getDni().equals(id)){
                return usuario;
            }
        }
        return null;
    }
    /**
     * Permite buscar un usuario en el sistema por medio de su telefono
     * @param telefono el telefono identificador del usuario
     * @return el usuario si se encontró, en su defecto un null
     */
    public Usuario buscarTelefono(String telefono){
        for (Usuario usuario : usuarios) {
            if(usuario.getTelefono().equals(telefono)){
                return usuario;
            }
        }
        return null;
    }
    /**
     * Valida que los atributos unicos de un usuaio no sean iguales al de otro ya registrado
     * @param usuario el usuario a validar
     * @return un boleano true si el usuario es unico, en su defecto false
     */
    public boolean validarUsuario(Usuario usuario) {
        if (usuario != null) {
            for (Usuario u : usuarios) {
                if (usuario.getUser().equals(u.getUser()) || usuario.getDni().equals(u.getDni())
                        || usuario.getTelefono().equals(u.getTelefono()) || usuario.getCorreo().equals(u.getCorreo())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    /**
     * Valida que un usuario sea un administrador
     * @param user el user identificador del usuario
     * @return un boleano true si es un administrador, en su defecto un false.
     */
    public boolean validarAdmin(String user){
        Usuario aux = buscarAdmin(user);
        if(aux!=null){
            return true;
        }
        return false;
    }
    /**
     * Permite buscar un administrador en el sistema
     * @param user el user identificador del administrador
     * @return el administrador si existe, en su defecto un null
     */
    public Usuario buscarAdmin(String user){
        Usuario aux = buscar(user);
        if(aux instanceof Administrador){
            return aux;
        }
        return null;
    }
    /**
     * Permite conoceer la cantidad de usuarios registrador en la plataforma
     * @return la cantidad de usuarios registrados
     */
    public int contarUsuarios(){
        int contador = 0;
        for (Usuario u : usuarios) {
            if(!(u instanceof Administrador)){
                contador++;
            }    
        }
        return contador;
    }
    /**
     * Construye una matris con los datos de cada usuario registrado en la plataforma
     * @return la matris con los datos de cada usuario registrado
     */
    public String[][] construirMatris(){
       String mtrx[][] = new String[contarUsuarios()][7];
       int i = 0;
        for (Usuario u : usuarios) {
            if(!(u instanceof Administrador)){
            mtrx[i][0] = u.getUser();
            mtrx[i][1] = u.getCorreo();
            mtrx[i][2] = u.getNombre();
            mtrx[i][3] = u.getApellido();
            mtrx[i][4] = u.getDni();
            mtrx[i][5] = Integer.toString(u.getEdad());
            mtrx[i][6] = u.getTelefono();
            i++;
            }    
        }
        return mtrx;
    }
    /**
     * Constuye una matris de una sola fila con los datos de un usuaro específico
     * @param u el usuario con el cual se construirá la matris
     * @return la matris con los datos del usuario
     */
    public String[][] contruirMatrisPorUsiario(Usuario u){
        String mtrx[][] = new String[1][7];
            mtrx[0][0] = u.getUser();
            mtrx[0][1] = u.getCorreo();
            mtrx[0][2] = u.getNombre();
            mtrx[0][3] = u.getApellido();
            mtrx[0][4] = u.getDni();
            mtrx[0][5] = Integer.toString(u.getEdad());
            mtrx[0][6] = u.getTelefono();
        return mtrx;
    }
    /**
     * Permite obtener un arreglo con la cantidad de dias de un mes en específico
     * @param mes el numero del mes con el cual se construirá el arreglo
     * @return un arreglo con los dias del mes en cada posición
     */
    public String[] obtenerDiasMes(String mes){
        String dias[] = null;
        int contador = 1;
        if(mes.equals("2")){
            dias = new String[28];
            for(int i = 0; i<28; i++){
                dias[i] = contador+"";
                contador++;
            }
        }else if(mes.equals("1") || mes.equals("3") || mes.equals("5") || mes.equals("7")
                || mes.equals("8") || mes.equals("10") || mes.equals("12")){
            dias = new String[31];
            for (int i = 0; i < 31; i++) {
                dias[i] = contador+"";
                contador++;
            }
        }else{
            dias = new String[30];
            for (int i = 0; i < 30; i++) {
                dias[i] = contador+"";
                contador++;
            }
        }
        return dias;
    }
    
}
