package co.ignore.crudrepaso.clases;

import java.util.Date;

public class PersonaNatural extends Cliente{

    //declaracion variables
    private String email;
    private Date fechaNacimiento;

    //metodo constructor con super clase de cliente
    public PersonaNatural(String nombre, String apellido, String identificacion, String direccion, String telefono, String email, Date fechaNacimiento) {
        super(nombre, apellido, identificacion, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
