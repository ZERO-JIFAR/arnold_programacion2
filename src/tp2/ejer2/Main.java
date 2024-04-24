package tp2.ejer2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library Libreria1 = new Library();
        Libreria1.setBooks(new ArrayList<>());

        Libreria1.addBook(new Childish("Dune", "Frank Herbert",1965,false,16));
        Libreria1.addBook(new Novel("Yo robot","Isaac Asimov", 1950,true, "Ciencia Ficcion"));
        Libreria1.addBook(new University("Algebra Lineal", "Anton", 1999, false, "Ingenieria"));

        Libreria1.lendBook(Libreria1.getBooks().get(Libreria1.searchBook("Dune")));
        Libreria1.returnBook(Libreria1.getBooks().get(Libreria1.searchBook("Yo robot")));
        Libreria1.seeBook();
    }
}
