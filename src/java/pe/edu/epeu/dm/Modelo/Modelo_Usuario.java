/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.epeu.dm.Modelo;

/**
 *
 * @author Igor
 */
public class Modelo_Usuario {

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
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

    public Modelo_Usuario(int idusuario, int idtrabajador, int idrol, String user, String pass) {
        this.idusuario = idusuario;
        this.idtrabajador = idtrabajador;
        this.idrol = idrol;
        this.user = user;
        this.pass = pass;
    }

    public Modelo_Usuario() {
    }
    
    private int idusuario;
    private int idtrabajador;
    private int idrol;
    private String user;
    private String pass;
    
}
