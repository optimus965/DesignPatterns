package behavioralDesignPatterns.strategyPattern;

public class TarCompression  implements CompressionStrategy{
    @Override
    public void compress(File file, String outputPath) {
        System.out.println("Compressing the file "+ file + " using TarCompression Algorithm to the filePath " + outputPath);
    }
}
