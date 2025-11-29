package creationalDesignPatterns.singleTonPattern;

public class DoubleCheckSingleTon {
    private static DoubleCheckSingleTon doubleCheckSingleTon;

    private DoubleCheckSingleTon() {

    }
    // it may create more than one instance as there is no locking at any level as in single lock or double lock
    public static DoubleCheckSingleTon noLockSingleTon() {
        if(doubleCheckSingleTon == null) {
            doubleCheckSingleTon = new DoubleCheckSingleTon();
        }
        return doubleCheckSingleTon;
    }
    // why double lock over single lock
    // lets say 1000 threads are queued  first time then all those should have to wait until
    // remaining ones are exit and once the first thread exit and all remaining threads starts
    // executing and will get the new instance and from there and other threads which are coming not the ones which
    // hit the method now, different ones then will get instance very fast
    // whereas in single lock , the remaining threads also have to wait it is sequential hit
    // not like before
    public static DoubleCheckSingleTon doubleCheckSingleTon() {
        if(doubleCheckSingleTon == null) {
            synchronized (DoubleCheckSingleTon.class) {
                if(doubleCheckSingleTon == null) {
                    doubleCheckSingleTon = new DoubleCheckSingleTon();
                }
            }
        }
        return doubleCheckSingleTon;
    }
    public static synchronized  DoubleCheckSingleTon singleCheckSingleTon() {
        if(doubleCheckSingleTon == null) {
            doubleCheckSingleTon = new DoubleCheckSingleTon();
            return doubleCheckSingleTon;
        }
        return doubleCheckSingleTon;
    }
    // we moved from the on method synchronize to inside the method synchronize
}
