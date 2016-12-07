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
import pe.edu.upeu.dm.Interfaces.Operaciones;
import pe.edu.upeu.dm.Modelo.Modelo_Rol;
import pe.edu.upeu.dm.factory.Factory_Conexion;

/**
 *
 * @author Igor
 * 
 */
public class RolDAO implements Operaciones<Modelo_Rol>{
    
       private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    


    @Override
    public boolean create(Modelo_Rol e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Rol> read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Modelo_Rol e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Rol> readall() {
       List<Modelo_Rol> lista = new ArrayList();
        sql = "SELECT * FROM ROL";
        try {
            cn = Factory_Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Rol dto = new Modelo_Rol();
                dto.setRol_id(rs.getString("ROL_ID"));
                dto.setNom_rol(rs.getString("NOM_ROL"));
                dto.setUsuario_id(rs.getString("USUARIO_ID"));
                lista.add(dto);
            }
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return lista;
    
}
}