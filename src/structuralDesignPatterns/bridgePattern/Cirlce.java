package structuralDesignPatterns.bridgePattern;

public class Cirlce extends Shape{
    private int radius;
    public Cirlce(Renderer renderer,int radius) {

        super(renderer);
        this.radius = radius;
    }
    @Override
    void draw() {
        System.out.println("Circle Delegating the call to the Renderer for implementation");
        renderer.renderCircle(this.radius);
    }
}
