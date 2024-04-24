package ejercicio_en_clase1_4_4;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }
    @Override
    public boolean rotar() {
        return true;
    }
    @Override
    public boolean dibujar() {
        return true;
    }
}
