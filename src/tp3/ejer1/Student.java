package tp3.ejer1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Student extends Person implements Iterable{
    Scanner scan = new Scanner(System.in);
    private ArrayList<Group> groups;
    public Student(Group group,int dni, String name) {
        super(dni, name);
        this.groups = new ArrayList<>();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public void addGroups(Group group) {
        groups.add(group);
    }

    public void seeGroups() {
        for (Group group : groups) {
            System.out.println(group.getLetter());
        }
    }

    @Override
    public Iterator iterator() {
        return groups.iterator();
    }

    public void meetTeacher() {
        String subject = scan.nextLine();
        boolean found = false;

        for (Group group : groups) {
            for (Subject a : group.getSubjects()) {
                if (a.getName().equalsIgnoreCase(subject)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("La materia " + subject + " no se encontro");
        }
    }
}
