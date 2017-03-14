
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Conexion;
public class Clientes {

private int idCliente=0;
private String nombre="";
private String email="";
private String password="";
private String numCasa="";
private String calle="";
private String cruceCalles="";
private String colonia="";
private String municipio="";
private String codigoPostal="";
Conexion objCli = new Conexion();
    public Clientes() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumCalle() {
        return numCasa;
    }

    public void setNumCalle(String numCalle) {
        this.numCasa = numCalle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCruceCalles() {
        return cruceCalles;
    }

    public void setCruceCalles(String cruceCalles) {
        this.cruceCalles = cruceCalles;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String Colonia) {
        this.colonia = Colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void altaCliente(){

    PreparedStatement conectar;
    objCli.conectar();
        try {
            conectar = objCli.conexion.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?,?,?)");
            conectar.setInt(1, idCliente);
            conectar.setString(2, nombre);
            conectar.setString(3, email);
            conectar.setString(4, password);
            conectar.setString(5, numCasa);
            conectar.setString(6, calle);
            conectar.setString(7, cruceCalles);
            conectar.setString(8, colonia);
            conectar.setString(9, municipio);
            conectar.setString(10, codigoPostal);
            
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaCliente(){
PreparedStatement comando;
        objCli.conectar();
            
        try {    
            comando=objCli.conexion.prepareStatement("Delete from clientes where idCliente=?");
            comando.setInt(1, idCliente);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaCliente(){

            PreparedStatement comando;
            ResultSet resultado;
            objCli.conectar();
        try {    
            comando= objCli.conexion.prepareCall("Select * from clientes WHERE idCliente=?");
            comando.setInt(1,idCliente);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            nombre=resultado.getString("nombre");
            email=resultado.getString("email");
            password=resultado.getString("password");
            numCasa=resultado.getString("numeroCasa");
            calle=resultado.getString("calle");
            cruceCalles=resultado.getString("cruceCalles");
            colonia=resultado.getString("colonia");
            municipio=resultado.getString("municipio");
            codigoPostal=resultado.getString("codigoPostal");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            nombre="";
            email="";
            password="";
            numCasa="";
            calle="";
            cruceCalles="";
            colonia="";
            municipio="";
            codigoPostal="";
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarCliente(){
   PreparedStatement conectar;
    objCli.conectar();
        try {
            conectar = objCli.conexion.prepareStatement("UPDATE clientes SET nombre=?,email=?,password=?,numeroCasa=?,calle=?, cruceCalles=?, colonia=?, municipio=?, codigoPostal=? WHERE idCliente=?");
          
            conectar.setString(1, nombre);
            conectar.setString(2, password);
            conectar.setString(3, email); 
            conectar.setString(4, numCasa);
            conectar.setString(5, calle);
            conectar.setString(6, cruceCalles);
            conectar.setString(7, colonia);
            conectar.setString(8, municipio);
            conectar.setString(9, codigoPostal);
            conectar.setInt(10, idCliente);
            
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }


}
