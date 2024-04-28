package tp3.ejer4;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
public class School implements Iterable<Student>{
    Scanner scan = new Scanner(System.in);
    private ArrayList<Student> students;
    public School() {
        this.students = new ArrayList<>();
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
    public void addStudent() {
        while (true) {
            try {
                System.out.print("Ingrese el nombre del estudiante que desea registrar: ");
                String name = scan.nextLine();

                System.out.print("Ingrese la edad del estudiante: ");
                int age = scan.nextInt();
                scan.nextLine();

                if (age < 12 || age > 18) {
                    System.out.println("Edad invalida. Debe estar entre 12 y 18 anios");
                    continue;
                }

                System.out.print("Ingrese la nota del estudiante: ");
                double nota = scan.nextDouble();
                scan.nextLine();

                students.add(new Student(age, name, nota));
                System.out.println("Estudiante agregado");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero para la edad y la nota");
                scan.nextLine();
                continue;
            }
        }
    }
    public void seeListStudent(){
        for (Student student: students){
            System.out.print(student.toString());
        }
    }
    public void calculateAverage(){
        int count = 0;
        double add = 0;
        double average = 0;
        for (Student student : students){
            count++;
            add += student.getGrade();
        }
        average = add/count;
        System.out.println("El promedio de notas de los estudiantes es: " + average);
    }
    public void studentsHigherGrades(){
        double higherGrade = 0;
        ArrayList higherGrades = new ArrayList();
        for (Student student: students){
            if (student.getGrade() > higherGrade){
                higherGrade = student.getGrade();
            }
        }
        for (Student student: students){
            if (student.getGrade() == higherGrade){
                higherGrades.add(student);
            }
        }
        System.out.println("Estudiantes con notas mas altas: "+ higherGrades);
    }
    public void seekerStudent(){
        System.out.println("Ingrese el nombre del estudiante que busca: ");
        String nameStudent = scan.nextLine();
        boolean found = false;
        for (Student student: students){
            if (nameStudent.equalsIgnoreCase(student.getName())){
                found = true;
                System.out.println(student.toString());
                break;
            }
        }
        if (!found){
            System.out.println("No se encontro el estudiante");
        }
    }
}
