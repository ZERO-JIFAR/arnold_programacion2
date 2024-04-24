package ejercicios_herencia_19_3.ejer1;
public class Bicicleta extends Vehiculo {
    private String tipo;
    public Bicicleta(String color, int ruedas, String tipo){
        super(color, ruedas);
        this.tipo = tipo;
    }
}
