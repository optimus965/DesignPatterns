package structuralDesignPatterns.bridgePattern;

abstract public class Shape {
    public Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    abstract void draw();
}
