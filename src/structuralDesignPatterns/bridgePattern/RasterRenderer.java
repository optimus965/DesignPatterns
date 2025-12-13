package structuralDesignPatterns.bridgePattern;

public class RasterRenderer implements Renderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Using Raster for Rendering Circle of radius: " + radius);
    }

    @Override
    public void renderRectangle(float width, float height) {
        System.out.println("Using Raster for Rendering Rectangle of width: " + width + " height: " + height);
    }
}
