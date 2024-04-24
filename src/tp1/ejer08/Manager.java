package tp1.ejer08;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, float salary, boolean ability, String department) {
        super(name, age, salary, ability);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void organizeActivities(){
        System.out.println("La actividad del departamento de "+ department + " esta organizado por "+ getName());
    }
    @Override
    public void viewProfile(){
        System.out.println("Nombre: "+ getName() + "\nEdad: "+ getAge() + "\nSalario: "+ getSalary()+"\nDepartamento de trabajo: "+ department);
    }
}
