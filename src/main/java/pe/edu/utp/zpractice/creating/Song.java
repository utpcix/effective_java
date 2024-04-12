package pe.edu.utp.zpractice.creating;


import pe.edu.utp.zpractice.utils.TextUTP;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Song implements Serializable {
    private final String artist;
    private final String title;

    private Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public static Song valueOf(String artist, String title) {
        return new Song(artist, title);
    }

    public static Song of(Song song) {
        return new Song(song.artist, song.title);
    }

    public static List<Song> from(String path) throws IOException {
        List<Song> lista = new ArrayList<>();
        List<String> lineas = TextUTP.readlines(path, TextUTP.OS.WINDOWS);
        for (String linea : lineas) {
            String[] data = linea.split(";");
            String artist = data[0];
            String title = data[1];
            lista.add( new Song(artist, title) );
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
