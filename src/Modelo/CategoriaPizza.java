package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Conexion;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoriaPizza {

private int  idCategoria=0;
private String Categoria="";
Conexion objCa= new Conexion();

    public CategoriaPizza() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

public void altaCategoria(){

    PreparedStatement conectar;
    objCa.conectar();
        try {
            conectar = objCa.conexion.prepareStatement("insert into categoriapizza values(?,?)");
            conectar.setInt(1, idCategoria);
            conectar.setString(2, Categoria);
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}

public void bajaCategoria(){
PreparedStatement comando;
        objCa.conectar();
            
        try {    
            comando=objCa.conexion.prepareStatement("Delete from categoriapizza where idCategoria=?");
            comando.setInt(1, idCategoria);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaCategoria(){

            PreparedStatement comando;
            ResultSet resultado;
            objCa.conectar();
        try {    
            comando= objCa.conexion.prepareCall("Select * from categoriapiizza WHERE idCategoria=?");
            comando.setInt(1,idCategoria);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            Categoria=resultado.getString("categoria");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            Categoria="";
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }

public void modificarCategoria(){
   PreparedStatement conectar;
    objCa.conectar();
        try {
            conectar = objCa.conexion.prepareStatement("UPDATE categoriapizza SET categoria=? WHERE idCategoria=?");
          
            conectar.setString(1, Categoria);
            conectar.setInt(2, idCategoria);
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }

}
