package behavioralDesignPatterns.commandPattern;

public class CommandMain {
    public static void main(String[] args) {
        //WHAT IS COMMAND PATTERN? (Simple Definition)
        //Command Pattern turns a request (an action) into a separate object.
        //This lets you store it, queue it, retry it, undo it, and execute it later.
//        In other words:
//        ✔ You wrap an operation inside an object
//        ✔ Then pass it around like data
//        ✔ Execute it whenever you want
        // each request is an object and we can pass it and execute it

        Light light = new Light();
        ThermoStat thermostat = new ThermoStat();
        SmartHomeController controller = new SmartHomeController(light, thermostat);

        controller.turnOnLight();
        controller.setThermostatTemperature(22);
        controller.turnOffLight();
    }
}