package Modelo;

public class Pedidos {

    private int idPedido=0;
    private String codigo="";
    private String domicilio="";
    private String statusPe="";
    private String nombreCliente="";
    private String hora="";

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
    
    

    
}
