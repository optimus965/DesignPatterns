package creationalDesignPatterns.singleTonPattern;

// Single desing pattern is a creational design pattern that guarantees a class has only
// one instance and provides a global point of access to it

// to implement the singleton pattern, we must prevent the external objects from creating
//instances of the singleton class. only the singleton class should be permitted to create its
// own objects

// additionally, we need to provide a method for external objects to access the singleton object

public class SingleTonMain {
    public static void main(String[] args) {
        Runnable task = ()-> {
            DoubleCheckSingleTon doubleCheckSingleTon = DoubleCheckSingleTon.singleCheckSingleTon();
            System.out.println(Thread.currentThread().getName() + "-> instance: " + doubleCheckSingleTon.hashCode());
        };
        for(int i =0;i <= 50;i++) {
            Thread t= new Thread(task,"Thread:-" + i);
            t.start();
        }
    }
}
