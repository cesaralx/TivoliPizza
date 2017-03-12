package Modelo;

public class Ingredientes {

private int idIngre=0;
private String nombre="";
private int utilizados=0;
private int disponibles=0;
private String productoId="";

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





    
}
