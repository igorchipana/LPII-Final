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
public class Modelo_Rol {
    
    
     private String rol_id;
    private String nom_rol;
    private String usuario_id;
    

    public Modelo_Rol() {
    }

    public Modelo_Rol(String rol_id, String nom_rol, String usuario_id) {
        this.rol_id = rol_id;
        this.nom_rol = nom_rol;
        this.usuario_id = usuario_id;
    }

    public String getRol_id() {
        return rol_id;
    }

    public void setRol_id(String rol_id) {
        this.rol_id = rol_id;
    }

    public String getNom_rol() {
        return nom_rol;
    }

    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }
    
   
}
