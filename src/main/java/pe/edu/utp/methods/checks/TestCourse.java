package pe.edu.utp.methods.checks;

import java.util.Currency;

public class TestCourse {

    public static void main(String[] args) {

        // Make an error
        Course c1 = Course.of("Java","Sistemas",10);
        Course c2 = Course.of(null, null, 3);

        System.out.println(c1);
        System.out.println(c2);

    }
}
