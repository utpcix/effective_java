package pe.edu.utp.enums;

public class TestEnums {
    public static void main(String[] args) {

        Priority pri = Priority.LOW;

        String val = switch (pri){
            case LOW -> "Low Priority";
            case MEDIUM -> "Medium Priority";
            case HIGH -> "High Priority";
            default -> "Unkown";
        };

        System.out.println("val = " + val);

        NotaUTP nota1 = NotaUTP.ONCE;
        NotaUTP nota2 = NotaUTP.NS;
        NotaUTP n5 = NotaUTP.valueOf("CINCO");
        NotaUTP ns = NotaUTP.of("NS");
        NotaUTP n0 = NotaUTP.of("0");

        int n = nota1.getValue() + nota2.getValue();
        System.out.println("n = " + n);
        System.out.println("n5 = " + n5);
        System.out.println("ns = " + ns);
        System.out.println("n0 = " + n0);

        for (int i = 0; i < 21; i++) {
            NotaUTP nota = NotaUTP.of(String.valueOf(i));
            System.out.println("nota = " + nota);
            System.out.println("nota.getValue() = " + nota.getValue());
        }


    }
}
