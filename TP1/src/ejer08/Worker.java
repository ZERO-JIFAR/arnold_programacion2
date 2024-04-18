package ejer08;

public abstract class Worker {
    private String name;
    private int age;
    private float salary;
    private boolean ability;

    public Worker(String name, int age, float salary, boolean ability){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.ability=ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isAbility() {
        return ability;
    }

    public void setAbility(boolean ability) {
        this.ability = ability;
    }
    public void viewprofile (){
    }
}
