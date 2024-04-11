package pe.edu.utp.enums;

public enum NotaUTP {
    CERO(0),
    UNO(1), DOS(2),  TRES(3),  CUATRO(4), CINCO(5),
    SEIS(6), SIETE(7), OCHO(8), NUEVE (9), DIEZ (10),
    ONCE(11), DOCE(12), TRECE(13), CATORCE(14), QUINCE(15),
    DIECISEIS(16), DIECISIETE(17), DIECIOCHO(18), DIECINUEVE(19), VEINTE(20),
    NS(0);

    private final int value;

    NotaUTP(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static NotaUTP of(String value){
        if (value.equalsIgnoreCase("NS")) return NS;
        int val = Integer.parseInt(value) ;
        return switch (val){
            case 0 -> CERO; case 1 -> UNO;  case 2 -> DOS;
            case 3 -> TRES; case 4 -> CUATRO; case 5 -> CINCO;
            case 6 -> SEIS; case 7 -> SIETE; case 8 -> OCHO;
            case 9 -> NUEVE; case 10 -> DIEZ; case 11 -> ONCE;
            case 12 -> DOCE; case 13 -> TRECE; case 14 -> CATORCE;
            case 15 -> QUINCE; case 16 -> DIECISEIS; case 17 -> DIECISIETE;
            case 18 -> DIECIOCHO; case 19 -> DIECINUEVE; case 20 -> VEINTE;
            default -> throw new IllegalStateException("Unexpected value: " + val);
        };
    }
}
