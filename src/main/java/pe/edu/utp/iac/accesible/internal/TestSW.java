package pe.edu.utp.iac.accesible.internal;

public class TestSW {

    public static void main(String[] args) {

        // Designer use their API (Software interface)

        Software s1 = new SysUtils("Wireshark",4,false);
        System.out.println("s1 = " + s1);

        Mouse m1 = new Mouse("Logitech",79.5f);
        System.out.println("m1 = " + m1);

    }
}
