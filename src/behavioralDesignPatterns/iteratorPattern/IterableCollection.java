package behavioralDesignPatterns.iteratorPattern;

public interface IterableCollection {
    public Iterator createIterator();
    public String getSongAt(int index);
    public int getSize();
    public boolean setShuffle();
    public void addSong(String song);
}
