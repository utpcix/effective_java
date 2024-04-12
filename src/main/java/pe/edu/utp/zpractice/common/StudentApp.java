package pe.edu.utp.zpractice.common;

import pe.edu.utp.zpractice.creating.Song;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StudentApp {

    public static void main(String[] args) throws IOException {

        Student juan = Student.valueOf("Juan",20, "Java");
        Student carla = Student.valueOf("Carla",20, "Python");
        Student rosa = Student.valueOf("Rosa",20, "Java");
        Student random = Student.valueOf("Juan",20, "Python");

        // ¿los objetos juan y carla son iguales?
        System.out.println("juan.equals(carla) = " + juan.equals(carla));
        // ¿juan y random son iguales?
        System.out.println("juan.equals(random) = " + juan.equals(random));

        String ruta = "src/main/resources/songs.csv";
        List<Song> lista = Song.from(ruta);

        HashMap<Student, Song> studentSong = new HashMap<>();
        studentSong.put(juan, lista.get(0));
        studentSong.put(carla, lista.get(10));
        studentSong.put(rosa, lista.get(20));

        // ¿Que cancion le gusta a carla?
        // ¿QUe cancion le gusta a random?
        Song songForStudent = studentSong.get(random);
        System.out.println("songForStudent = " + songForStudent);

    }
}
