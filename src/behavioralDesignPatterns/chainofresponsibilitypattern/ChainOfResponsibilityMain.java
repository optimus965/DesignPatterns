package behavioralDesignPatterns.chainofresponsibilitypattern;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
//        The Chain of Responsibility Design Pattern is a behavioral pattern
//        that lets you pass requests along a chain of handlers,
//        allowing each handler to decide whether to process the request
//        or pass it to the next handler in the chain.
//        A request must be handled by one of many possible handlers, and you don’t want the sender to be tightly coupled to any specific one.
//        You want to decouple request logic from the code that processes it.
//        You want to flexibly add, remove, or reorder handlers without changing the client code.
        RequestHandler auth = new AuthHandler();
        RequestHandler authorization = new AuthorizationHandler();
        RequestHandler rateLimit = new RateLimitHandler();
        RequestHandler validation = new ValidationHandler();
        RequestHandler businessLogic = new BusinessLogicHandler();

        // Build the chain
        auth.setNext(authorization);
        authorization.setNext(rateLimit);
        rateLimit.setNext(validation);
        validation.setNext(businessLogic);

        // Send a request through the chain
        Request request = new Request("john", "ADMIN", 10, "{ \"data\": \"valid\" }");
        auth.handle(request);

        System.out.println("\n--- Trying an invalid request ---");
        Request badRequest = new Request(null, "USER", 150, "");
        auth.handle(badRequest);

    }
}
