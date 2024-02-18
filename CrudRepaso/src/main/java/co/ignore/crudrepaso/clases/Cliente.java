package co.ignore.crudrepaso.clases;

import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

    //declaracion variables
    private String nombre;
    private String apellido;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private  String tipoCliente;

    // Metodo constructor


    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String identificacion, String direccion, String telefono, String email, LocalDate fechaNacimiento, String tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoCliente = tipoCliente;
    }

    //getters y setters

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}
