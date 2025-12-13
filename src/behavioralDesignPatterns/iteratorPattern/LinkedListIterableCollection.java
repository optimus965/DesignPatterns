package behavioralDesignPatterns.iteratorPattern;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIterableCollection implements IterableCollection {

    private List<String> songs = new LinkedList<>();
    boolean shuffle = false;
    public void addSong(String song) {
        songs.add(song);
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(this);
    }

    @Override
    public String getSongAt(int index) {
        if (index < 0 || index >= songs.size()) {
            return null;
        }
        return songs.get(index);
    }

    @Override
    public int getSize() {
        return songs.size();
    }

    @Override
    public boolean setShuffle() {
        if(shuffle) {
            shuffle = false;
        }
        else {
            shuffle = true;
        }
        return shuffle;
    }
}
