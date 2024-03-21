import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EjerciciosHerencia1 {
    public static void main(String[] args) {
        Coche auto1 = new Coche("Negro",4,160,1600);
        Camioneta combi1 = new  Camioneta("Blanco",4,1200);
        Bicicleta bici1 = new Bicicleta("Azul",2,"deportiva");
        Motocicleta moto1 = new Motocicleta("Gris",2,200, 600);
        List<Vehiculo> vehiculos = new ArrayList<>(Arrays.asList(auto1,combi1,bici1,moto1));
        Vehiculo.catalogar(vehiculos, 0);
        Vehiculo.catalogar(vehiculos, 2);
        Vehiculo.catalogar(vehiculos, 4);
    }
}