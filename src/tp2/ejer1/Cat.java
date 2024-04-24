package tp2.ejer1;

public class Cat extends Animal{
    private String race;
    private boolean sterilized;

    public Cat(String name, int age, String typeAnimal, double price, String race, boolean sterilized) {
        super(name, age, typeAnimal, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }
}
