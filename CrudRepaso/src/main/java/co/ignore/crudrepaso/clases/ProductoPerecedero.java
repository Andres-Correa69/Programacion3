package co.ignore.crudrepaso.clases;

import java.time.LocalDate;
import java.util.Date;

public class ProductoPerecedero extends Producto{

    //declaracion variables
    private LocalDate fechaVencimiento;

    //metodo constructor con sper class de producto
    public ProductoPerecedero(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente, LocalDate fechaVencimiento, String tipoProducto) {
        super(codigo, nombre, descripcion, valorUnitario, cantExistente, tipoProducto);
        this.fechaVencimiento = fechaVencimiento;
    }

    //getter y setters
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}