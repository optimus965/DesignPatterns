package behavioralDesignPatterns.templatePattern;

public class PdfUploader extends FileUploader {

    @Override
    protected void validate(FileData file) {
        System.out.println("Validating PDF file structure...");
        if (!file.getExtension().equals("pdf")) {
            throw new RuntimeException("Invalid PDF file!");
        }
    }

    @Override
    protected void scanForViruses(FileData file) {
        System.out.println("Deep scanning PDF for embedded scripts...");
    }

    @Override
    protected void store(FileData file) {
        System.out.println("Storing PDF in /storage/pdfs/");
    }

    @Override
    protected void sendResponse() {
        System.out.println("PDF upload success response sent.");
    }
}
