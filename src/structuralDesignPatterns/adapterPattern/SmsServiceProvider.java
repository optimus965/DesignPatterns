package structuralDesignPatterns.adapterPattern;

public class SmsServiceProvider implements SmsService{
    @Override
    public void send(String to, String message) {
        System.out.println("sending the message using sms service to: " + to + " message: " + message);
    }

    @Override
    public void getStatus(String messageId) {
        System.out.println("getting the status of the messageId: " + messageId);
    }
}
