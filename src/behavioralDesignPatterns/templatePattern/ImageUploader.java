package behavioralDesignPatterns.templatePattern;

public class ImageUploader extends FileUploader {

    @Override
    protected void validate(FileData file) {
        System.out.println("Validating image resolution and metadata...");
        if (!(file.getExtension().equals("jpg") || file.getExtension().equals("png"))) {
            throw new RuntimeException("Invalid image file!");
        }
    }

    @Override
    protected void scanForViruses(FileData file) {
        System.out.println("Scanning image for malicious EXIF metadata...");
    }

    // store() and sendResponse() use default implementations
}
