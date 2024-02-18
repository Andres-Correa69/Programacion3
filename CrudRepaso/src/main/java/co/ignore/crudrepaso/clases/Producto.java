package co.ignore.crudrepaso.clases;

public class Producto {

    //declaracion variables

    private String codigo;
    private String nombre;
    private String descripcion;
    private Integer valorUnitario;
    private Integer cantExistente;
    private LocalDate fechaEnvasado;
    private Integer peso;
    private PaisOrigen pais;
    private LocalDate fechaVencimiento;
    private String codigoAprovacion;
    private String temperaturaRefrigeracion;

    //metodo constructor
    public Producto(String codigo, String nombre, String descripcion, Integer valorUnitario, Integer cantExistente,
                    LocalDate fechaEnvasado, Integer peso, PaisOrigen pais, LocalDate fechaVencimiento, String codigoAprovacion,
                    String temperaturaRefrigeracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantExistente = cantExistente;
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais.COLOMBIA;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoAprovacion = codigoAprovacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;


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
