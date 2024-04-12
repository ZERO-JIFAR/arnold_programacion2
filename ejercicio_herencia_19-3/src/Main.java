public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuenta1 = new CuentaAhorros(15000f,0.03f);
        //cuenta1.retirar(3000);
        cuenta1.retirar(2000);
        cuenta1.retirar(1000);
        cuenta1.extracto();
        cuenta1.consignar(10000);
        cuenta1.imprimir();

    }
}