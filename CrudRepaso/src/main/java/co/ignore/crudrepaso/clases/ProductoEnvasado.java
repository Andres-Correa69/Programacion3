package co.ignore.crudrepaso.clases;

import java.util.Date;

public class ProductoEnvasado extends Producto{

    //declaracion de variables
    private Date fechaEnvasado;
    private Integer peso;

    private PaisOrigen pais;

    //metodo constructor con super class de producto

    public ProductoEnvasado(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente, Date fechaEnvasado, Integer peso) {
        super(codigo, nombre, descripcion, valorUnitario, cantExistente);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = getPais();
    }

    //getter y setters

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public PaisOrigen getPais() {
        return pais;
    }

    public void setPais(PaisOrigen pais) {
        this.pais = pais;
    }
}
