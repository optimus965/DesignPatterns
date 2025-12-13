package behavioralDesignPatterns.strategyPattern;

public class File {
    private String fileName;
    private byte[] fileBytes;
    private long size;
    private String extension;
    public File(String fileName,byte[] fileBytes,long size,String extension) {
        this.fileName = fileName;
        this.fileBytes = fileBytes;
        this.size = size;
        this.extension = extension;
    }
    public String getFileName() {
        return this.fileName;
    }
    public byte[] getFileBytes() {
        return this.fileBytes;
    }
    public long getSize() {
        return this.size;
    }
    public String getExtension() {
        return this.extension;
    }
}
