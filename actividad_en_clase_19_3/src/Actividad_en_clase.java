public class Actividad_en_clase {
    public static void main(String[] args) {
        Directivo directivo1 = new Directivo("Carlos",15000F);
        Operario operario1 = new Operario("Jose",5000F);
        Tecnico tecnico1 = new Tecnico("Luis",4000F,"Electricidad");
        Oficial oficial1 = new Oficial("Maria Angelica",4500F,"Mantenimiento");

        System.out.println(oficial1.toString());
        System.out.println(tecnico1.toString());
        System.out.println(operario1.toString());
        System.out.println(directivo1.toString());
    }
}