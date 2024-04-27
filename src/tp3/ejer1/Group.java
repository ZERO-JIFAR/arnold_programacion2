package tp3.ejer1;
import java.util.ArrayList;
import java.util.Iterator;
public class Group implements Iterable<Student>{
    private String course;
    private char letter;
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;

    public Group(String course, char letter) {
        this.course = course;
        this.letter = letter;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addStudent(int dni, String name){
        Student alumno1 = new Student(this, dni, name);
        students.add(alumno1);
    }
    public void seeStudent(){
        for (Student student: this){
            System.out.println("Nombre: "+ student.getName()+"\nDNI: "+ student.getDni()+ "\n");
        }
    }
    public Student accessStudentDNI(int dni) {
        for (Student student : this) {
            if (dni == student.getDni()) {
                return student;
            }
        }
        return null;
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public void seeSubject(){
        for (int i =0; i< subjects.size(); i++){
            System.out.println(subjects.get(i).getName());
        }
    }
    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    };
}
