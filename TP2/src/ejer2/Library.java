package ejer2;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library(){}

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook (Book book){
        books.add(book);
    }
    public void seeBook(){
        System.out.println("Libros:");
        for (Book book: books){
            System.out.println(book.toString());
        }
    }
    public int searchBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
    public void lendBook(Book book){
        book.lendB();
    }
    public void returnBook(Book book){
        book.returnB();
    }
}
