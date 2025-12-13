package behavioralDesignPatterns.mediatorpattern;

public class TrafficMediatorMain {

    public static void main(String[] args) {
//        Mediator Pattern centralizes communication between multiple objects so they don’t talk to each other directly.
//        Instead, they talk only through a mediator, which controls and coordinates their interactions.

//        ✔ Objects stop calling each other → they call the mediator
//✔ Mediator decides how they should interact
//✔ Removes complex object-to-object dependencies

        TrafficController controller = new TrafficController();
        TrafficLightNorth north = new TrafficLightNorth();
        TrafficLightSouth south = new TrafficLightSouth();
        TrafficLightEast east = new TrafficLightEast();
        TrafficLightWest west = new TrafficLightWest();

        // Set mediator
        north.setMediator(controller);
        south.setMediator(controller);
        east.setMediator(controller);
        west.setMediator(controller);

        // Register all lights
        controller.registerNorth(north);
        controller.registerSouth(south);
        controller.registerEast(east);
        controller.registerWest(west);

        // Simulation
        System.out.println("\n--- TRAFFIC SIMULATION START ---\n");

        controller.requestGreen(north); // North requests green
        controller.requestGreen(east);  // East requests green
        controller.requestGreen(south); // South requests green
        controller.requestGreen(west);  // West requests green

        System.out.println("\n--- SIMULATION END ---");
    }
}
