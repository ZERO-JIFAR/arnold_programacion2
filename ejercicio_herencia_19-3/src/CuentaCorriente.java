public class CuentaCorriente extends Cuenta {
    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }
    @Override
    public void retirar(float cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
            numeroRetiros++;
        }else {
            saldo = 0;
            sobregiro = (cantidad - saldo);
        }
    }
    @Override
    public void consignar(float cantidad){
        if (sobregiro > 0){
            if (cantidad - sobregiro < 0){
                sobregiro = 0;
                cantidad -= sobregiro;
            }else {
                sobregiro -= cantidad;
                cantidad -= sobregiro;
            }
        }
        saldo += cantidad;
        numeroConsignaciones ++;
    }
    @Override
    public void extracto(){
        super.extracto();
    }
    @Override
    public void imprimir(){
        System.out.println("Saldo: $"+ getSaldo());
        System.out.println("Comision mensual: $"+ getComisionMensual());
        System.out.println("Transacciones realizadas: "+ (getNumeroConsignaciones()+ getNumeroRetiros()));
        System.out.println("Sobregiros realizados: "+ getSobregiro());
    }
}
