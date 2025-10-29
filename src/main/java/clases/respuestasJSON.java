/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alumne
 */
public class respuestasJSON {
   /* 
    public static String login(String username, boolean exitoso){
        if(exitoso){
            return "{\"status\":\"success\", \"message\":Login correcto\" , \"username\" :\"" + username + "\" }";
        }else{
            return "{\"status\":\"error\", \"message\":Usuario o password incorrectos\" , \"username\" :\"" + username + "\" }";
        }
    }
    */
    public static String errorServidor(){
        return "{\"status\":\"error\":, \"message\"Ha habido un error en el servidor\" }";
    }
}
