public class Magician extends BaseCharacter {
    private int potion;

    // Constructor
    public Magician(String name, int level, int lifePoints, int potion) {
        super(name, level, lifePoints);
        this.potion = potion;
    }

    public int potion(){
        return potion;
    }

    public int attack() {
        return 8;
    }
    public void defense(int damage) {
        lifePoints -= damage / 3;
    }
}
