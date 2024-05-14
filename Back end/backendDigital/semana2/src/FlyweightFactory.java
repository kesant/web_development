import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<String,Circulo>circulomap=new HashMap<>();
    public static Circulo obtenerCirculo(String color){
        Circulo circulo=circulomap.get(color);//obtiene el circulo por el color
        if(circulo==null){
            circulo= new Circulo(color);
            circulomap.put(color,circulo);
            System.out.println("creo un circulo de color"+color);
        }
        return circulo;
    }

}
