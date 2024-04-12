package pe.edu.utp.zpractice.inmutable;

import pe.edu.utp.zpractice.creating.Song;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayListApp {

    public static void main(String[] args) throws IOException {

        String ruta = "src/main/resources/songs.csv";
        List<Song> lista = Song.from(ruta);
        List<Song> miSeleccion = lista.stream()
                .filter(s -> s.getArtist().contains("Metallica"))
                .collect(Collectors.toUnmodifiableList());

        PlayList mySpotify = PlayList.from("Mi super lista de canciones",
                miSeleccion);


        Set<Song> mis_canciones = mySpotify.getSongSet();
        mis_canciones.forEach(System.out::println);


    }
}
