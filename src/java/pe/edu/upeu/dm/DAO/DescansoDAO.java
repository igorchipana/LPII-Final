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
import pe.edu.upeu.dm.Interfaces.OperacionesDescanso;
import pe.edu.upeu.dm.Modelo.Modelo_Descanso;

/**
 *
 * @author Rodrigo Gutierrez
 */
public class DescansoDAO implements OperacionesDescanso<Modelo_Descanso>
{

    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs = null;
    private String sql;
    private CallableStatement cs;
    private Statement st;
    
    @Override
    public int create(Modelo_Descanso e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Descanso> read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Modelo_Descanso e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo_Descanso> readall() 
    {List<Modelo_Descanso> lista = new ArrayList<>();
        sql="select * from Descanso";
        try {
            cn = Connection.get;
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Modelo_Descanso x = new Modelo_Descanso();
                x.setIddescanso(rs.getString("descanso_id"));
                x.setIdtrabajador(rs.getString("trabajador_id"));
                x.setEstado(rs.getString("estadp"));
                x.setFecha_inc(rs.getDate("fecha_ini"));
                x.setFecha_fin(rs.getDate("fecha_fin"));
                x.setFecha_fin(rs.getDate("Total_dias_descanso"));
                lista.add(x);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
}