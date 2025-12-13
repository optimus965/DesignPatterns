package behavioralDesignPatterns.strategyPattern;

public class StrategyContext {
    public CompressionStrategy compressionStrategy;
    public StrategyContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compress(File file,String output) {
        this.compressionStrategy.compress(file,output);
    }
    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
}
