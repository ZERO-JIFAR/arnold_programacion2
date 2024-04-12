package ejer1;

public class Fish {
    private String species;
    private boolean territorial;

    public Fish(String species, boolean territorial) {
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
