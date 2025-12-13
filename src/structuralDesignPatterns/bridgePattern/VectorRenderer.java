package structuralDesignPatterns.bridgePattern;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("using Vector Renderer to create a circle of radius: " + radius);
    }

    @Override
    public void renderRectangle(float width, float height) {
        System.out.println("using Vector Renderer to create a rectangle of width: " + width + " height: " + height);
    }
}
