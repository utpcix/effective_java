package pe.edu.utp.exceptions;

import static com.google.common.base.Preconditions.checkArgument;

public class StandardExceptions {

    // 7.2 Favor the use of standard exceptions
    // 7.3 Include failure-capture information in detail

    public static String hello(String name){
        if (name == null) throw new IllegalArgumentException("name cannot be null");
        //if (name == null) throw new IllegalArgumentException();
        return "Hello " + name.toLowerCase();
    }

    public static String newHello(String name){
        checkArgument(name != null, "name cannot be null");
        return "Hello " + name.toLowerCase();
    }

    public static void main(String[] args) {

        //String name = "Rosita"; // What happpen if you put null ?
        String name = null;

        System.out.println("hello(name) = " + hello(name));

        System.out.println("newHello(name) = " + newHello(name));

    }
}
