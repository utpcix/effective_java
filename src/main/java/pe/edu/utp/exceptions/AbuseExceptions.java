package pe.edu.utp.exceptions;

public class AbuseExceptions {

    // 7.1 Use exceptions only for exceptional conditions

    public static void main(String[] args) {

        int[] notas = {10,15,20,20};

        // Horrible ! don't do this
        try {
            int i = 0;
            while (i < notas.length) {
                System.out.println(notas[i]);
                i++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        // Use this
        for (int nota : notas) {
            System.out.println("nota = " + nota);
        }


    }
}
