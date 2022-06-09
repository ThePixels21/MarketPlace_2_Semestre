/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pixels
 */
public class Usuario extends Persona {
    private String user;
    private String correo;
    private String psw;

    public Usuario(String user, String correo, String psw, String nombre, String apellido, String dni, String telefono, int edad) {
        super(nombre, apellido, dni, telefono, edad);
        this.user = user;
        this.correo = correo;
        this.psw = psw;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    /**
     * Permite determinar la edad de un usuario mediante el dia, el mes y el año
     * @param dia el dia de nacimiento del usuario
     * @param mes el mes de nacimiento del usuario
     * @param anio el año de nacimiento del usuario
     * @return la edad exacta de la persona
     */
    public static int determinarEdad(int dia, int mes, int anio){
        Date fecha = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd");
        SimpleDateFormat m = new SimpleDateFormat("MM");
        SimpleDateFormat y = new SimpleDateFormat("YYYY");
        int dA = Integer.parseInt(d.format(fecha));
        int mA = Integer.parseInt(m.format(fecha));
        int aA = Integer.parseInt(y.format(fecha));
        
        int ed = aA - anio;
        
        if (mA < mes || (mA == mes && dA < dia)) {
            ed -=1;
        }
        return ed;
    }

}
