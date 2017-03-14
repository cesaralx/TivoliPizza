package Modelo;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Conexion;

public class Pizzas {

    Conexion objPiz= new Conexion();
    private int idProductos=0;
    private int idPizza=0;
    private String nombre="";
    private double costo=0;
    private double productoTama=0;
    private String nombreTama="";
    private String imagen;
    private String ingredientes="";
    private String status="";

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getProductoTama() {
        return productoTama;
    }

    public void setProductoTama(double productoTama) {
        this.productoTama = productoTama;
    }

    public String getNombreTama() {
        return nombreTama;
    }

    public void setNombreTama(String nombreTama) {
        this.nombreTama = nombreTama;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}