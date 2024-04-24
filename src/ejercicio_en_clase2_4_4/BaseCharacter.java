package ejercicio_en_clase2_4_4;
public abstract class BaseCharacter implements Character {
    protected String name;
    protected int level;
    protected int lifePoints;

    // Constructor
    public BaseCharacter(String name, int level, int lifePoints) {
        this.name = name;
        this.level = level;
        this.lifePoints = lifePoints;
    }

    // Getter y Setter de los atributos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    // Implementa los metodos de la interfaz Personaje
    public abstract int attack();
    public abstract void defense(int damage);
}