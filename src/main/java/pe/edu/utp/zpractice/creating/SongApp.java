package pe.edu.utp.zpractice.creating;

import java.io.IOException;
import java.util.List;

public class SongApp {
    public static void main(String[] args) throws IOException {

        String ruta = "src/main/resources/songs.csv";
        List<Song> lista = Song.from(ruta);
        lista.forEach(System.out::println);

    }
}
