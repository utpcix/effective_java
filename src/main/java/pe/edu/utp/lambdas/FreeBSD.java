package pe.edu.utp.lambdas;

public class FreeBSD {

    public static String update(){
        return "pkg update";
    }

    public static String install(String sw){
        return "pkg install " + sw;
    }
}
