package structuralDesignPatterns.proxyPattern;

public class HighResolutionImage implements  Image{
    private byte[] imageData;
    private String name;
    public HighResolutionImage(String name) {
        this.name = name;
        loadFromDisk(getFileName());
    }
    private void loadFromDisk(String fileName) {
        System.out.println("Loading image: " + fileName + " from disk (Expensive Operation)...");
        try {
            Thread.sleep(2000);
            imageData = new byte[10*1024*1024];

        }
        catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Image " + fileName + " loaded successfully.");
    }
    @Override
    public void display() {

    }

    @Override
    public String getFileName() {
        return "";
    }
}
