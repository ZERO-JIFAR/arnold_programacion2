package ejer1;

import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal>animals;

    public PetShop(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public PetShop(){}
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void sellAnimal(String name){
        animals.remove(animals.get(searchAnimal(name)));
        System.out.println(name + " VENDIDO");
    }
    public void feedAnimal(String name){
        System.out.println("Alimentar a " + name);
    }
    public void listAnimal(){
        System.out.println("Animales en venta: ");
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
