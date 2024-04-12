package pe.edu.utp.zpractice.inmutable;

import org.apache.commons.lang3.SerializationUtils;
import pe.edu.utp.zpractice.creating.Song;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class PlayList {
    private final String name;
    private final Set<Song> songSet;

    private PlayList(String name, Set<Song> songSet) {
        this.name = new String(name);
        this.songSet = songSet.stream()
                // Song must be Serializable
                .map(SerializationUtils::clone)
                .collect(Collectors.toSet());
    }

    public static PlayList from(String name, List<Song> songList){
        Set<Song> collect = songList.stream().collect(Collectors.toSet());
        return new PlayList(name, collect);
    }

    public String getName() {
        return new String(name);
    }

    public Set<Song> getSongSet() {
        return songSet.stream()
                .map(SerializationUtils::clone)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", songSet=" + songSet +
                '}';
    }
}
