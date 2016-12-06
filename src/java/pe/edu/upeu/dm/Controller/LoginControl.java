/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.Controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upeu.dm.DAO.UsuarioDAO;
import pe.edu.upeu.dm.Interfaces.Operaciones;
import pe.edu.upeu.dm.Modelo.Modelo_Persona;

/**
 *
 * @author Igor
 */
@Controller
public class LoginControl {
    
    private  UsuarioDAO aO = new UsuarioDAO();
    @RequestMapping("/index")
    public String index(){
    return "index";
    }
//    Operaciones Opera = new UsuarioDAO();
////    Modelo_Persona user = new Modelo_Persona();
//    Map<String, Object> rpta = new HashMap<>();
//    String url;

   
@RequestMapping("/login")
    public String principal(HttpServletRequest request, HttpServletResponse response){
        String url = "index";
        String  user = request.getParameter("user");
        String  clave = request.getParameter("clave");
        try {
            if(aO.validar1(user, clave)==1){
                request.setAttribute("user", user);
            url = "principal";
            }
        } catch (Exception e) {
        }
        
    return url;
    }
     
    
    
    
    
    
}