package creationalDesignPatterns.prototypePattern;

class Enemy implements EnemyProtoType,Cloneable {
    private String type;
    private int health;
    private double speed;
    private boolean armored;
    private String weapon;
    int[] map = new int[1_000_000];
    public Enemy(String type, int health, double speed, boolean armored, String weapon) {
        this.type = type;
        this.health = health;
        this.speed = speed;
        this.armored = armored;
        this.weapon = weapon;
        map = new int[1_00_0000];
    }

    @Override
    public Enemy clone() {
        try {
            Enemy cloned = (Enemy) super.clone();
            cloned.map = this.map.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printStats() {
        System.out.println(type + " [Health: " + health +
                ", Speed: " + speed +
                ", Armored: " + armored +
                ", Weapon: " + weapon + "]");
    }
}
