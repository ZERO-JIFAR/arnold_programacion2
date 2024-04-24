package tp1.ejer10;

public class Novel extends Book{
    private String gender;

    public Novel(String title, String author, double price, String gender) {
        super(title, author, price);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public void see(){
        System.out.println("Titulo: "+getTitle()+"\nAutor: "+getAuthor()+"\nPrecio: $"+getPrice()+ "\nGenero: "+getGender());
    }
}
