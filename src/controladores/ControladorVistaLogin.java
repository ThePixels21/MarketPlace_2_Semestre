/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Administrador;
import modelo.Registro;
import modelo.Singleton;
import modelo.Usuario;

/**
 *
 * @author Pixels
 */
public class ControladorVistaLogin {
    Registro registro;
    Singleton singleton;
    
    public ControladorVistaLogin(){
        singleton = Singleton.getInstance();
        registro = singleton.getRegistro();
    }
    public Usuario buscar(String user){
        return registro.buscar(user);
    }
    public Usuario buscarAdmin(String user){
        return registro.buscarAdmin(user);
    }
    
}
