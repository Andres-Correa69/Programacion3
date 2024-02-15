package co.ignore.crudrepaso.clases;

import java.util.Date;

public class ProductoPerecedero extends Producto{

    //declaracion variables
    private Date fechaVencimiento;

    //metodo constructor con sper class de producto
    public ProductoPerecedero(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente, Date fechaVencimiento) {
        super(codigo, nombre, descripcion, valorUnitario, cantExistente);
        this.fechaVencimiento = fechaVencimiento;
    }

    //getter y setters
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
