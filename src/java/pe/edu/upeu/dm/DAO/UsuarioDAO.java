/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.dm.Modelo.Modelo_Persona;
import pe.edu.upeu.dm.Modelo.Modelo_Usuario;
import pe.edu.upeu.dm.Interfaces.Operaciones;
import pe.edu.upeu.dm.factory.Factory_Conexion;

/**
 *
 * @author Igor
 */
public class UsuarioDAO implements Operaciones<Modelo_Usuario> {

    private PreparedStatement ps;
    private Connection cn;
    private String sql;
    private ResultSet rs;
    private final String SQL_READALL = "SELECT * FROM USUARIO";
    private final String SQL_READ = "SELECT * FROM USUARIO WHERE USUARIO_ID=?";
    private final String DELETE = "DELETE FROM USUARIO WHERE USUARIO_ID=?";
    private final static String SQL_VALIDA = "SELECT * FROM USUARIO WHERE USSER=? AND PASS=?";
    
    
    public int validar1(String user, String clave){
        int op=0;
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(SQL_VALIDA);
            ps.setString(1, user);
            ps.setString(2, clave);
           
            rs = ps.executeQuery();
            while(rs.next()){
                op = rs.getInt("usuario_id");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return op;
    }
    
    

    public List<Modelo_Persona> validar(String usser, String pass) {
        Modelo_Persona m = new Modelo_Persona();
        List<Modelo_Persona> lista = new ArrayList<>();

        sql = "SELECT P.PERSONA_ID,P.NOMBRES,P.APELLIDO_P,P.DNI,P.FECHA_NAC,P.APELLIDO_M,P.NACIONALIDAD,P.TELEFONO,P.CELULAR,P.DEPARTAMENTO,P.PROVINCIA,P.DISTRITO,P.CORREO_PER,P.CORREO_INST,P.SEXO,P.NIVEL_EDUCATIVO"
                + " FROM USUARIO U, PERSONA P"
                + " WHERE U.USSER=? AND  U.PASS=?"
                + " AND U.TRABAJADOR_ID=P.PERSONA_ID";

        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, usser);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                m.setPersona_id(rs.getString("PERSONA_ID"));
                m.setApellido_m(rs.getString("APELLIDO_M"));
                m.setApellidos_p(rs.getString("APELLIDO_P"));
                m.setCelular(rs.getString("CELULAR"));
                m.setCorreo_inst(rs.getString("CORREO_INST"));
                m.setCorreo_per(rs.getString("CORREO_PER"));
                m.setDepartamento(rs.getString("DEPARTAMENTO"));
                m.setDistrito(rs.getString("DISTRITO"));
                m.setDni(rs.getString("DNI"));
                m.setFecha_nac(rs.getString("FECHA_NAC"));
                m.setNacionalidad(rs.getString("NACIONALIDAD"));
                m.setNivel_educativo(rs.getString("NIVEL_EDUCATIVO"));
                m.setNombres(rs.getString("NOMBRES"));
                m.setProvincia(rs.getString("PROVINCIA"));
                m.setSexo(rs.getString("SEXO"));
                m.setTelefono(rs.getString("TELEFONO"));
                lista.add(m);
            }

        } catch (Exception e) {
            System.out.println("Error al Validar Usuario " + e);
            return null;
        }
        return lista;
    }

    @Override
    public boolean create(Modelo_Usuario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     public List<Modelo_Usuario> read(int key) {
        List<Modelo_Usuario> list = new ArrayList<>();
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(SQL_READ);
            ps.setInt(1, (int) key);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Usuario us = new Modelo_Usuario();
                us.setIdrol(rs.getString("ROL_ID"));
                us.setIdtrabajador(rs.getString("TRABAJADOR_ID"));
                us.setIdusuario(rs.getString("USUARIO_ID"));
                us.setUser(rs.getString("USSER"));
                us.setPass(rs.getString("PASS"));
                list.add(us);

            }

        } catch (Exception e) {

        }
        return list;

    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Modelo_Usuario e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Usuario> readall() {
          List<Modelo_Usuario> list = new ArrayList<>();
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                 Modelo_Usuario us = new Modelo_Usuario();
                us.setIdrol(rs.getString("ROL_ID"));
                us.setIdtrabajador(rs.getString("TRABAJADOR_ID"));
                us.setIdusuario(rs.getString("USUARIO_ID"));
                us.setUser(rs.getString("USSER"));
                us.setPass(rs.getString("PASS"));
                list.add(us);
            }
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return list;
    }


}
