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
public class Modelo_Persona {
    
    private String persona_id;
    private String nombres;
    private String apellidos_p;
    private String dni;
    private String fecha_nac;
    private String apellido_m;
    private String nacionalidad;
    private String telefono;
    private String celular;
    private String departamento;
    private String provincia;
    private String distrito;
    private String correo_per;
    private String correo_inst;
    private String sexo;
    private String nivel_educativo;
    
    
    
    
    

    public String getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(String persona_id) {
        this.persona_id = persona_id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos_p() {
        return apellidos_p;
    }

    public void setApellidos_p(String apellidos_p) {
        this.apellidos_p = apellidos_p;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreo_per() {
        return correo_per;
    }

    public void setCorreo_per(String correo_per) {
        this.correo_per = correo_per;
    }

    public String getCorreo_inst() {
        return correo_inst;
    }

    public void setCorreo_inst(String correo_inst) {
        this.correo_inst = correo_inst;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public Modelo_Persona(String persona_id, String nombres, String apellidos_p, String dni, String fecha_nac, String apellido_m, String nacionalidad, String telefono, String celular, String departamento, String provincia, String distrito, String correo_per, String correo_inst, String sexo, String nivel_educativo) {
        this.persona_id = persona_id;
        this.nombres = nombres;
        this.apellidos_p = apellidos_p;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.apellido_m = apellido_m;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.celular = celular;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.correo_per = correo_per;
        this.correo_inst = correo_inst;
        this.sexo = sexo;
        this.nivel_educativo = nivel_educativo;
    }

    public Modelo_Persona() {
    }
    
   
    
    
}
