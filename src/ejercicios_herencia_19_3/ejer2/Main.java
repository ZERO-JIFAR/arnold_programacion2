package ejercicios_herencia_19_3.ejer2;
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais",4,"Macho","Pirulo");
        Gato gato1 = new Gato("Mimi",8,"Hembra","Pelo corto");
        Pajaro pajaro1 = new Pajaro("Loco",2,"Macho","Carpintero");

        perro1.informacion();
        gato1.informacion();
        pajaro1.hacer_sonido();
    }
}