package ejer1;

public class Animal {
    private String nombre;
    private int age;
    private String typeAnimal;
    private double price;
    public Animal(String nombre, int age, String typeAnimal, double price) {
        this.nombre = nombre;
        this.age = age;
        this.typeAnimal = typeAnimal;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
