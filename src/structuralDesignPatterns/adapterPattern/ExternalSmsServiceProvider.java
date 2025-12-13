package structuralDesignPatterns.adapterPattern;

public class ExternalSmsServiceProvider {
    public void sendMessage(String payload,String to,String token) {
        System.out.println("sending the sms to: " + to + "using token: " + token);
        System.out.println("payload: " + payload);
    }
    public void fetchDeliveryReport(String referenceId) {
        System.out.println("getting the information of referenceId: " + referenceId);
    }


}
