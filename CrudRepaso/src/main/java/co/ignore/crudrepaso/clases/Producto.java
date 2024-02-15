package co.ignore.crudrepaso.clases;

public class Producto {

    //declaracion variables

    private String codigo;
    private String nombre;
    private String descripcion;
    private Integer valorUnitario;
    private Integer cantExistente;

    //metodo constructor
    public Producto(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantExistente = cantExistente;
    }

    //getter y setters

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
}
