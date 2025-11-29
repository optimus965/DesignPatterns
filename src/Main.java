import java.util.ArrayList;
import java.util.List;

class Playlist {
    List<String> list;
    public Playlist() {
        list =new ArrayList<>();
    }
    public void addSong(String string) {
        list.add(string);
    }
    public List<String> getSongs() {
        return list;
    }
    public void printSongs() {
        System.out.println(list);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        Playlist playlist =new Playlist();
        for(int i =0;i < 10;i++) {
            playlist.addSong("Hello, world" + String.valueOf(i));
        }
        List<String> list = playlist.getSongs();
        list.add("hemant");
        playlist.printSongs();
        list.clear();
        playlist.printSongs();
    }
}