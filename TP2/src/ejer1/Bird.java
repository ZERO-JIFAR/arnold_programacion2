package ejer1;

public class Bird {
    private String species;
    private boolean speaks;

    public Bird(String species, boolean speaks) {
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
