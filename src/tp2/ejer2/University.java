package tp2.ejer2;

public class University extends Book{
    private String career;

    public University(String title, String author, int yearPublic, boolean borrowed, String career) {
        super(title, author, yearPublic, borrowed);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    @Override
    public String toString() {
        return super.toString() + "Carrera: " + career + "\n";
    }
}
