/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Modelo;

/**
 *
 * @author IgorCB
 */


public class Modelo_Descanso {
    
    
    
    private String iddescanso;
    private String fecha_inc;
    private String fecha_fin;
    private String idtrabajador;
    private String estado;
    

    public Modelo_Descanso() {
    }

    public Modelo_Descanso(String iddescanso, String fecha_inc, String fecha_fin, String idtrabajador, String estado) {
        this.iddescanso = iddescanso;
        this.fecha_inc = fecha_inc;
        this.fecha_fin = fecha_fin;
        this.idtrabajador = idtrabajador;
        this.estado = estado;
    }

    public String getIddescanso() {
        return iddescanso;
    }

    public void setIddescanso(String iddescanso) {
        this.iddescanso = iddescanso;
    }

    public String getFecha_inc() {
        return fecha_inc;
    }

    public void setFecha_inc(String fecha_inc) {
        this.fecha_inc = fecha_inc;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(String idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
