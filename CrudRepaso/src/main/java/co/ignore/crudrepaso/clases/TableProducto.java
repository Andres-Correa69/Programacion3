package co.ignore.crudrepaso.clases;

import java.time.LocalDate;

public class TableProducto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private Integer valorUnitario;
    private Integer cantExistente;
    private String tipoProducto;
    private LocalDate fechaEnvasado;
    private Integer peso;
    private String pais;
    private LocalDate fechaVencimiento;
    private String codigoAprovacion;
    private String temperaturaRefrigeracion;

    public TableProducto(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente,
                         String tipoProducto, LocalDate fechaEnvasado, Integer peso, String pais,
                         LocalDate fechaVencimiento, String codigoAprovacion, String temperaturaRefrigeracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantExistente = cantExistente;
        this.tipoProducto = tipoProducto;
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoAprovacion = codigoAprovacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Integer valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getCantExistente() {
        return cantExistente;
    }

    public void setCantExistente(Integer cantExistente) {
        this.cantExistente = cantExistente;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

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
