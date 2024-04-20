package ejer10;

public class UniversityBook extends Book{
    private String university;

    public UniversityBook(String title, String author, double price, String university) {
        super(title, author, price);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    @Override
    public void see(){
        System.out.println("Titulo: "+getTitle()+"\nAutor: "+getAuthor()+"\nPrecio: $"+getPrice()+"\nFacultad donde se publico: "+getUniversity());
    }
}
