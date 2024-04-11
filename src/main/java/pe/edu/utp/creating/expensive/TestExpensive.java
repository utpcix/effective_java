package pe.edu.utp.creating.expensive;

public class TestExpensive {

    // 3. Avoid creating unnecesary objects

    public static void main(String[] args) {

        System.out.println("CodigoUTP.isValid(\"U24245678\") = " +
                CodigoUTP.isValid("U24245678"));

        System.out.println("CodigoUTP.isCodigoValido(\"U24245678\") = " +
                CodigoUTP.isCodigoValido("U24245678"));

    }

}
