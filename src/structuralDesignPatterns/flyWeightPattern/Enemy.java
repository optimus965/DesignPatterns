package structuralDesignPatterns.flyWeightPattern;
public class Enemy {

    private final int x;  // extrinsic
    private final int y;  // extrinsic
    private final int health; // extrinsic
    private final EnemyType type; // shared flyweight

    public Enemy(int x, int y, int health, EnemyType type) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.type = type;
    }

    public void draw() {
        type.render(x, y); // delegate heavy drawing to shared object
    }
}
