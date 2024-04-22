public class Rogue extends BaseCharacter {
    private int stabbed;

    // Constructor
    public Rogue(String name, int level, int lifePoints, int stabbed) {
        super(name, level, lifePoints);
        this.stabbed = stabbed;
    }

    public int stabbed(){
        return stabbed;
    }
    public int attack() {
        return 12;
    }
    public void defense(int damage) {
        lifePoints -= damage / 4;
    }
}
