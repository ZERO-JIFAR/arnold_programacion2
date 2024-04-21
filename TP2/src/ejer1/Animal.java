package ejer1;

public abstract class Animal {
    private String name;
    private int age;
    private String typeAnimal;
    private double price;
    public Animal(String name, int age, String typeAnimal, double price) {
        this.name = name;
        this.age = age;
        this.typeAnimal = typeAnimal;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void feed (String name){}
    public String toString(){
        return ("Nombre: "+ getName()  + "\nEdad: "+ getAge() + "\nTipo: "+ getTypeAnimal() + "\nPrecio: "+ getPrice()+ "\n");
    }
}
