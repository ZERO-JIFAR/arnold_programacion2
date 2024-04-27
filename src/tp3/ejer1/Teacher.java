package tp3.ejer1;
import java.util.ArrayList;
import java.util.Iterator;
public class Teacher extends Person implements Iterable<Subject>{
    private String department;
    private ArrayList<Subject> subjects;

    public Teacher(int dni, String name, String department) {
        super(dni, name);
        this.department = department;
        this.subjects = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public void seeSubject(){
        for (Subject subject: this){
            System.out.println(subject.getName());
        }
        System.out.println("");
    }
    @Override
    public Iterator<Subject> iterator() {
        return subjects.iterator();
    }

    public void registeredSubject(int indexSubject){
        System.out.println("Alumnos inscriptos a "+ this.getSubjects().get(indexSubject).getName()+":");
        for (int i = 0; i < this.getSubjects().get(indexSubject).getGroup().getStudents().size(); i++) {
            System.out.println(this.getSubjects().get(indexSubject).getGroup().getStudents().get(i).getName());
        }
    }
}
