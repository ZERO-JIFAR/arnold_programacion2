package ejercicios_en_clase_9_4.AsoBidireccional;
import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>() {};

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List getBooks() {
        return books;
    }
    public void setBooks(ArrayList books) {
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void seeBook(){
        System.out.println("Libros de "+getName()+":");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
