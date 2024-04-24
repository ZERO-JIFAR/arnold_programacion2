package ejercicios_en_clase_9_4.Agregacion;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void seeInfo(){
        System.out.println("Nombre: "+ getName()+ "\nCargo: "+getPosition()+ "\n");
    }
}
