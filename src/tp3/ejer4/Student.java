package tp3.ejer4;

public class Student {
    private int age;
    private String name;
    private double grade;

    public Student(int age, String name, double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "\nNombre: " + name + "\nEdad: " + age + "\nNota: "+ grade + "\n";
    }
}
