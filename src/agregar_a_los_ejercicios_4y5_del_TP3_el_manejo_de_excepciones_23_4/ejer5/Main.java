package agregar_a_los_ejercicios_4y5_del_TP3_el_manejo_de_excepciones_23_4.ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListTask listTasks = new ListTask();

        while (true) {
            System.out.println();
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Descripcion de la tarea: ");
                    String description = scanner.nextLine();
                    System.out.print("Prioridad de la tarea: ");
                    int priority = scanner.nextInt();
                    scanner.nextLine();
                    listTasks.addTask(new Task(description, priority));
                    break;
                case 2:
                    System.out.println("Tareas:");
                    for (Task task : listTasks) {
                        System.out.println("- " + task.getDescription() + " (Prioridad: " + task.getPriority() + ")");
                    }
                    break;
                case 3:
                    System.out.print("Descripcion de la tarea a eliminar: ");
                    String taskDelete = scanner.nextLine();
                    listTasks.deleteTask(taskDelete);
                    break;
                case 4:
                    System.out.println("Nos vemos");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}