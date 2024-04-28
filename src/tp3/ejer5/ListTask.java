package tp3.ejer5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTask implements Iterable<Task>{
    private ArrayList<Task> tasks;
    public ListTask() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(String description) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task tarea = iterator.next();
            if (tarea.getDescription().equals(description)) {
                iterator.remove();
                break;
            }
        }
    }

    public int getTotalTask() {
        return tasks.size();
    }

    @Override
    public Iterator<Task> iterator() {
        tasks.sort((t1, t2) -> t2.getPriority() - t1.getPriority());
        return tasks.iterator();
    }
}
