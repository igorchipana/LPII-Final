/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Igor
 */
public class Factory_Conexion {

    private final static String URL = "jdbc:oracle:thin:@localhost:1521:system";// system varia de acuerdo a tu instalacion quiza sea xe o orcl o system
    private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final static String USER = "system";//usuario de tu base de datos o nombre de ella
    private final static String CLAVE = "Shinoyojona1";//password
    private static Connection cx;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, CLAVE);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return cx;
    }

    public ResultSet query(String sql) {
        Statement st;
        ResultSet rs = null;
        try {
            Connection conexion = this.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean cerrar() {
        boolean ok = false;
        try {
            cx.close();
            ok = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ok;
    }
    
    
    public static String convertFecha(String fecha) throws ParseException {
        String nueva_fecha = null;
        if (fecha != null) {
            if (!fecha.equals("")) {
                String f[] = fecha.split("-");
                /*   if (System.getProperty("sun.desktop").trim().equals("windows")) {
                 return f[2] + "/" + f[1] + "/" + f[0];
                 } else {*/
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                nueva_fecha = new SimpleDateFormat("dd-MMM-yy").format(date).toUpperCase();
                // }
            } else {
                nueva_fecha = null;
            }
        } else if (fecha == null) {
            nueva_fecha = null;
        }
        return nueva_fecha;

    }
    
    

//    public Statement conexion(){
//       try{
//        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//        System.out.println("Connectando a la base de datos....");
//        Connection connection=DriverManager.getConnection(
//        "jbdc:oracle:thin:@localhost:1521:orcl","C##IGOR","Shinoyojona1");
//    Statement statement = connection.createStatement();
//    return  statement;
//   }catch (Exception e){
//           System.out.println("La cosa realizada es:"+e);
//           return null;
//}
//}   
//    public LinkedList<String> query(String from){
//        try{
//            Statement st=conexion();
//            ResultSet resulset=st.executeQuery(from);
//            LinkedList<String> result= new LinkedList();
//            while(resulset.next()){
//            for(int i=1;i<resulset.getMetaData().getColumnCount();i++){
//            result.add(resulset.getString(i));
//            }
//            }
//            return result;
//        }catch(Exception e){
//            return null;
//        }
//    
//    }
}
