package behavioralDesignPatterns.chainofresponsibilitypattern;

public class BusinessLogicHandler extends BaseHandler{
    @Override
    public void handle(Request request) {
        System.out.println("BusinessLogicHandler: 🚀 Processing request...");
    }
}
