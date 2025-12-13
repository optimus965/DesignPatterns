package structuralDesignPatterns.bridgePattern;

public class BridgeMain {
    public static void main(String[] args) {

        // it helps in preventing the class explosion and changing the rendered at runtime
        Renderer vector = new RasterRenderer();
        Renderer raster = new VectorRenderer();
        Shape circle1 = new Cirlce(vector, 5);
        Shape circle2 = new Cirlce(raster, 5);

        Shape rectangle1 = new Rectangle(vector, 10, 4);
        Shape rectangle2 = new Rectangle(raster, 10, 4);

        circle1.draw();     // Vector
        circle2.draw();     // Raster
        rectangle1.draw();  // Vector
        rectangle2.draw();  // Raster

//        What We Achieved
//        Decoupled abstractions from implementations: Shapes and renderers evolve independently
//        Open/Closed compliance: You can add new renderers or shapes without modifying existing ones
//        No class explosion: Avoided the need for every shape-renderer subclass
//        Runtime flexibility: Dynamically switch renderers based on user/device context
//        Clean, extensible design: Each class has a single responsibility and can be composed as needed

    }
}
