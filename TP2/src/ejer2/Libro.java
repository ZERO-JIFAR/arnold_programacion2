package ejer2;

public class Libro {
    private String title;
    private String author;
    private int yearPublic;
    private boolean borrowed;

    public Libro(String title, String author, int yearPublic, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
