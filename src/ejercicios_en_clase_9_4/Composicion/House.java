package ejercicios_en_clase_9_4.Composicion;
import java.util.ArrayList;

public class House {
    private ArrayList<Door> doors;
    public House(int nDoors) {
        doors = new ArrayList<>();
        for (int i = 0; i < nDoors; i++) {
            doors.add(new Door("Material" + (i+1)));
        }
    }
    public void seeMaterial(){
        System.out.println("Materiales de las puertas de la casa:");
        for (Door door: doors){
            System.out.println(door.getMaterial());
        }
    }
}
