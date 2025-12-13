package behavioralDesignPatterns.mediatorpattern;

public class TrafficController implements TrafficMediator {

    private TrafficLight north;
    private TrafficLight south;
    private TrafficLight east;
    private TrafficLight west;

    public void registerNorth(TrafficLightNorth light) {
        this.north = light;
    }

    public void registerSouth(TrafficLightSouth light) {
        this.south = light;
    }

    public void registerEast(TrafficLightEast light) {
        this.east = light;
    }

    public void registerWest(TrafficLightWest light) {
        this.west = light;
    }

    @Override
    public void requestGreen(TrafficLight light) {
        System.out.println(light.getName() + " requests GREEN.");

        // Allow only opposite directions at a time:
        // North <-> South  OR  East <-> West

        if (light == north || light == south) {
            east.changeToRed();
            west.changeToRed();
            light.changeToGreen();
        } else {
            north.changeToRed();
            south.changeToRed();
            light.changeToGreen();
        }
    }

    @Override
    public void notifyStateChange(TrafficLight light, String newState) {
        System.out.println(light.getName() + " changed to: " + newState);
    }
}
