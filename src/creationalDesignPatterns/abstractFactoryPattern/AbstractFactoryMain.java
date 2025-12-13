package creationalDesignPatterns.abstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        SmartHomeFactory smartHomeFactory;
        smartHomeFactory = new EcoHomeSmartHomeFactory();
        SmartLight light = smartHomeFactory.createSmartLight();
        SmartThermostat thermostat = smartHomeFactory.createSmartThermostat();
        SmartDoorLock lock = smartHomeFactory.createSmartDoorLock();
        light.turnOn();
        light.setBrightness(75);
        light.setColor("warm-white");

        // -------- THERMOSTAT METHODS --------
        thermostat.setTemperature(23);
        thermostat.setMode("auto");

        System.out.println("Current temp: " + thermostat.getCurrentTemperature());


        // -------- DOOR LOCK METHODS --------
        lock.lock();
        lock.setPinCode("3523");

        boolean locked = lock.isLocked();
        System.out.println("Is locked? " + locked);


        // lets say ecohome they wants to add some more functionality then we can
        // create a new class with
    }
}
