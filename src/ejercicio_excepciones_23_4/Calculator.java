package ejercicio_excepciones_23_4;

import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    public void calculate() {
        while (true) {
            System.out.print("Ingrese el 1° numero: ");
            String number1 = scan.nextLine();
            double num1;
            try {
                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException e2) {
                System.out.println("Numero invalido");
                continue;
            }
            System.out.print("Ingrese la operacion a realizar(+, -, x, /): ");
            String operator = scan.nextLine();
            if (operator.equals("x") || operator.equals("/") || operator.equals("+") || operator.equals("-")) {
            } else {
                System.out.println("Operador invalido.");
                continue;
            }
            System.out.print("Ingrese el 2° numero: ");
            String number2 = scan.nextLine();
            double num2;
            try {
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException e2) {
                System.out.println("Numero invalido");
                continue;
            }
            double result;
            try{
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "x":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            throw new ArithmeticException("No se puede dividir por 0");
                        }
                        break;
                    default:
                        System.out.println("Operador invalido.");
                        continue;
                }
            }catch (ArithmeticException e){
                System.out.println("Error: "+ e.getMessage());
                continue;
            }
            System.out.println("El resultado es: " + result);
            break;
        }
    }
}
