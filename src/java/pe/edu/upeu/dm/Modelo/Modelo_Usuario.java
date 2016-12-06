/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Modelo;

/**
 *
 * @author Igor
 */
public class Modelo_Usuario {

     private String idusuario;
    private String idtrabajador;
    private String idrol;
    private String user;
    private String pass;
    
    
    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(String idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getIdrol() {
        return idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Modelo_Usuario(String idusuario, String idtrabajador, String idrol, String user, String pass) {
        this.idusuario = idusuario;
        this.idtrabajador = idtrabajador;
        this.idrol = idrol;
        this.user = user;
        this.pass = pass;
    }

    public Modelo_Usuario() {
    }

 
   
    
}
