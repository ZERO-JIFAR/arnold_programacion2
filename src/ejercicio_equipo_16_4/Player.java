package ejercicio_equipo_16_4;
public class Player {
    private String name;
    private String position;
    private int shirtNumber;
    public Player(String name, String position, int shirtNumber) {
        this.name = name;
        this.position = position;
        this.shirtNumber = shirtNumber;
    }
    public Player(Player[] players) {}
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

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }
    public void see(){
        System.out.println("El jugador "+getName()+" tiene la posicion de "+getPosition()+" y su camiseta tiene el numero "+getShirtNumber());
    }
}
