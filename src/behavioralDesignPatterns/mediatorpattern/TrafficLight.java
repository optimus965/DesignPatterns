package behavioralDesignPatterns.mediatorpattern;

public abstract class TrafficLight {

    protected String state = "RED";
    protected TrafficMediator mediator;

    public void setMediator(TrafficMediator mediator) {
        this.mediator = mediator;
    }

    public void changeToGreen() {
        this.state = "GREEN";
        mediator.notifyStateChange(this, state);
    }

    public void changeToYellow() {
        this.state = "YELLOW";
        mediator.notifyStateChange(this, state);
    }

    public void changeToRed() {
        this.state = "RED";
        mediator.notifyStateChange(this, state);
    }

    public String getState() {
        return state;
    }

    public abstract String getName();
}
