package ejercicio_en_clase1_4_4;
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(18);

        System.out.println("El area del cuadrado es: "+cuadrado1.area());
        System.out.println("Un cuadrado se puede dibujar: " +cuadrado1.dibujar());
        System.out.println("Un cuadrado se puede rotar: " +cuadrado1.rotar());
        System.out.println("El area del circulo es: "+circulo1.area());
        System.out.println("Un circulo se puede dibujar: " +circulo1.dibujar());
    }
}