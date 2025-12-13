package structuralDesignPatterns.flyWeightPattern;

public class FlyWeightMain {
    public static void main(String[] args) {

        EnemyType orcType = EnemyFactory.getEnemyType(
                "Orc",
                "OrcModelData",
                "OrcTextureData"
        );

        EnemyType trollType = EnemyFactory.getEnemyType(
                "Troll",
                "TrollModelData",
                "TrollTextureData"
        );

        // Create 5 enemies of Orc type (lightweight)
        Enemy e1 = new Enemy(10, 20, 100, orcType);
        Enemy e2 = new Enemy(30, 50, 100, orcType);
        Enemy e3 = new Enemy(60, 10, 90,  orcType);
        Enemy e4 = new Enemy(80, 90, 120, orcType);
        Enemy e5 = new Enemy(15, 45, 110, orcType);

        // Create 3 enemies of Troll type (lightweight)
        Enemy t1 = new Enemy(12, 22, 150, trollType);
        Enemy t2 = new Enemy(33, 44, 140, trollType);
        Enemy t3 = new Enemy(77, 88, 160, trollType);

        e1.draw();
        e2.draw();
        t1.draw();

        System.out.println("Total flyweight objects created = " + EnemyFactory.getTotalFlyweights());
    }
}
