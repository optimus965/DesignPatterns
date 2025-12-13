package behavioralDesignPatterns.strategyPattern;

public class RarCompression implements CompressionStrategy{
    @Override
    public void compress(File file, String outputPath) {
        System.out.println("Compressing the File " + file + " using RarCompression Algorithm to the filePath " + outputPath);
    }
}
