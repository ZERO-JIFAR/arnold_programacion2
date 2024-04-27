package tp3.ejer1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de Grupo
        Group grupo1 = new Group("Turno mañana", 'A');
        Group grupo2 = new Group("Turno tarde", 'B');
        Group grupo3 = new Group("Turno noche", 'C');

        // Crear objetos de Profesor
        Teacher profe1 = new Teacher(39584261, "Juan Carlos Bodoque", "Santiago");
        Teacher profe2 = new Teacher(38452159, "Tulio Tribiño", "Concepcion");

        // Crear objetos de Asignatura
        Subject materia1 = new Subject(3, "10:00", "Cine", grupo1, profe1);
        Subject materia2 = new Subject(1, "8:00", "Periodismo", grupo1, profe2);
        Subject materia3 = new Subject(4, "12:00", "Teatro", grupo1, profe1);

        // Agregar asignaturas a los profesores
        profe1.addSubject(materia1);
        profe2.addSubject(materia2);
        profe1.addSubject(materia3);

        // Agregar estudiantes a los grupos
        grupo1.addStudent(38512478, "Mario Hugo");
        grupo1.addStudent(37259984, "Patana");
        grupo1.addStudent(39524152, "Juanin");
        grupo1.addStudent(40657595, "Policarpo");

        // Asignar grupos a las asignaturas
        materia1.getGroup().accessStudentDNI(38512478).addGroups(grupo1);
        materia1.getGroup().accessStudentDNI(37259984).addGroups(grupo1);
        materia1.getGroup().accessStudentDNI(39524152).addGroups(grupo1);
        materia1.getGroup().accessStudentDNI(40657595).addGroups(grupo1);

        // Agregar asignaturas a los grupos
        grupo1.addSubject(materia1);
        grupo1.addSubject(materia2);

        System.out.println("a) El aula de la 3° asignatura es: " + profe1.getSubjects().get(1).getClassroom());

        System.out.println("");

        System.out.println("b) Las asignaturas impartidas por el profesor " + profe1.getName() + " son:");
        profe1.seeSubject();


        Subject asignatura = grupo1.getSubjects().get(0); // Obtener la primera asignatura del grupo1
        System.out.println("c) Alumnos inscriptos en la asignatura " + asignatura.getName() + ":");
        asignatura.getGroup().seeStudent();


        System.out.println("d) No se puede realizar este ejercicio");

        System.out.println("");

        Student alumno = grupo1.getStudents().get(0);
        System.out.println("e) Las asignaturas recibidas por " + alumno.getName() + " en el 1er. grupo son:");
        for (Subject asignaturaGrupo : alumno.getGroups().get(0).getSubjects()) {
            System.out.println(asignaturaGrupo.getName());
        }

        System.out.println("");

        System.out.println("f) Ingrese el nombre de una asignatura existente: ");
        Scanner scan = new Scanner(System.in);
        String nombreAsignatura = scan.nextLine();
        for (Group grupo : alumno.getGroups()) {
            for (Subject asignaturaGrupo : grupo.getSubjects()) {
                if (asignaturaGrupo.getName().equalsIgnoreCase(nombreAsignatura)) {
                    System.out.println("El profesor que imparte la asignatura " + nombreAsignatura + " es: " + asignaturaGrupo.getTeacher().getName());
                    return; // Terminar el bucle si se encuentra la asignatura
                }
            }
        }
        System.out.println("La asignatura " + nombreAsignatura + " no se encontro");

        System.out.println("");

        System.out.println("g) Los nombres de todos los alumnos inscriptos en el Grupo de la 2° Asignatura son:");
        profe1.registeredSubject(1);

        System.out.println("");

        System.out.println("h) Las asociaciones, composiciones y agregaciones son tres tipos de relaciones entre clases en el contexto de la programación ");
        System.out.println("orientada a objetos. Diferencias entre ellas:");
        System.out.println("Asociación:");
        System.out.println("   •\tEn una asociación, dos clases están relacionadas de alguna manera, pero no hay una dependencia fuerte entre ellas.");
        System.out.println("   •\tPueden existir relaciones unidireccionales o bidireccionales.");
        System.out.println("   •\tLas clases pueden existir independientemente una de la otra.");
        System.out.println("Composición:");
        System.out.println("   •\tLa composición es un tipo de relación más fuerte donde una clase (contenedor) contiene a otra clase (componente)");
        System.out.println("     como parte de su estructura interna.");
        System.out.println("   •\tExiste una relación de todo aparte, lo que significa que, si el contenedor se destruye, también se destruyen sus componentes.");
        System.out.println("   •\tLas clases están estrechamente acopladas.");
        System.out.println("Agregación:");
        System.out.println("   •\tLa agregación es similar a la composición en el sentido de que una clase (agregador) contiene a otra clase (agregado),");
        System.out.println("    pero con una diferencia crucial: en la agregación, el agregado puede existir independientemente del agregador.");
        System.out.println("   •\tNo hay una relación de vida útil compartida, lo que significa que la destrucción del agregador no afecta necesariamente al agregado.");
        System.out.println("   •\tLas clases están menos acopladas en comparación con la composición.");
    }
}