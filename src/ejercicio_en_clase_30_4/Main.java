package ejercicio_en_clase_30_4;
public class Main {
    public static void main(String[] args) {
        // Crear al menos una instancia de cada clase
        Atleta atleta1 = new Atleta(32345678, "Juan", 1.75, 30, 75.0);
        Atleta atleta2 = new Atleta(33456789, "Maria", 1.68, 25, 60.0);
        Atleta atleta3 = new Atleta(34567890, "Pedro", 1.80, 28, 120.0);
        Atleta[] atletas = {atleta1, atleta2, atleta3};
        EquipoNacional equipo = new EquipoNacional("Rojo", "España", atletas);

        Instalacion instalacion = new Instalacion("Pista", "Madrid", "Estadio", "Al aire libre");
        Prueba prueba1 = new Prueba(1, "Carrera de 100m", atletas);
        Prueba prueba2 = new Prueba(2, "Carrera de 150m", atletas);

        // Mostrar desde un objeto Instalacion
        System.out.println();
        System.out.println("Nombre del 3° atleta de la 2° prueba: " + instalacion.obtenerNombreTercerAtleta(prueba2));
        System.out.println();
        System.out.println("Codigo de la 2° prueba: " + instalacion.obtenerCodigoSegundaPrueba(prueba2));
        System.out.println();

        // Mostrar desde un objeto EquipoNacional
        double[] alturas = equipo.obtenerAlturas();
        boolean[] pesosExtra = equipo.obtenerPesosExtra();
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Altura del atleta " + (i+1) + ": " + alturas[i]);
            System.out.println("¿Peso extra del atleta " + (i+1) + "?: " + pesosExtra[i]);
        }
    }
}