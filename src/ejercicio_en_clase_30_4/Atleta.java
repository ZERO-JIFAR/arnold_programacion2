package ejercicio_en_clase_30_4;

public class Atleta extends Persona implements Contrato {
    private double altura;
    private int edad;
    private double peso;

    // Constructor
    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    // Getter y Setter
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    @Override
    public double calculaIMC() {
        return peso / Math.pow(altura, 2);
    }

    @Override
    public boolean hayPesoExtra(double peso) {
        double imc = calculaIMC();
        return imc > peso;
    }

    @Override
    public double tomarPulsaciones() {
        return 0.0;
    }
}
