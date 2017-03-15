package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

Connection conexion;

public void conectar(){

     try{
    Class.forName("com.mysql.jdbc.Driver");
    
    }catch (ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Error al cargar la clase Driver");
    }
    try{
    //conectar
    conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria","root","");
    }
    catch (SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al conectar");
    }
    

}


    
}
