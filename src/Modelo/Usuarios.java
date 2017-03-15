package Modelo;


import java.sql.*;
import javax.swing.JOptionPane;
import Modelo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Usuarios {

private int contador=0;    
private int idUsuarios=0;
private String usrNombre="";
private String password="";
private String fechaAlta="";
private String estatusUsu="";


Conexion obj= new Conexion();

public Usuarios() {
    }

    public String getEstatusUsu() {
        return estatusUsu;
    }

    public void setEstatusUsu(String estatusUsu) {
        this.estatusUsu = estatusUsu;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

  // Metodos de la Clase  
   
public void altaUsuario(){

    PreparedStatement conectar;
    obj.conectar();
        try {
            conectar = obj.conexion.prepareStatement("insert into usuarios values(?,?,?,?,?)");
            conectar.setInt(1, idUsuarios);
            conectar.setString(2, usrNombre);
            conectar.setString(3, password);
            conectar.setString(4, estatusUsu);
            conectar.setString(5, fechaAlta);
            //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Registro Exitoso");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al registrar");
          
        }  
}
public void bajaUsuario(){
PreparedStatement comando;
        obj.conectar();
            
        try {    
            comando=obj.conexion.prepareStatement("Delete from usuarios where idUsuarios=?");
            comando.setInt(1, idUsuarios);
            int resp = comando.executeUpdate();
            JOptionPane.showMessageDialog(null, resp+"Fila(s) afectada(s)");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar");
        }
}

public void consultaUsuario(){

            PreparedStatement comando;
            ResultSet resultado;
            obj.conectar();
        try {    
            comando= obj.conexion.prepareCall("Select * from usuarios WHERE idUsuarios=?");
            comando.setInt(1,idUsuarios);
            resultado=comando.executeQuery();
            
            if(resultado.first()){
            usrNombre=resultado.getString("usrNombre");
            password=resultado.getString("password");
            estatusUsu=resultado.getString("status");
            fechaAlta=resultado.getString("fechaAlta");
            
            }else{
            
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta");
            usrNombre="";
            password="";
            fechaAlta="";
            estatusUsu="";
            }// fin del else 
        } catch (SQLException ex) {
            Logger.getLogger(Pizzas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del try-cach
    }


public void modificarUsuario(){
   PreparedStatement conectar;
    obj.conectar();
        try {
            conectar = obj.conexion.prepareStatement("UPDATE usuarios SET usrNombre=?,password=?,status=?,fechaAlta=? WHERE idUsuarios=?");
          
            conectar.setString(1, usrNombre);
            conectar.setString(2, password);
            conectar.setString(3, estatusUsu);
            conectar.setString(4, fechaAlta);
            conectar.setInt(5, idUsuarios);
             //ejecutar sentencia
            int resp = conectar.executeUpdate();
            JOptionPane.showMessageDialog(null, resp + "Fila(s)afecta(s)");
        } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al actualizar datos");
          
        }
        
   }

public int validarUsuario(){

 int i=0;   
 PreparedStatement comando;
 ResultSet resultado;
 obj.conectar();
 
    try {
        comando=obj.conexion.prepareCall("Select * from usuarios where usrNombre=?");
        comando.setString(1,usrNombre);
        resultado=comando.executeQuery();
        
         if(resultado.first()){
            
             if((getPassword()).equals(resultado.getString("password"))){
                i=1;
             }else
                 i=2;
            
         }else{
            
            JOptionPane.showMessageDialog(null,"Usuario ingresado no existe");
            
            }// fin del else 
        
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
    }

    return i;

}
public void consultaTodo(DefaultTableModel modelito){
 Object[] obj1= new Object[5];
 PreparedStatement com;
 ResultSet res;
 obj.conectar();
 
     if(contador ==0){
     modelito.addColumn("Codigo");
     modelito.addColumn("Nombre");
     modelito.addColumn("Contraseña");
     modelito.addColumn("Estatus");
     modelito.addColumn("Fecha Alta");
     contador++;
     
     }
                
    try {
        com=obj.conexion.prepareCall("Select * from usuarios");
        res=com.executeQuery();
                
        while(res.next()){
            
            for (int i = 0; i < 5; i++) {
            obj1[i] = res.getObject(i+1);
            }
        modelito.addRow(obj1);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}

}
