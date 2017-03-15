package Modelo;

public class Ordenes {

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
    
}
