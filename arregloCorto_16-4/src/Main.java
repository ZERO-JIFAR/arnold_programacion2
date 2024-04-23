import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }
        Arrange ejercicio1 = new Arrange(numbers);
        ejercicio1.ejer1();
        ejercicio1.ejer2();
        ejercicio1.ejer3();
        ejercicio1.ejer4();
        ejercicio1.ejer5();
    }
}