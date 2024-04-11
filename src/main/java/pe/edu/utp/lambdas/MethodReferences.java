package pe.edu.utp.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MethodReferences {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(Arrays
                .asList("Juan","Ana","Rosa"));
        nombres.forEach(System.out::println);

        Stream<String> stringStream = nombres.stream()
                .map(String::toUpperCase);
        stringStream.forEach(System.out::println);

        Cmd.of(() -> "ping 10.5.6.7").exec();
        Cmd.of(FreeBSD::update).exec();


    }
}
