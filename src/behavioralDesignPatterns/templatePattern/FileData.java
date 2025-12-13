package behavioralDesignPatterns.templatePattern;

public class FileData {
    private String fileName;
    private String extension;

    public FileData(String fileName, String extension) {
        this.fileName = fileName;
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public String getExtension() {
        return extension;
    }
}
