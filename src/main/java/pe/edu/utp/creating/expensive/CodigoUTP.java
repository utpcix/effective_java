package pe.edu.utp.creating.expensive;

import java.util.regex.Pattern;

public class CodigoUTP {

    private static final Pattern CODIGO_VALIDO =
            Pattern.compile("^U[0-9]{8}");

    // Poor performance
    public static boolean isValid(String codigo){
        return codigo.matches("^U[0-9]{8}");
    }

    // Good performance
    public static boolean isCodigoValido(String codigo){
        return CODIGO_VALIDO.matcher(codigo).matches();
    }
}

