package ejercicios_herencia_19_3.ejer2;
public class Pajaro extends Animal{
    private String especie;
    public Pajaro(String nombre, int edad, String sexo, String especie) {
        super(nombre, edad, sexo);
        this.especie = especie;
    }
    public void hacer_sonido(){
        System.out.println("El pajaro silba");
    }

    @Override
    public void informacion() {
        super.informacion();
        System.out.println("Especie: "+ especie);
    }
}
