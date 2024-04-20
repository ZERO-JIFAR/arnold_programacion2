package ejer09;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.3);
        Rectangle rectangle1 = new Rectangle(9.3, 12);
        System.out.println("Circulo:");
        System.out.println("Área: "+ circle1.area()+"\nPerímetro: "+circle1.perimeter());
        System.out.println("");
        System.out.println("Rectangulo: ");
        System.out.println("Área: "+ rectangle1.area()+"\nPerímetro: "+rectangle1.perimeter());
    }
}
