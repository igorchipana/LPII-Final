/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.factory;
//import Modelo.Modelo_Persona;
//import DAO.PersonaDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.management.Query;
import pe.edu.upeu.dm.DAO.TraPersoDAO;
import pe.edu.upeu.dm.DAO.UsuarioDAO;
import pe.edu.upeu.dm.Modelo.Modelo_TraPerso;
import pe.edu.upeu.dm.Modelo.Modelo_Usuario;

/**
 *
 * @author Igor
 */
public class test {
    //static List<Modelo_Persona> lista = new ArrayList<>();
    //  static Modelo_Persona a = new Modelo_Persona();

    static UsuarioDAO aO = new UsuarioDAO();
     static TraPersoDAO O = new TraPersoDAO();
    static Connection cx;

    public static void main(String[] args) {
        //conex();
        listar();
    }
//        public static void conex(){
//        cx = Factory_Conexion.getConexion();
//        if(cx!=null){
//        System.out.println("Si hay conexión :v");
//        }
//        else{
//        System.out.println("No hay Conexión =(");
//        }
//    }

    public static void listar() {

        List<Modelo_TraPerso> lista = O.readall();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getCodigo());
            System.out.println(lista.get(i).getNombres());
        }
    }
    static void conex() {
        cx = Factory_Conexion.getConexion();
        if (cx != null) {
            System.out.println("Exito al conectar");
        } else {
            System.out.println("Error al conectar");
        }
    }

}

//                   
//           test query =new test();
//           String consulta="select*from persona";
//           LinkedList<String>resultado=query.query(consulta);
//           for(int i=0; i<resultado.size();i++){
//               System.out.println(resultado.get(i));
//           }
//    }
//
//    private LinkedList<String> query(String consulta) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
