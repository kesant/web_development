package dh.backend.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String nroCuenta;

    public Empleado(String nombre, String nroCuenta, String apellido) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
