package tp4.ejer1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int secretNum = (int) (Math.random()*100)+1;
        int attempts = 0;
        int num;
        System.out.println("ADIVINA EL NUMERO SECRETO ENTRE 1 Y 100");
        while(true){
            System.out.print("Numero: ");
            try {
                num = Integer.parseInt(read.nextLine());
                if(num==secretNum){
                    attempts++;
                    System.out.println("ADIVINASTE!!! El numero secreto es " + secretNum +
                            ". Cantidad de intentos: " + attempts);
                    break;
                } else if (num>secretNum) {
                    System.out.println("El numero secreto es mas chico.");
                    attempts++;
                } else{
                    System.out.println("El numero secreto es mas grande");
                    attempts++;
                }
            }catch (NumberFormatException e){
                System.out.println("Tenes que ingresar un numero entero entre 1 y 100");
                attempts++;
            }
        }
    }
}