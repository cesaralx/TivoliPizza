package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Conexion;
public class Ordenes {

Conexion objOrd = new Conexion();
private int idOrdenes=0;
private int idCliente=0;
private double costo=0;
private String status="";
private String fecha="";
private String codigoTransaccion="";
private String metodoPago="";

    public Ordenes() {
    }

    public int getIdOrdenes() {
        return idOrdenes;
    }

    public void setIdOrdenes(int idOrdenes) {
        this.idOrdenes = idOrdenes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
 public void altaOrden(){

    PreparedStatement conectar;
    objOrd.conectar();
        try {
            conectar = objOrd.conexion.prepareStatement("insert into ordenes values(?,?,?,?,?,?,?)");
            conectar.setInt(1, idOrdenes);
            conectar.setInt(2, idCliente);
            conectar.setDouble(3, costo);
            conectar.setString(4, status);
            conectar.setString(5, fecha);
            conectar.setString(6, codigoTransaccion);
            conectar.setString(7, metodoPago);
            
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaOrden(){
PreparedStatement comando;
        objOrd.conectar();
            
        try {    
            comando=objOrd.conexion.prepareStatement("Delete from ordenes where idOrdenes=?");
            comando.setInt(1, idOrdenes);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaOrden(){

            PreparedStatement comando;
            ResultSet resultado;
            objOrd.conectar();
        try {    
            comando= objOrd.conexion.prepareCall("Select * from ordenes WHERE idOrdenes=?");
            comando.setInt(1,idOrdenes);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            idCliente=resultado.getInt("cliente");
            costo=resultado.getDouble("costo");
            status=resultado.getString("status");
            fecha=resultado.getString("fecha");
            codigoTransaccion=resultado.getString("codigoTransaccion");
            metodoPago=resultado.getString("metodoPago");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            idCliente=0;
            costo=0;
            status="";
            fecha="";
            codigoTransaccion="";
            metodoPago="";
            
            
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarOrden(){
   PreparedStatement conectar;
    objOrd.conectar();
        try {
            conectar = objOrd.conexion.prepareStatement("UPDATE ordenes SET cliente=?,costo=?,status=?,fecha=?,codigoTransaccion=?, metodoPago=? WHERE idOrdenes=?");
          
            conectar.setInt(1, idCliente);
            conectar.setDouble(2, costo);
            conectar.setString(3, status);
            conectar.setString(4, fecha);
            conectar.setString(5, codigoTransaccion);
            conectar.setInt(6, idOrdenes);
            
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }


    
}
