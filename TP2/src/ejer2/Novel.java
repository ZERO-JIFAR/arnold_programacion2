package ejer2;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int yearPublic, boolean borrowed, String genre) {
        super(title, author, yearPublic, borrowed);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return super.toString() + "Genero: " + genre + "\n";
    }
}
