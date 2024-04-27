package tp3.ejer2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String seeNameSupervisor() {
        if (supervisor != null) {
            return supervisor.name;
        } else {
            return "Sin supervisor";
        }
    }
}
