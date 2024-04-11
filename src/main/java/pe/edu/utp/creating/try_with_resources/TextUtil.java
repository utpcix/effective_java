package pe.edu.utp.creating.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextUtil {

    // 4. Prefer try-with-resources over try-finally

    public static String getFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        // This is not good
        try{
            return br.readLine();
        } finally {
            br.close();
        }
    }

    public static String getFirstLineBetter(String path){
        // try-with-resources <<<----- This is good
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
