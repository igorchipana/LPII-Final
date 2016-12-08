/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Modelo;

import java.sql.Date;

/**
 *
 * @author IgorCB
 */


public class Modelo_Descanso {
    
    
    
    private String iddescanso;
    private Date fecha_inc;
    private Date fecha_fin;
    private String idtrabajador;
    private String estado;
    private String Total_Dias;

    public String getIddescanso() {
        return iddescanso;
    }

    public void setIddescanso(String iddescanso) {
        this.iddescanso = iddescanso;
    }

    public Date getFecha_inc() {
        return fecha_inc;
    }

    public void setFecha_inc(Date fecha_inc) {
        this.fecha_inc = fecha_inc;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
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

    public String getTotal_Dias() {
        return Total_Dias;
    }

    public void setTotal_Dias(String Total_Dias) {
        this.Total_Dias = Total_Dias;
    }

    public Modelo_Descanso() {
    }

    public Modelo_Descanso(Date fecha_inc, Date fecha_fin, String idtrabajador, String estado, String Total_Dias) {
        this.fecha_inc = fecha_inc;
        this.fecha_fin = fecha_fin;
        this.idtrabajador = idtrabajador;
        this.estado = estado;
        this.Total_Dias = Total_Dias;
    }

    public Modelo_Descanso(String iddescanso, Date fecha_inc, Date fecha_fin, String idtrabajador, String estado, String Total_Dias) {
        this.iddescanso = iddescanso;
        this.fecha_inc = fecha_inc;
        this.fecha_fin = fecha_fin;
        this.idtrabajador = idtrabajador;
        this.estado = estado;
        this.Total_Dias = Total_Dias;
    }

}