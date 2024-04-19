package ejer08;

public class Worker extends Employee{
    private String area;

    public Worker(String name, int age, float salary, boolean ability, String area) {
        super(name, age, salary, ability);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void produce(){
        System.out.println("Produce: " + area);
    }
    @Override
    public void viewProfile(){
        System.out.println("Nombre: "+ getName() + "\nEdad: "+ getAge() + "\nSalario: "+ getSalary()+"\nArea de trabajo: "+ area);
    }
}
