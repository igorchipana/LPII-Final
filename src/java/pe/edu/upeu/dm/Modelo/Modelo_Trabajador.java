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
public class Modelo_Trabajador {
    
    
      private String idtrabajador;
    private String codigo;
    private String idpersona;

    public Modelo_Trabajador(String idtrabajador, String codigo, String idpersona) {
        this.idtrabajador = idtrabajador;
        this.codigo = codigo;
        this.idpersona = idpersona;
    }

    public String getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(String idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public Modelo_Trabajador() {
    }
    
  
    
    
}
