package pe.edu.utp.exceptions;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class IgnoreExceptions {

    public static void main(String[] args) {

        Path web = null;
        String ruta = "https://www.miweb.com";
        //String ruta = "C:/mi_ruta";
        try {
            web = Path.of(ruta); // wrong ruta
        }catch (InvalidPathException e){
            // Ignore exception <----- DON'T DO THIS !!!
        }

        System.out.println("web = " + web);
        System.out.println(web.equals("www.miweb.com")); // BOOM !

    }
}
