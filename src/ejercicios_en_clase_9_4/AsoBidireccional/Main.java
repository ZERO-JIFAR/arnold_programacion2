package ejercicios_en_clase_9_4.AsoBidireccional;

public class Main {
    public static void main(String[] args) {

        Book libro1 = new Book("Dune");
        Book libro2 = new Book("Yo robot");

        Person persona1 = new Person("Juan Carlos Bodoque");
        Person persona2 = new Person("Tulio Tribiño");
        Person persona3 = new Person("Juanin");

        persona1.addBook(libro1);
        persona1.addBook(libro2);
        persona2.addBook(libro1);
        persona3.addBook(libro1);

        libro1.addPeople(persona1);
        libro1.addPeople(persona2);
        libro1.addPeople(persona3);
        libro2.addPeople(persona3);

        persona1.seeBook();
        System.out.println("");
        persona2.seeBook();
        System.out.println("");
        persona3.seeBook();
        System.out.println("");
        libro1.seePeople();
        System.out.println("");
        libro2.seePeople();
    }
}
