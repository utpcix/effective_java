package pe.edu.utp.iac.accesible.non_internal;

import pe.edu.utp.iac.accesible.internal.Mouse;
import pe.edu.utp.iac.accesible.internal.Software;

public class TestNI {

    public static void main(String[] args) {

        CuadroEvaluacion alumno1 = new CuadroEvaluacion(20,20,20,20,
                0.3f, 0.3f,0.2f, 0.2f);

        CuadroEvaluacion alumno2 = new CuadroEvaluacion(10,10,10,10,
                0.3f, 0.3f,0.2f, 0.2f);

        alumno2.peso_pc1 = 0.6f;
        alumno2.peso_pc2 = 0.6f;
        alumno2.peso_pc3 = 0.4f;
        alumno2.peso_ef = 0.4f;

        System.out.println("alumno1 = " + alumno1.promedio());
        System.out.println("alumno2 = " + alumno2.promedio());

        // Developers use your API because its PUBLIC !
        Software s1 = new OperatingSystem("Linux RedHat",7);
        System.out.println("s1 = " + s1);

        // What happen if the designer decides to change something ??????????
        OperatingSystem os1 = new OperatingSystem("FreeBSD",13);

        Mouse m1 = new Mouse("Logitech",79.5f);
        System.out.println("m1 = " + m1);


    }
}
