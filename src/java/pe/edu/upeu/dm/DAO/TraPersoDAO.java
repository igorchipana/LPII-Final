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
import pe.edu.upeu.dm.Modelo.Modelo_TraPerso;
import pe.edu.upeu.dm.factory.Factory_Conexion;

/**
 *
 * @author IgorCB
 */
public class TraPersoDAO implements Operaciones<Modelo_TraPerso>{
    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs = null;
    private String sql;
    private CallableStatement cs;
    private Statement st;

    @Override
    public boolean create(Modelo_TraPerso e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_TraPerso> read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Modelo_TraPerso e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_TraPerso> readall() {
          List<Modelo_TraPerso> lista = new ArrayList();
        sql = "SELECT * FROM TRABAJADOR A,PERSONA B WHERE A.PERSONA_ID=B.PERSONA_ID";
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_TraPerso dto = new Modelo_TraPerso();
                dto.setCodigo(rs.getString("CODIGO"));
                dto.setIdtrabajador(rs.getString("TRABAJADOR_ID"));
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
            
        }
        return lista;
    }
    
}
