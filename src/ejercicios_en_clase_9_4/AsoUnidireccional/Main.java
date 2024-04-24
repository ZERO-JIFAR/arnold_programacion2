package ejercicios_en_clase_9_4.AsoUnidireccional;

public class Main {
    public static void main(String[] args) {
        University universidad1 = new University("UTN");
        University universidad2 = new University("FCEN");
        Student estudiante1 = new Student("Carlos", universidad2);
        estudiante1.seeUniversity();
        estudiante1.changeUniversity(universidad1);
        estudiante1.seeUniversity();
    }
}
