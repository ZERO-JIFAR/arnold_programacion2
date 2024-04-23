package AsoBidireccional;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private ArrayList<Person> people = new ArrayList<Person>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List getPeople() {
        return people;
    }
    public void setPeople(ArrayList people) {
        this.people = people;
    }
    public void addPeople(Person person){
        people.add(person);
    }
    public void seePeople(){
        System.out.println("Lectores de "+ getTitle()+":");
        for (Person person: people) {
            System.out.println(person.getName());
        }
    }
}
