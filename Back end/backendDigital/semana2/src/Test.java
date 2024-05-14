public class Test {
    private static final String colores[]={"rojo","azul","verde","negro"};
    public static void main(String[] args){
        for (int i=0;1<100;i++){
            Circulo circulo=FlyweightFactory.obtenerCirculo(colorAleatorio());
            circulo.setRadio(i+5);
            circulo.setTamaño("tamaño: "+ i*2);
            circulo.dibujar();
        }
    }
    private static String colorAleatorio(){
        return colores[(int)(Math.random()*colores.length)];
    }
}
