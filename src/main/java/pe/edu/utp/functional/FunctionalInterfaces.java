package pe.edu.utp.functional;

import com.google.common.base.Function;
import pe.edu.utp.lambdas.FreeBSD;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        //
        // Functional Interfaces    Arguments       Return      Signature               Example
        //
        // UnaryOperator<T>         T t1            T           T apply(T t1)          String::toLowerCase
        // BinaryOperator<T>        T t1, T t2      T           T apply(T t1, T t2)    BigInteger::add
        // Predicate<T>             T t1            boolean     boolean test(T t1)     Collection::isEmpty
        // Function<T,R>            T t1            R           R apply(T t1)          Arrays::asList
        // Supplier<T>              nothing         T           T get()                Instant::now
        // Consumer<T>              T t1            void        void accept(T t1)      System.out::println

        // Standard Functional Interfaces
        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = String::toLowerCase;
        Function<String, String> function3 = String::trim;
        Function<String, String> function4 = FreeBSD::install;
        List<String> software = new ArrayList<>(Arrays.asList("vim","apache24","wget"));

        HashMap<String, Function<String, String>> functionList = new HashMap<>();
        functionList.put("upper",function1);
        functionList.put("lower",function2);
        functionList.put("trim",function3);
        functionList.put("install", function4);

        String userCmd = "install"; // User election

        // Get the function reference (method reference) and exec for every software
        Function<String, String> stringFunction = functionList.get(userCmd);
        Stream<String> stringStreamAdv = software.stream().map(stringFunction);
        stringStreamAdv.forEach(System.out::println);


        UnaryOperator<String> lower = String::toLowerCase;
        Function<String, String> low = String::toLowerCase;

        Set<String> courses = new HashSet<>(Set.of("JAVA","PYTHON","C++","GO"));

        Set<String> collect = courses.stream().map(lower).collect(Collectors.toSet());
        // Using Consumer
        collect.forEach(System.out::println);

        Student student1 = Student.of("Juan","Sistemas",4);
        Student student2 = Student.of("Ana","Sistemas",5);
        Student student3 = Student.of("Rosa","Sistemas",2);

        // Using Predicate
        List<Student> lista = new ArrayList<>(List.of(student1,student2,student3));
        boolean allFromIT = lista.stream().allMatch(Student::fromIT);
        Collection<Student> sistemas = lista.stream()
                .filter(s -> s.getFaculty().equalsIgnoreCase("Sistemas"))
                .collect(Collectors.toUnmodifiableList());
        Collection<Student> fromSistemas = lista.stream().filter(Student::fromIT)
                .collect(Collectors.toUnmodifiableList());

        System.out.println("allFromIT ? = " + allFromIT);

    }
}
