package tp2.ejer1;

public class Bird extends Animal{
    private String species;
    private boolean speaks;

    public Bird(String name, int age, String typeAnimal, double price, String species, boolean speaks) {
        super(name, age, typeAnimal, price);
        this.species = species;
        this.speaks = speaks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSpeaks() {
        return speaks;
    }

    public void setSpeaks(boolean speaks) {
        this.speaks = speaks;
    }
}
