package structuralDesignPatterns.bridgePattern;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(Renderer renderer,int width,int height){
        super(renderer);
        this.width = width;
        this.height = height;
    }
    @Override
    void draw() {
        System.out.println("Rectangle Delegating the call to the rendered: " + renderer.toString() + " for implementation");
        renderer.renderRectangle(this.width,this.height);
    }
}
