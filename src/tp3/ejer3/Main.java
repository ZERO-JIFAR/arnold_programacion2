package tp3.ejer3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Crear lista de dias de la semana
        List<String> daysWeek = new ArrayList<>();
        daysWeek.add("Lunes");
        daysWeek.add("Martes");
        daysWeek.add("Miercoles");
        daysWeek.add("Jueves");
        daysWeek.add("Viernes");
        daysWeek.add("Sabado");
        daysWeek.add("Domingo");

        // Insertar "Juernes" en la posicion 4
        daysWeek.add(4, "Juernes");

        // Mostrar contenido de las posiciones 3 y 4
        System.out.println("Elemento en la posicion 3: " + daysWeek.get(3));
        System.out.println("Elemento en la posicion 4: " + daysWeek.get(4));

        // Mostrar primer y ultimo elemento
        System.out.println("Primer dia de la semana: " + daysWeek.get(0));
        System.out.println("Último dia de la semana: " + daysWeek.get(daysWeek.size() - 1));

        // Eliminar "Juernes" de la lista
        boolean delete = daysWeek.remove("Juernes");
        if (delete) {
            System.out.println("Se elimino 'Juernes' de la lista");
        } else {
            System.out.println("'Juernes' no encontrado en la lista");
        }

        // Crear e iterar con un iterador
        Iterator<String> iteratorr = daysWeek.iterator();
        System.out.println("Elementos de la lista:");
        while (iteratorr.hasNext()) {
            System.out.println(iteratorr.next());
        }

        // Buscar "Lunes" en la lista
        boolean found = daysWeek.contains("Lunes");
        System.out.println("¿'Lunes' esta en la lista? " + (found ? "Si" : "No"));

        // Buscar "lunes" (ignorando mayusculas/minusculas) en la lista
        boolean foundIgnoredCase = false;
        for (String day : daysWeek) {
            if (day.equalsIgnoreCase("lunes")) {
                foundIgnoredCase = true;
                break;
            }
        }
        System.out.println("¿'lunes' (ignorando mayusculas/minusculas) esta en la lista? "
                + (foundIgnoredCase ? "Si" : "No"));

        // Borrar todos los elementos de la lista
        daysWeek.clear();
        System.out.println("Todos los elementos de la lista han sido eliminados");
    }
}
