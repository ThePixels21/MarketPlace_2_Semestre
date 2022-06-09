/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Registro;
import modelo.Singleton;
import modelo.Usuario;

/**
 *
 * @author Pixels
 */
public class ControladorVistaUsuario {
    Registro registro;
    Singleton singleton;
    
    public ControladorVistaUsuario(){
        singleton = Singleton.getInstance();
        registro = singleton.getRegistro();
    }
    public Usuario buscar(String user){
        return registro.buscar(user);
    }
    public Usuario buscarCorreo(String correo){
        return registro.buscarCorreo(correo);
    }
    public Usuario buscarId(String id){
        return registro.buscarId(id);
    }
    public Usuario buscarTelefono(String telefono){
        return registro.buscarTelefono(telefono);
    }
    public Usuario buscarAdmin(String user){
        return registro.buscarAdmin(user);
    }
    public boolean validarAdmin(String user){
        return registro.validarAdmin(user);
    }
    
}
