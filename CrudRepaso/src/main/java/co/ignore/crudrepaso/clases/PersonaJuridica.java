package co.ignore.crudrepaso.clases;

public class PersonaJuridica extends Cliente{

    //declaracion variables
    private String nit;

    //metodo constructor con super class de cliente
    public PersonaJuridica(String nombre, String apellido, String identificacion, String direccion, String telefono, String nit) {
        super(nombre, apellido, identificacion, direccion, telefono);
        this.nit = nit;
    }
    
    //getter y setter
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
