import models.Curso;
import models.Producto;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300));

        // Obtener la cantidad de cursos con una duración mayor a 5 horas.
        long cursosMas5 = cursos.stream().filter(curso -> curso.getDuracion() > 5).count();
        System.out.println("- Cursos de más de 5 horas: " + cursosMas5);
        // Obtener la cantidad de cursos con una duración menor a 2 horas.
        long cursosMenos2 = cursos.stream().filter(curso -> curso.getDuracion() < 2).count();
        System.out.println("- Cursos de menos de 2 horas: " + cursosMenos2);
        //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        System.out.println("- Cursos con más de 50 vídeos: ");
        cursos.stream()
                .filter(curso -> curso.getVideos() > 50)
                .forEach(curso -> System.out.println(curso.getTitulo()));

        // Mostrar en consola el título de los 3 cursos con mayor duración
        System.out.println("- Tres cursos más largos: ");
        cursos.stream().sorted().limit(3).forEach(curso -> System.out.println(curso.getTitulo()));
         // Mostrar en consola la duración total de todos los cursos.
        System.out.println("- Duración total de todos los cursos: ");
        double duracionTotal =
                cursos.stream()
                .mapToDouble(curso-> curso.getDuracion())
                        .sum();
        System.out.println(duracionTotal);
        // Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.
        System.out.println("- Duración supera el promedio");
        OptionalDouble promedio =
                cursos.stream()
                        .mapToDouble(curso ->curso.getDuracion())
                        .average();
        cursos.stream()
                .filter(curso -> curso.getDuracion() > promedio.getAsDouble())
                .map(curso -> curso.getTitulo())
                .forEach(System.out::println);
        //Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        System.out.println("- Cursos con menos de 500 alumnos");
        cursos.stream()
                .filter(curso -> curso.getAlumnos() < 500)
                .map(curso -> curso.getTitulo())
                .forEach(System.out::println);
        // Obtener el curso con mayor duración.
        System.out.println("- Curso con mayor duración");

        System.out.println(cursos.stream().max((curso1,curso2)-> curso1.compareTo(curso2))
                .map(curso -> curso.getTitulo()));



        // Crear una lista de Strings con todos los titulos de los cursos.
        List<String> listaCursos =
                cursos.stream()
                        .map(curso -> curso.getTitulo())
                        .collect(Collectors.toList());






    }

}