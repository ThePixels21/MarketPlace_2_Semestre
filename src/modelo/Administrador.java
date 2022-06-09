/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pixels
 */
public class Administrador extends Usuario{

    public Administrador(String user, String correo, String psw, String nombre, String apellido, String dni, String telefono, int edad) {
        super(user, correo, psw, nombre, apellido, dni, telefono, edad);
    }
    
}
