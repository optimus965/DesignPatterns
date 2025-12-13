package structuralDesignPatterns.adapterPattern;

public interface SmsService {
    public void send(String to,String message);
    public void getStatus(String messageId);
}
