package tp4.ejer3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double base;
        double height;
        System.out.println("Ingrese los datos del triangulo");
        while (true) {
            try {
                System.out.print("Base: ");
                base = Double.parseDouble(read.nextLine());
                System.out.print("Altura: ");
                height = Double.parseDouble(read.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
            }
        }
        System.out.println("El area es: " + ((base * height) / 2));
    }
}