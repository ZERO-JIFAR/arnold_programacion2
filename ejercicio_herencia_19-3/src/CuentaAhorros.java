public class CuentaAhorros extends Cuenta {
    protected boolean activa = saldo > 10000;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    @Override
    public void consignar (float cantidad){
        super.consignar(cantidad);
    }
    @Override
    public void retirar (float cantidad){
        super.retirar(cantidad);
    }
    @Override
    public void extracto() {
        if (numeroRetiros > 4) {
            int retirosAdicionales = numeroRetiros - 4;
            setComisionMensual(comisionMensual + retirosAdicionales * 1000);
        }
        super.extracto();
        activa = saldo > 10000;
        if (activa){
            System.out.println("Cuenta Activa");
        }else {
            System.out.println("Cuenta Inactiva");
        }
    }
    @Override
    public void imprimir(){
        System.out.println("Saldo: $"+ getSaldo());
        System.out.println("Comision mensual: $"+ getComisionMensual());
        System.out.println("Transacciones realizadas: "+ (getNumeroConsignaciones()+ getNumeroRetiros()));
    }
}
