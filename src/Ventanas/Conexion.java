/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Conexion {
    String url="Registro1.db";
    Connection conexion;
    public void conectar(){
       try{
           conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
           if(conexion!=null){
               System.out.println("Conexion exitosa");
           }
       }catch(SQLException ex){
               System.out.println("No se ha podido establecer conexion:"+ex);  
       } 
       }
    public void cerrrarConexion(){
        try{
            conexion.close();
        }catch(SQLException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }           

    void cerrarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}
