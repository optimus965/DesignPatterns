package structuralDesignPatterns.proxyPattern;

public class ImageProxy implements Image {
    private String name;
    private  HighResolutionImage highResolutionImage;
    public ImageProxy(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        if(highResolutionImage == null) {
            System.out.println("ImageProxy: display() requested for " + this.name + ". Loading high-resolution image...");
            highResolutionImage = new HighResolutionImage(this.name);
        }
        else {
            System.out.println("ImageProxy: Using cached high-resolution image for " + this.name);
        }
        highResolutionImage.display();
    }

    @Override
    public String getFileName() {
        return this.name;
    }
}
