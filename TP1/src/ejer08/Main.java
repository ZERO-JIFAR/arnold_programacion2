package ejer08;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ana",35,200,true,"Mendoza");
        Worker worker1 = new Worker("Juan",40,150,true,"San José");
        manager1.verPerfilDelEmpleado();
        manager1.organizarActividad();
        worker1.verPerfilDelEmpleado();
        worker1.producir();
    }
}