package structuralDesignPatterns.flyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {

    private static final Map<String, EnemyType> enemyTypes = new HashMap<>();

    public static EnemyType getEnemyType(String name, String modelData, String textureData) {
        // If not present, create new flyweight
        if (!enemyTypes.containsKey(name)) {
            enemyTypes.put(name, new EnemyType(name, modelData, textureData));
        }
        return enemyTypes.get(name);  // return existing shared object
    }

    public static int getTotalFlyweights() {
        return enemyTypes.size();
    }
}
