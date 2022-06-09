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
public class ControladorVistaRegistrar {
    Registro registro;
    Singleton singleton;
    public ControladorVistaRegistrar(){
        singleton = Singleton.getInstance();
        registro = singleton.getRegistro();
    }
    public boolean registrar(Usuario usuario){
        return registro.registrar(usuario);
    }
    public Usuario buscar(String user){
        return registro.buscar(user);
    }
    public boolean validarUsuario(Usuario usuario){
        return registro.validarUsuario(usuario);
    }
    public String[] obtenerDiasMes(String mes){
        return registro.obtenerDiasMes(mes);
    }
    
}
