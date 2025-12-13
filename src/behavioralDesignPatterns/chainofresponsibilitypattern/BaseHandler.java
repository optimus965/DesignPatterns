package behavioralDesignPatterns.chainofresponsibilitypattern;

abstract class BaseHandler implements  RequestHandler {
    protected RequestHandler next;
    @Override
    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void forward(Request request) {
        if(next != null) {
            next.handle(request);
        }
    }
}
