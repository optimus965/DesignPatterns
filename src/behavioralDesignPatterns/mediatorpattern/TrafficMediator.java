package behavioralDesignPatterns.mediatorpattern;

public interface TrafficMediator {
    void requestGreen(TrafficLight light);
    void notifyStateChange(TrafficLight light, String newState);
}
