package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Conexion;

public class Ingredientes {

private int idIngre=0;
private String nombre="";
private int utilizados=0;
private int disponibles=0;
private String productoId="";
Conexion objIng = new Conexion();
        
    public Ingredientes() {
    }

    public int getIdIngre() {
        return idIngre;
    }

    public void setIdIngre(int idIngre) {
        this.idIngre = idIngre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUtilizados() {
        return utilizados;
    }

    public void setUtilizados(int utilizados) {
        this.utilizados = utilizados;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }


public void altaIngrediente(){

    PreparedStatement conectar;
    objIng.conectar();
        try {
            conectar = objIng.conexion.prepareStatement("insert into ingredientes values(?,?,?,?,?)");
            conectar.setInt(1, idIngre);
            conectar.setString(2, nombre);
            conectar.setInt(3, utilizados);
            conectar.setInt(4, disponibles);
            conectar.setString(5, productoId);
            
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaIngrediente(){
PreparedStatement comando;
        objIng.conectar();
            
        try {    
            comando=objIng.conexion.prepareStatement("Delete from ingredientes where idIngre=?");
            comando.setInt(1, idIngre);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaIngrediente(){

            PreparedStatement comando;
            ResultSet resultado;
            objIng.conectar();
        try {    
            comando= objIng.conexion.prepareCall("Select * from ingredientes WHERE idIngre=?");
            comando.setInt(1,idIngre);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            nombre=resultado.getString("nombre");
            utilizados=resultado.getInt("utlizados");
            disponibles=resultado.getInt("Disponibles");
            productoId=resultado.getString("productoId");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            nombre="";
            utilizados=0;
            disponibles=0;
            productoId="";
            
            
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarIngrediente(){
   PreparedStatement conectar;
    objIng.conectar();
        try {
            conectar = objIng.conexion.prepareStatement("UPDATE ingredientes SET nombre=?, utilizados=?,disponibles=?,productoID=? WHERE idIngre=?");
          
            conectar.setString(1, nombre);
            conectar.setInt(2, utilizados);
            conectar.setInt(3, disponibles);
            conectar.setString(4, productoId);
            conectar.setInt(5, idIngre);
            
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }


    
}
