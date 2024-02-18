package co.ignore.crudrepaso.clases;

public class ProductoRefrigerado extends Producto {

    //declaracion de variables
    private String codigoAprovacion;
    private String temperaturaRefrigeracion;

    //meetodo constructor con super class de producto
    public ProductoRefrigerado(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente, String codigoAprovacion, String temperaturaRefrigeracion, String tipoProducto) {
        super(codigo, nombre, descripcion, valorUnitario, cantExistente, tipoProducto);
        this.codigoAprovacion = codigoAprovacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    //getter y setters
    public String getCodigoAprovacion() {
        return codigoAprovacion;
    }

    public void setCodigoAprovacion(String codigoAprovacion) {
        this.codigoAprovacion = codigoAprovacion;
    }

    public String getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }

    public void setTemperaturaRefrigeracion(String temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }
}