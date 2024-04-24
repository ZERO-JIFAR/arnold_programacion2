package tp1.ejer10;

public class TextBook extends  Book{
    private String associatedCourse;

    public TextBook(String title, String author, double price, String associatedCourse) {
        super(title, author, price);
        this.associatedCourse = associatedCourse;
    }

    public String getAssociatedCourse() {
        return associatedCourse;
    }

    public void setAssociatedCourse(String associatedCourse) {
        this.associatedCourse = associatedCourse;
    }
    @Override
    public void see(){
        System.out.println("Titulo: "+getTitle()+"\nAutor: "+getAuthor()+"\nPrecio: $"+getPrice()+"\nCurso: "+ getAssociatedCourse());
    }
}
