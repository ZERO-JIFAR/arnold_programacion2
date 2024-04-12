public class Operario extends Empleado{
    private Float sueldo;

    public Operario(String nombre, Float sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return "Datos del operario:\nNombre: " + getNombre() + "\nSueldo: " + getSueldo();
    }
}
