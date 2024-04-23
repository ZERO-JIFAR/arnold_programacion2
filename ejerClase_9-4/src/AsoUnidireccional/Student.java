package AsoUnidireccional;

public class Student {
    private String name;
    private University university;

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }
    public void setUniversity(University university) {
        this.university = university;
    }
    public void seeUniversity(){
        System.out.println("Universidad actual de "+getName()+": "+getUniversity().getName());
    }
    public void changeUniversity(University newUniversity){
        setUniversity(newUniversity);
        System.out.println(getName()+" cambio de universidad a "+getUniversity().getName());
    }
}
