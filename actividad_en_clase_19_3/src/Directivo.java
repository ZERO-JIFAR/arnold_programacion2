public class Directivo extends Empleado{
    private float sueldo;

    public Directivo(String nombre, float sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Datos del directivo:\nNombre: " + getNombre() + "\nSueldo: " + getSueldo();
    }

}
