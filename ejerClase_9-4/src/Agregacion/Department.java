package Agregacion;
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void deleteEmployee(Employee employee){
        employees.remove(employee);
    }
    public void seeEmployees(){
        System.out.println("Empleado/s del departamento de "+ getName()+":");
        for (Employee employee: employees){
            employee.seeInfo();
        }
    }
}
