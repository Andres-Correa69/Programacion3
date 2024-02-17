package co.ignore.crudrepaso.clases;

import java.time.LocalDate;
import java.util.Date;

public class ProductoEnvasado extends Producto{

    //declaracion de variables
    private LocalDate fechaEnvasado;
    private Integer peso;

    private PaisOrigen pais;

    //metodo constructor con super class de producto

    public ProductoEnvasado(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente, LocalDate fechaEnvasado, Integer peso) {
        super(codigo, nombre, descripcion, valorUnitario, cantExistente);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais.COLOMBIA;
    }

    //getter y setters

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
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
