package behavioralDesignPatterns.strategyPattern;

public class StrategyMain {
    public static void main(String[] args) {
//        Use Strategy Pattern when you want to change an algorithm/behavior at runtime without changing the actual object.
        CompressionStrategy rarCompressionStrategy = new RarCompression();
        StrategyContext strategyContext = new StrategyContext(rarCompressionStrategy);
        File file = new File("largeFile",new byte[1024],804234,"mp4");
        strategyContext.compress(file,"CurrentFolder");
        strategyContext.setCompressionStrategy(new TarCompression());
        strategyContext.compress(file,"CurrentFolder");
        strategyContext.setCompressionStrategy(new ZipCompression());
        strategyContext.compress(file,"CurrentFolder");
    }

}
