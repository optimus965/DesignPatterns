package behavioralDesignPatterns.iteratorPattern;

public class ListIterator implements Iterator {

    IterableCollection iterableCollection;
    private int index = 0;

    public ListIterator(ListIterableCollection collection) {
       this.iterableCollection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < iterableCollection.getSize();
    }

    @Override
    public String next() {
        return this.iterableCollection.getSongAt(index++);
    }
}
