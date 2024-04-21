package ejer2;

public class Childish extends Book{
    private int recommendedAge;

    public Childish(String title, String author, int yearPublic, boolean borrowed, int recommendedAge) {
        super(title, author, yearPublic, borrowed);
        this.recommendedAge = recommendedAge;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }
    @Override
    public String toString() {
        return super.toString() + "Edad recomendada: " + recommendedAge + "\n";
    }
}
