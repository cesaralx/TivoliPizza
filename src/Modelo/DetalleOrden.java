package Modelo;

import Modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetalleOrden {

    private int idDetalle=0;
    private int idOrden=0;
    private int cantidad=0;
    private double precio=0;
    private double total=0;
    private String nombrePizza="";
    private String tamanoPizza="";
    private String codigoTransaccion="";
    Conexion objDet = new Conexion();
    
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public String getTamanoPizza() {
        return tamanoPizza;
    }

    public void setTamanoPizza(String tamanoPizza) {
        this.tamanoPizza = tamanoPizza;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }
    
  public void altaDetalle(){

    PreparedStatement conectar;
    objDet.conectar();
        try {
            conectar = objDet.conexion.prepareStatement("insert into detalleorden values(?,?,?,?,?,?,?,?,?)");
            conectar.setInt(1, idDetalle);
            conectar.setInt(2, idOrden);
            conectar.setInt(3, cantidad);
            conectar.setDouble(4, precio);
            conectar.setDouble(5, total);
            conectar.setString(6, nombrePizza);
            conectar.setString(7, tamanoPizza);
            conectar.setString(8, codigoTransaccion);
            
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaDetalle(){
PreparedStatement comando;
        objDet.conectar();
            
        try {    
            comando=objDet.conexion.prepareStatement("Delete from detalleorden where idDetalle=?");
            comando.setInt(1, idDetalle);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaDetalle(){

            PreparedStatement comando;
            ResultSet resultado;
            objDet.conectar();
        try {    
            comando= objDet.conexion.prepareCall("Select * from deatalleorden WHERE idDetalle=?");
            comando.setInt(1,idDetalle);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            idOrden=resultado.getInt("idOrden");
            cantidad=resultado.getInt("cantidad");
            precio=resultado.getDouble("precio");
            total=resultado.getDouble("total");
            nombrePizza=resultado.getString("nombrePizza");
            tamanoPizza=resultado.getString("tamanoPizza");
            codigoTransaccion=resultado.getString("codigoTransaccion");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            idOrden=0;
            cantidad=0;
            precio=0;
            total=0;
            nombrePizza="";
            tamanoPizza="";
            codigoTransaccion="";
            
            
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarDetalle(){
   PreparedStatement conectar;
    objDet.conectar();
        try {
            conectar = objDet.conexion.prepareStatement("UPDATE detalleorden SET idOrden=?,cantidad=?,precio=?,total=?,nombrePizza=?,tamanoPizza=?,codigoTransaccion=? WHERE idDetalle=?");
          
            
            conectar.setInt(1, idOrden);
            conectar.setInt(2, cantidad);
            conectar.setDouble(3, precio);
            conectar.setDouble(4, total);
            conectar.setString(5, nombrePizza);
            conectar.setString(6, tamanoPizza);
            conectar.setString(7, codigoTransaccion);
            conectar.setInt(8, idDetalle);
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }   
    
}
