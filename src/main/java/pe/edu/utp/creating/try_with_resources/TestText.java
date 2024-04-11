package pe.edu.utp.creating.try_with_resources;

import java.io.IOException;

public class TestText {

    public static void main(String[] args) throws IOException {

        String path = "C:\\tmp\\app.log";
        //String firstLine = TextUtil.getFirstLine(path);
        //System.out.println("firstLine = " + firstLine);

        String firstLineBetter = TextUtil.getFirstLineBetter(path);
        System.out.println("firstLineBetter = " + firstLineBetter);

    }
}
