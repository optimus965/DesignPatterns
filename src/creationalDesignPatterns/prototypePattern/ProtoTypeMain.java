package creationalDesignPatterns.prototypePattern;

public class ProtoTypeMain {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Enemy enemy1 = new Enemy("FlyingEnemy", 100, 12.0, false, "Laser");
        Enemy enemy2 = new Enemy("ArmoredEnemy", 300, 6.0, true, "Cannon");
        long end = System.nanoTime();
        System.out.println("Total NEW time for 1000 objects: " + (end - start) + " ns");


        start = System.nanoTime();
        Enemy enemy1Proto = enemy1.clone();
        end = System.nanoTime();
        System.out.println("Total NEW time for 1000 objects: " + (end - start) + " ns");

        start = System.nanoTime();
        for(int i =0;i < 10000;i++) {
            new Enemy("ArmoredEnemy", 300, 6.0, true, "Cannon");
        }
        end = System.nanoTime();
        System.out.println("Total NEW time for 1000 objects: " + (end - start) + " ns");
        start = System.nanoTime();
        for(int i = 0;i < 10000;i++) {
            enemy1.clone();
        }
        end = System.nanoTime();
        System.out.println("Total NEW time for 1000 objects: " + (end - start) + " ns");

//📌 The real rule
//🔥 Clone is faster only when your constructor does heavy work.
//❄️ If constructor is light → new() is faster. => it is jit optimized that is why it seems to be fast for light objects which does not include heavy objects like loading,network calls
//        Total NEW time for 1000 objects: 5252500 ns
//        Total NEW time for 1000 objects: 7500 ns
//        Total NEW time for 1000 objects: 4596019900 ns
//        Total NEW time for 1000 objects: 1029300 ns (here array is shared one)

    }
}
