package pe.edu.utp.creating.factory_methods;

import java.lang.reflect.Array;
import java.nio.file.FileStore;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestCreating {

    // Consider static factory methods instead of constructors

    public static void main(String[] args) {

        Software opera = Software.valueOf("Opera", 30, 0, Software.Type.UTILITY);

        OS fedora = new OS("Fedora", OS.Type.LINUX, "34.5.125");
        Software sw_fedora = Software.from(fedora);

        List<Software> lista_sw = new ArrayList<>();

        lista_sw.add(opera);
        lista_sw.add(opera);
        lista_sw.add(opera);
        lista_sw.add(sw_fedora);

        Set<Software> set_sw = Software.of(lista_sw);

        Software redhat = Software.getInstance("REDHAT");

        System.out.println("opera = " + opera);
        System.out.println("sw_fedora = " + sw_fedora);
        System.out.println("redhat = " + redhat);

        System.out.println("lista_sw.size() = " + lista_sw.size());
        System.out.println("set_sw.size() = " + set_sw.size());

        List<String> lista_demo = List.of("A", "B", "C");
        Integer test = Integer.valueOf("35");
        System.out.println("test = " + test);

    }
}
