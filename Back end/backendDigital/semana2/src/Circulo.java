import com.sun.security.jgss.GSSUtil;

public class Circulo {
    private String color ;
    private double radio;
    private String tamaño;

    public Circulo(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void dibujar(){
        System.out.println("Dibujamos objeto color : "+ color);
    }
}
