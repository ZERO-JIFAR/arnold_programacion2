package tp2.ejer1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PetShop shop1 = new PetShop();
        shop1.setAnimals(new ArrayList<>());

        shop1.addAnimal(new Dog("Blazer", 5, "Perro",2000.5,"Pirulum",true));
        shop1.addAnimal(new Cat("Mimi", 8, "Gato", 100.5, "Gato",true));
        shop1.addAnimal(new Bird("Poly", 26, "Ave", 0.3, "Loro",true));
        shop1.addAnimal(new Fish("Nemo", 21, "Pez", 40.5, "Pez payaso",true));

        System.out.println(shop1.getAnimals().get(shop1.searchAnimal("Blazer")).toString());
        shop1.sellAnimal("Nemo");
        System.out.println("");
        shop1.feedAnimal("Mimi");
        System.out.println("");
        shop1.listAnimal();
    }
}
