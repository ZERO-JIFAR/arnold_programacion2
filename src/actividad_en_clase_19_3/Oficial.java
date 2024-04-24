package actividad_en_clase_19_3;
public class Oficial extends Operario{
    private String departamento;

    public Oficial(String nombre, Float sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(){
        this.departamento=departamento;
    }

    public String toString(){
        return "Datos del oficial:\nNombre: " + getNombre() + "\nSueldo: " + getSueldo() + "\nDepartamento: " + getDepartamento();
    }
}
