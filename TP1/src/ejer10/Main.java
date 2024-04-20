package ejer10;

public class Main {
    public static void main(String[] args) {
        Novel libro1 = new Novel("Dune", "Herbert", 19999.99, "Ciencia ficcion");
        TextBook libro2 = new TextBook( "Manual de Java", "Sanchez Acosta",9999.99,"Curso de Java");
        UniversityBook libro3 = new UniversityBook("Introduccion al Algebra","Anton",5000,"UTN");
        libro1.see();
        System.out.println("");
        libro2.see();
        System.out.println("");
        libro3.see();
    }
}
