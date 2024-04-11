package pe.edu.utp.lambdas;

import java.util.function.Supplier;

public class Cmd {

    private final Supplier<String> supplier;

    private Cmd(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static Cmd of(Supplier<String> supplier) {
        return new Cmd(supplier);
    }

    public void exec(){
        System.out.println("Init terminal...");
        System.out.println("user ready...");

        System.out.println(supplier.get()); // Using Supplier

        System.out.println("Closing terminal");
    }

}
