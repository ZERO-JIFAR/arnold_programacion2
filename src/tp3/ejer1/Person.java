package tp3.ejer1;

public class Person {
    protected int dni;
    protected String name;

    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
