package structuralDesignPatterns.flyWeightPattern;
// in prototype there will be no separation only one class and it is for instantiating
// fly weight is structural pattern where we delegate the heavy task to object which is common
// which will take care of rendering in object simulation game
public class EnemyType {
    private final String name;
    private final String modelData;   // heavy intrinsic state
    private final String textureData; // heavy intrinsic state
    public EnemyType(String name,String modelData,String textureData) {
        this.name = name;
        this.modelData = modelData;
        this.textureData = textureData;
    }
    public void render(int x, int y) {
        System.out.println("Rendering " + name + " at (" + x + ", " + y + ")");
    }
}
