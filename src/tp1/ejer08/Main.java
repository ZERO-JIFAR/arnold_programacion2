package tp1.ejer08;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Ana",35,200,true,"Finanzas");
        Worker worker1 = new Worker("Juan",40,150,true,"Sistemas");
        manager1.viewProfile();
        manager1.organizeActivities();
        System.out.println(" ");
        worker1.viewProfile();
        worker1.produce();
    }
}