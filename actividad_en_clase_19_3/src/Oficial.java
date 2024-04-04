public class Oficial extends Empleado{
    private String departamento;
    public Oficial() {
    }
    public Oficial(String nombre, int nroEmpleado, String departamento){
        super(nombre, nroEmpleado);
        this.departamento=departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(){
        this.departamento=departamento;
    }

    public String toString(){
        return "cc";
    }
}
