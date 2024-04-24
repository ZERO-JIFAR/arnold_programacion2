package ejercicios_en_clase_9_4.Agregacion;

public class Main {
    public static void main(String[] args) {
        Department depto1 = new Department("Noticias");
        Employee empleado1 = new Employee("Juan Carlos Bodoque", "Reportero");
        Employee empleado2 = new Employee("Tulio Tribiño", "Presentador");

        depto1.addEmployee(empleado1);
        depto1.addEmployee(empleado2);
        depto1.seeEmployees();
        depto1.deleteEmployee(empleado1);
        depto1.seeEmployees();
    }
}
