package behavioralDesignPatterns.templatePattern;

public abstract class FileUploader {

    // TEMPLATE METHOD (cannot be overridden)
    public final void uploadFile(FileData file) {
        receive(file);
        validate(file);           // must override
        scanForViruses(file);     // optional override
        store(file);              // optional override
        sendResponse();           // optional override
    }

    private void receive(FileData file) {
        System.out.println("\nReceiving file: " + file.getFileName());
    }

    // REQUIRED override
    protected abstract void validate(FileData file);

    // OPTIONAL override
    protected void scanForViruses(FileData file) {
        System.out.println("Performing default virus scan...");
    }

    // OPTIONAL override
    protected void store(FileData file) {
        System.out.println("Storing file in default location...");
    }

    // OPTIONAL override
    protected void sendResponse() {
        System.out.println("Sending generic upload response...");
    }
}
