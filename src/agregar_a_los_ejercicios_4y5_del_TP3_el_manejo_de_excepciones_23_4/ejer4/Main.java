package agregar_a_los_ejercicios_4y5_del_TP3_el_manejo_de_excepciones_23_4.ejer4;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        School school = new School();
        int option;
        do {
            System.out.println();
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiante");
            System.out.println("3. Calcular promedio de notas");
            System.out.println("4. Ver alumno con nota mas alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");

            try {
                option = scan.nextInt();
                scan.nextLine();
                System.out.println();

                switch (option) {
                    case 1:
                        school.addStudent();
                        break;
                    case 2:
                        school.seeListStudent();
                        break;
                    case 3:
                        school.calculateAverage();
                        break;
                    case 4:
                        school.studentsHigherGrades();
                        break;
                    case 5:
                        school.seekerStudent();
                        break;
                    case 6:
                        System.out.println("Nos vemos");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero");
                scan.nextLine();
                option = -1;
            }
        } while (option != 6);
    }
}
