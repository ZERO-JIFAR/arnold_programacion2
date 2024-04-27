package tp3.ejer2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Empleado
        Employee empleado1 = new Employee("Juanin");
        Employee empleado2 = new Employee("Sr. Manguera");

        // Asignar supervisor al empleado1
        empleado1.assignSupervisor(empleado2);

        // Mostrar nombre del supervisor del empleado1
        System.out.println("El supervisor de " + empleado1.getName() + " es: " + empleado1.seeNameSupervisor());
    }
}
