package behavioralDesignPatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ListIterableCollection implements IterableCollection {

    private List<String> songs = new ArrayList<>();
    boolean shuffle = false;
    public void addSong(String song) {
        songs.add(song);
    }
    public boolean setShuffle() {
        if(shuffle) {
            shuffle = false;
        }
        else {
            shuffle = true;
        }
        return shuffle;
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }

    @Override
    public String getSongAt(int index) {
        int randomIndex = index;
        if(shuffle) {
            randomIndex = (int) (Math.random() * songs.size());
        }
        return songs.get(randomIndex);
    }

    @Override
    public int getSize() {
        return songs.size();
    }
}
