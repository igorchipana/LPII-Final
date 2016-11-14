/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.factory;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author IGOR
 */
public class Factory_Conexion {
    
    
     private static final String URL = "jdbc:mysql://localhost:3306/algoaqui";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection cx = null;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return cx;
    } 
    
   
//........Conexion Oracle....
//    public static final int MYSQL = 1;
//    public static final int ORACLE = 2;
//
//    public static String[] configMYSQL = {"bd_almacen", "root", "root"};
//
//    public static String[] configORACLE = {"procesosrh", "rrhh", "192.168.21.12", "1521", "xe"};
////
//    public static final String url = "C:\\filesSystemTalentoHumano\\";
////public static final String url = "E:\\Projects\\TH\\th 1\\TALENTO_HUMANO\\web\\Archivo";  ESTE URL CAMBIA DE ACUERDO A LA MAQUINA
//    public static final String url_archivos = "C:\\filesSystemTalentoHumano\\";
//
//    //  public static String[] configORACLE = {"procesosrh", "rrhh", "procesrh-db.upeu", "1521", "upeu"};
////    public static final String url = "/usr/share/tomcat7/webapps/TALENTO_HUMANO/Archivo/";
////    public static final String url_archivos = "http://procesosrh-app.upeu/TALENTO_HUMANO/Archivo/";
//
//    /* WebService Carga Academica*/
//    public static final String keyApp = "4a7c88ee0791cad24a15d43a525982f8";
//    public static final String keyID = "d57d9c1cd0cfdec68805a5055388177b";
//    public static final String serverURI = "https://webapp.upeu.edu.pe/";
//    public static final String service = "https://webapp.upeu.edu.pe/webservices/wsdl4rrhh/";

     
    
    
}
