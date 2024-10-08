public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean tiene18años(){
        return edad>=18;
    }
    public boolean nombreCincoLetras(){
        return nombre.length()>=5;
    }
    public boolean nombreContienesoloAZ(){
        return this.nombre.matches("[a-zA-Z]+");
    }
}
