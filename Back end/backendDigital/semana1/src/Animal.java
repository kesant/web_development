public class Animal {
    private String tipo;
    private String tamaño;
    private int peso;

    public Animal(String tamaño, String tipo, int peso) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public boolean esPesado(){
        return this.peso >200 && this.tamaño.equals("grande");
    }
}
