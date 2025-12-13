package structuralDesignPatterns.adapterPattern;

public class ExternalSmsServiceProviderAdapter implements SmsService{
    ExternalSmsServiceProvider externalSmsServiceProvider;
    public ExternalSmsServiceProviderAdapter() {
        this.externalSmsServiceProvider = new ExternalSmsServiceProvider();
    }
    @Override
    public void send(String to, String message) {
        System.out.println("sending the message using externalService");
        System.out.println("to: " + to);
        System.out.println("message: " + message);
        this.externalSmsServiceProvider.sendMessage(message,to,"jfoaidjf");
    }

    @Override
    public void getStatus(String messageId) {
        this.externalSmsServiceProvider.fetchDeliveryReport(messageId);
    }
}
