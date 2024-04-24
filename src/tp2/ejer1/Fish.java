package tp2.ejer1;

public class Fish extends Animal{
    private String species;
    private boolean territorial;

    public Fish(String name, int age, String typeAnimal, double price, String species, boolean territorial) {
        super(name, age, typeAnimal, price);
        this.species = species;
        this.territorial = territorial;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isTerritorial() {
        return territorial;
    }

    public void setTerritorial(boolean territorial) {
        this.territorial = territorial;
    }
}
