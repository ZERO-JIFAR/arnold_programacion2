package ejercicio_en_clase2_4_4;
public class Main {
    public static void main(String[] args) {
        // Crear guerreros, magos y picaros
        Warrior guerrero = new Warrior("Guerrero", 10, 100, 15);
        Magician mago = new Magician("Mago", 10, 80, 5);
        Rogue picaro = new Rogue("Pícaro", 10, 70,2);

        // Simular enfrentamiento
        System.out.println("Inicio del enfrentamiento");
        System.out.println("Puntos de vida iniciales:");
        System.out.println(guerrero.getName() + ": " + guerrero.getLifePoints());
        System.out.println(mago.getName() + ": " + mago.getLifePoints());
        System.out.println(picaro.getName() + ": " + picaro.getLifePoints());

        // Ataques normales
        System.out.println("\nComienzan el combate");
        int damageGuerrero = guerrero.attack();
        mago.defense(damageGuerrero);
        int damageMago = mago.attack();
        picaro.defense(damageMago);
        int damagePicaro = picaro.attack();
        guerrero.defense(damagePicaro);

        // Ataques especiales
        int damageGuerrero2 = guerrero.heavyBlow();
        mago.defense(damageGuerrero2);
        int damageMago2 = mago.potion();
        picaro.defense(damageMago2);
        int damagePicaro2 = picaro.stabbed();
        guerrero.defense(damagePicaro2);

        // Resultados
        System.out.println("\nResultado del enfrentamiento");
        System.out.println("Puntos de vida finales:");
        System.out.println(guerrero.getName() + ": " + guerrero.getLifePoints());
        System.out.println(mago.getName() + ": " + mago.getLifePoints());
        System.out.println(picaro.getName() + ": " + picaro.getLifePoints());
    }
}