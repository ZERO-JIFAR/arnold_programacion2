package tp3.ejer3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        // Crear lista de dias de la semana
        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        // Insertar "Juernes" en la posición 4
        diasSemana.add(4, "Juernes");
        System.out.println("Elemento en la posicion 3: " + diasSemana.get(3));
        System.out.println("Elemento en la posicion 4: " + diasSemana.get(4));

        // Mostrar primer y ultimo elemento
        System.out.println("Primer día de la semana: " + diasSemana.get(0));
        System.out.println("Último día de la semana: " + diasSemana.get(diasSemana.size() - 1));

        // Eliminar "Juernes" de la lista
        boolean eliminado = diasSemana.remove("Juernes");
        if (eliminado) {
            System.out.println("Se elimino 'Juernes' de la lista");
        } else {
            System.out.println("'Juernes' no encontrado en la lista");
        }

        // Crear e iterar con un iterador
        Iterator<String> iterador = diasSemana.iterator();
        System.out.println("Elementos de la lista:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Buscar "Lunes" en la lista
        boolean encontrado = diasSemana.contains("Lunes");
        System.out.println("¿'Lunes' está en la lista? " + (encontrado ? "Si" : "No"));

        // Buscar "lunes" (ignorando mayusculas/minusculas) en la lista
        boolean encontradoIgnorandoCase = false;
        for (String dia : diasSemana) {
            if (dia.equalsIgnoreCase("lunes")) {
                encontradoIgnorandoCase = true;
                break;
            }
        }
        System.out.println("¿'lunes' (ignorando mayusculas/minusculas) esta en la lista? " + (encontradoIgnorandoCase ? "Sí" : "No"));

        // Borrar todos los elementos de la lista
        diasSemana.clear();
        System.out.println("Todos los elementos de la lista han sido eliminados.");
    }
}
