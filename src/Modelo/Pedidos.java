package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Conexion;
public class Pedidos {

    private int idPedido=0;
    private String codigo="";
    private String domicilio="";
    private String statusPe="";
    private String nombreCliente="";
    private String hora="";
    Conexion objPe=  new Conexion();
    
    public Pedidos() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getStatusPe() {
        return statusPe;
    }

    public void setStatusPe(String statusPe) {
        this.statusPe = statusPe;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
public void altaPedidos(){

    PreparedStatement conectar;
    objPe.conectar();
        try {
            conectar = objPe.conexion.prepareStatement("insert into pedidos values(?,?,?,?,?,?,?,?,?,?)");
            conectar.setInt(1, idPedido);
            conectar.setString(2, codigo);
            conectar.setString(3, domicilio);
            conectar.setString(4, statusPe);
            conectar.setString(5, nombreCliente);
            conectar.setString(6, hora);
            
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaPedidos(){
PreparedStatement comando;
        objPe.conectar();
            
        try {    
            comando=objPe.conexion.prepareStatement("Delete from pedidos where idPedido=?");
            comando.setInt(1, idPedido);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaPedidos(){

            PreparedStatement comando;
            ResultSet resultado;
            objPe.conectar();
        try {    
            comando= objPe.conexion.prepareCall("Select * from pedidos WHERE idPedido=?");
            comando.setInt(1,idPedido);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            codigo=resultado.getString("codigo");
            domicilio=resultado.getString("domicilio");
            statusPe=resultado.getString("statusPe");
            nombreCliente=resultado.getString("nombreCliente");
            hora=resultado.getString("hora");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            codigo="";
            domicilio="";
            statusPe="";
            nombreCliente="";
            hora="";
            
            
            
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarPedidos(){
   PreparedStatement conectar;
    objPe.conectar();
        try {
            conectar = objPe.conexion.prepareStatement("UPDATE pedidos SET codigo=?,domicilio=?,statusPe=?,nombreCliente=?,hora=? WHERE idPedido=?");
          
            conectar.setString(1, codigo);
            conectar.setString(2, domicilio);
            conectar.setString(3, statusPe);
            conectar.setString(4, nombreCliente);
            conectar.setString(5, hora);
            conectar.setInt(6, idPedido);
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }
    

    
}
