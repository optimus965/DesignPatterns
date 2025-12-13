package behavioralDesignPatterns.strategyPattern;

public class ZipCompression implements CompressionStrategy{
    @Override
    public void compress(File file, String outputPath) {
        System.out.println("Compressing the file "+ file + " using ZipCompression Algorithm to the filePath " + outputPath);
    }
}
