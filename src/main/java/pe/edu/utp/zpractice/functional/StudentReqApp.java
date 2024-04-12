package pe.edu.utp.zpractice.functional;

import pe.edu.utp.zpractice.common.Student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentReqApp {

    public static void main(String[] args) {

        Student juan = Student.valueOf("Juan",20, "Java");
        Student carla = Student.valueOf("Carla",20, "Python");
        Student rosa = Student.valueOf("Rosa",20, "Java");

        List<Student> lista = List.of(juan, carla, rosa);

        // Listar estudiantes que llevan Java
        List<Student> onlyJava = lista.stream()
                //.filter( s -> s.getCourse().contains("Java") )
                .filter(StudentUtils::isTakingJava)
                .collect(Collectors.toUnmodifiableList());

        System.out.println("onlyJava.size() = " + onlyJava.size());

        // Usando Predicates
        Predicate<Student> rule1 = StudentUtils::isTakingJava;
        Predicate<Student> rule2 = (s -> s.getAge() >= 18);

        List<Predicate<Student>> req_list = List.of(rule1,rule2);
        boolean test_juan = StudentUtils.testRequirements(req_list, juan);
        System.out.println("test_juan = " + test_juan);

        // ¿Que estudiantes cubren todos los requerimientos?
        System.out.println("Cubren los requerimientos");
        for (Student student : lista) {
            boolean cover = StudentUtils.testRequirements(req_list, student);
            if (cover) System.out.println(student);
        }

    }

}
