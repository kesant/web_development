package dh.backend.model;

public class EmpleadoEfectivo extends Empleado{
    private double sueldoBase;
    private double descuentos;
    private double premios;

    public EmpleadoEfectivo(String nombre, String nroCuenta, String apellido, double sueldoBase, double premios, double descuentos) {
        super(nombre, nroCuenta, apellido);
        this.sueldoBase = sueldoBase;
        this.premios = premios;
        this.descuentos = descuentos;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPremios() {
        return premios;
    }

    public void setPremios(double premios) {
        this.premios = premios;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
}
