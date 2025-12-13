package structuralDesignPatterns.adapterPattern;

public class AdapterPatternMain {
    public static void main(String[] args) {
        SmsService externalSmsServiceProvider = new ExternalSmsServiceProviderAdapter();
        externalSmsServiceProvider.send("hemanth123","code");
    }

}
