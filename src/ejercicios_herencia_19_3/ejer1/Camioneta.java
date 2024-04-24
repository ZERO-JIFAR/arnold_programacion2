package ejercicios_herencia_19_3.ejer1;
public class Camioneta extends Vehiculo {
    private double carga;
    public Camioneta(String color, int ruedas, double carga){
        super(color,ruedas);
        this.carga = carga;
    }
}