package actividad_en_clase_19_3;
public abstract class Empleado {
    private String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre();
    }
}
