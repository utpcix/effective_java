package pe.edu.utp.commons;

public class TestEquals {

    public static void main(String[] args) {

        // Obey general contract when override equals
        // AND dont forget hashCode

        Software s1 = new Software("Linux",5);
        Software s2 = new Software("Linux", 5);
        Software s3 = new Software("Linux", 5);

        // 1. Reflexive: x.equals(x) == true
        System.out.println("1. Reflexive: x.equals(x) == true");
        System.out.println("s1.equals(s1) = " + s1.equals(s1));

        // 2. Symmetric: x.equals(y) == y.equals(x)
        System.out.println("2. Symmetric: x.equals(y) == y.equals(x)");
        System.out.println("(s1.equals(s2) == s2.equals(s1)) = " + (s1.equals(s2) == s2.equals(s1)));

        // 3. Transitive: if x.equals(y) == true and y.equals(z) == true then x.equals(z) == true
        System.out.println("3. Transitive: if x.equals(y) == true and y.equals(z) == true then x.equals(z) == true");
        boolean transitive = (s1.equals(s2) == s2.equals(s3)) ? s1.equals(s3): false;
        System.out.println("transitive = " + transitive);

        // 4. Consistent: x.equals(y) == true; x.equals(y) == true; x.equals(y) == true; ...
        System.out.println("4. Consistent: x.equals(y) == true; x.equals(y) == true; x.equals(y) == true; ...");
        boolean consistent = (s1.equals(s2) && s1.equals(s2) && s1.equals(s2) && s1.equals(s2));
        System.out.println("consistent = " + consistent);

        // 5. if 2 objects equals then hashcode too
        System.out.println("5. if 2 objects equals then hashcode too");
        System.out.println("(s1.hashCode() == s2.hashCode()) = " + (s1.hashCode() == s2.hashCode()));


    }
}
