/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.dm.Interfaces.Operaciones;
import pe.edu.upeu.dm.Modelo.Modelo_Persona;
import pe.edu.upeu.dm.Modelo.Modelo_Trabajador;
import pe.edu.upeu.dm.factory.Factory_Conexion;

/**
 *
 * @author IgorCB
 */
public class PersonaDAO implements Operaciones<Modelo_Persona> {

    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs = null;
    private String sql;
    private CallableStatement cs;
    private Statement st;

    @Override
    public boolean create(Modelo_Persona e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Persona> read(int key) {
        {
            List<Modelo_Persona> lista = new ArrayList();
            Modelo_Persona dto = new Modelo_Persona();
            sql = "SELECT * FROM PERSONA WHERE PERSONA_ID =?";
            try {
                cn = Factory_Conexion.getConexion();
                ps = cn.prepareStatement(sql);
                ps.setInt(1, key);
                rs = ps.executeQuery();
                while (rs.next()) {
                    dto.setPersona_id(rs.getString("PERSONA_ID"));
                    dto.setApellido_m(rs.getString("APELLIDO_M"));
                    dto.setApellidos_p(rs.getString("APELLIDO_P"));
                    dto.setCelular(rs.getString("CELULAR"));
                    dto.setCorreo_inst(rs.getString("CORREO_INST"));
                    dto.setCorreo_per(rs.getString("CORREO_PER"));
                    dto.setDepartamento(rs.getString("DEPARTAMENTO"));
                    dto.setDistrito(rs.getString("DISTRITO"));
                    dto.setDni(rs.getString("DNI"));
                    dto.setFecha_nac(rs.getString("FECHA_NAC"));
                    dto.setNacionalidad(rs.getString("NACIONALIDAD"));
                    dto.setNivel_educativo(rs.getString("NIVEL_EDUCATIVO"));
                    dto.setNombres(rs.getString("NOMBRES"));
                    dto.setProvincia(rs.getString("PROVINCIA"));
                    dto.setSexo(rs.getString("SEXO"));
                    dto.setTelefono(rs.getString("TELEFONO"));

                    lista.add(dto);
                }
            } catch (Exception ex) {
                System.out.println("Error al listar datos de una persona " + ex);
            }
            return lista;

        }
    }

    @Override
    public boolean update(Modelo_Persona e) {
        boolean m = false;
        sql = "UPDATE PERSONA SET  NOMBRES=?,APELLIDO_P=?,APELLIDO_M=?,FECHA_NAC=?,DNI=?,NACIONALIDAD=?,TELEFONO=?,CELULAR=?,DEPARTAMENTO=?,"
                + "PROVINCIA=?,DISTRITO=?,CORREO_PER=?,CORREO_INST=?,IDROL=?,SEXO=?,NIVEL_EDUCATIVO=? WHERE PERSONA_ID=?";
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, e.getApellido_m().toUpperCase());
            ps.setString(2, e.getApellidos_p().toUpperCase());
            ps.setString(3, e.getNombres().toUpperCase());
            ps.setString(4, e.getCelular());
            ps.setString(5, e.getCorreo_inst());
            ps.setString(6, e.getCorreo_per());
            ps.setString(7, e.getDepartamento());
            ps.setString(8, e.getDistrito());
            ps.setString(9, e.getDni());
            ps.setString(10, e.getFecha_nac());
            ps.setString(11, e.getNacionalidad());
            ps.setString(12, e.getNivel_educativo());
            ps.setString(13, e.getPersona_id());
            ps.setString(14, e.getSexo());
            ps.setString(15, e.getTelefono());
            int a = ps.executeUpdate();
            if (a > 0) {
                m = true;
            }
        } catch (Exception p) {
            System.out.println("Error al Editar Persona " + p);
        }
        return m;
    }

    @Override
    public boolean delete(int key) {
        boolean m = false;
        sql = "{CALL DELETE_USER(?)}";
        try {
            cn = Factory_Conexion.getConexion();
            cs = cn.prepareCall(sql);
            cs.setInt(1, key);
            cs.executeUpdate();
            m = true;
        } catch (Exception e) {
            System.out.println("Error al eliminar persona " + e);
        }
        return m;
    }

    @Override
    public List<Modelo_Persona> readall() {
        List<Modelo_Persona> lista = new ArrayList();
        sql = "SELECT * FROM PERSONA";
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Persona dto = new Modelo_Persona();
                dto.setPersona_id(rs.getString("PERSONA_ID"));
                dto.setApellido_m(rs.getString("APELLIDO_M"));
                dto.setApellidos_p(rs.getString("APELLIDO_P"));
                dto.setCelular(rs.getString("CELULAR"));
                dto.setCorreo_inst(rs.getString("CORREO_INST"));
                dto.setCorreo_per(rs.getString("CORREO_PER"));
                dto.setDepartamento(rs.getString("DEPARTAMENTO"));
                dto.setDistrito(rs.getString("DISTRITO"));
                dto.setDni(rs.getString("DNI"));
                dto.setFecha_nac(rs.getString("FECHA_NAC"));
                dto.setNacionalidad(rs.getString("NACIONALIDAD"));
                dto.setNivel_educativo(rs.getString("NIVEL_EDUCATIVO"));
                dto.setNombres(rs.getString("NOMBRES"));
                dto.setProvincia(rs.getString("PROVINCIA"));
                dto.setSexo(rs.getString("SEXO"));
                dto.setTelefono(rs.getString("TELEFONO"));
                lista.add(dto);
            }
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return lista;
    }

    public ArrayList listarTraPerso() {
        ArrayList lista3 = new ArrayList();
        List<Modelo_Persona> lista = new ArrayList();
        List<Modelo_Trabajador> lista2 = new ArrayList();
        sql = "SELECT * FROM TRABAJADOR A,PERSONA B WHERE A.PERSONA_ID=B.PERSONA_ID";
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Trabajador dto2 = new Modelo_Trabajador();
                Modelo_Persona dto = new Modelo_Persona();
                dto.setApellido_m(rs.getString("APELLIDO_M"));
                dto.setApellidos_p(rs.getString("APELLIDO_P"));
                dto.setCelular(rs.getString("CELULAR"));
                dto.setCorreo_inst(rs.getString("CORREO_INST"));
                dto.setCorreo_per(rs.getString("CORREO_PER"));
                dto.setDepartamento(rs.getString("DEPARTAMENTO"));
                dto.setDistrito(rs.getString("DISTRITO"));
                dto.setDni(rs.getString("DNI"));
                dto.setFecha_nac(rs.getString("FECHA_NAC"));
                dto.setNivel_educativo(rs.getString("NIVEL_EDUCATIVO"));
                dto.setNombres(rs.getString("NOMBRES"));
                dto.setProvincia(rs.getString("PROVINCIA"));
                dto.setSexo(rs.getString("SEXO"));
                dto.setTelefono(rs.getString("TELEFONO"));
                dto2.setCodigo(rs.getString("CODIGO"));
                dto2.setIdpersona(rs.getString("PERSONA_ID"));
                dto2.setIdtrabajador(rs.getString("TRABAJADOR_ID"));
                lista.add(dto);
                lista2.add(dto2);
            }
            lista3.add(lista);
            lista3.add(lista2);
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return lista3;
    }
}
