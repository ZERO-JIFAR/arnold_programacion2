package tp3.ejer1;

public class Subject {
    private int classroom;
    private String hour;
    private String name;
    private Group group;
    private Teacher teacher;
    public Subject(){
    }

    public Subject(int classroom, String hour, String name, Group group, Teacher teacher) {
        this.classroom = classroom;
        this.hour = hour;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
