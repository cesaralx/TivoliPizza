package Modelo;

public class DetalleOrden {

    private int idDetalle=0;
    private int idOrden=0;
    private int catidad=0;
    private double precio=0;
    private double total=0;
    private String nombrePizza="";
    private String tamanoPizza="";
    private String codigoTransaccion="";

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

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
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
    
    
    
}
