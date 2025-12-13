package behavioralDesignPatterns.templatePattern;

public class VideoUploader extends FileUploader {

    @Override
    protected void validate(FileData file) {
        System.out.println("Validating video codec and duration...");
        if (!(file.getExtension().equals("mp4") || file.getExtension().equals("mkv"))) {
            throw new RuntimeException("Invalid video file!");
        }
    }

    @Override
    protected void store(FileData file) {
        System.out.println("Uploading video to CDN storage...");
    }

    @Override
    protected void sendResponse() {
        System.out.println("Video upload confirmation sent.");
    }
}
