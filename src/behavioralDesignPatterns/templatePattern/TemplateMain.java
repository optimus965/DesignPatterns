package behavioralDesignPatterns.templatePattern;
//abstract class AbstractReportExporter {
// template method defines a sequence of steps to be performed
// those step will be overridden by subclasses based on the use case but
// sequence of steps for all the objects will be common
//    public final void exportReport(ReportData data, String filePath) {
//        prepareData(data);
//        openFile(filePath);
//        writeHeader(data);
//        writeDataRows(data);
//        writeFooter(data);
//        closeFile(filePath);
//        System.out.println("Export complete: " + filePath);
//    }
//
//    protected void prepareData(ReportData data) { // Hook method
//        System.out.println("Preparing report data (common step)...");
//    }
//
//    protected void openFile(String filePath) { // Hook method
//        System.out.println("Opening file '" + filePath);
//    };
//
//    protected abstract void writeHeader(ReportData data);
//
//    protected abstract void writeDataRows(ReportData data);
//
//    protected void writeFooter(ReportData data) { // Hook method
//        System.out.println("Writing footer (default: no footer).");
//    }
//
//    protected void closeFile(String filePath) { // Hook method
//        System.out.println("Closing file '" + filePath);
//    };
//}
public class TemplateMain {
    public static void main(String[] args) {
//        The Template Method pattern defines the skeleton of an algorithm in a method,
//        deferring some steps to subclasses. It allows you to keep the overall structure
//        of the process consistent, while giving subclasses the flexibility to customize
//        specific parts of the algorithm.
//        ✔ Template Method = Algorithm with fixed steps + customizable sub-steps.
//✔ Base class defines the skeleton
//✔ Subclasses override the variable parts


        FileUploader pdfUploader = new PdfUploader();
        FileUploader imageUploader = new ImageUploader();
        FileUploader videoUploader = new VideoUploader();

        FileData pdf = new FileData("Resume", "pdf");
        FileData img = new FileData("ProfilePic", "jpg");
        FileData vid = new FileData("MovieClip", "mp4");

        pdfUploader.uploadFile(pdf);
        imageUploader.uploadFile(img);
        videoUploader.uploadFile(vid);
    }
}
