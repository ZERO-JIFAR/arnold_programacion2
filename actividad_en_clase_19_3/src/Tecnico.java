public class Tecnico extends Operario{
    private String departamento;

    public Tecnico(String nombre, Float sueldo, String departamento) {
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
        return "Datos del tecnico:\nNombre: " + getNombre() + "\nSueldo: " + getSueldo() + "\nDepartamento: " + getDepartamento();
    }
}
