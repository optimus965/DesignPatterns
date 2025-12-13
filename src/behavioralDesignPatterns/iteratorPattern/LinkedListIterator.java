package behavioralDesignPatterns.iteratorPattern;

public class LinkedListIterator implements Iterator {
    IterableCollection iterableCollection;
    int index = 0;
    public LinkedListIterator(IterableCollection iterableCollection) {
        this.iterableCollection = iterableCollection;
    }
    @Override
    public boolean hasNext() {
        return index < this.iterableCollection.getSize();
    }

    @Override
    public String next() {
        return this.iterableCollection.getSongAt(index++);
    }

}
