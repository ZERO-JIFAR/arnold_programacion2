package ejercicio_en_clase2_4_4;
public class Warrior extends BaseCharacter {
    private int heavyBlow;

    // Constructor
    public Warrior(String name, int level, int lifePoints, int heavyBlow) {
        super(name, level, lifePoints);
        this.heavyBlow = heavyBlow;
    }

    public int heavyBlow(){
        return heavyBlow;
    }
    public int attack() {
        return 10;
    }
    public void defense(int damage) {
        lifePoints -= damage / 2;
    }
}
