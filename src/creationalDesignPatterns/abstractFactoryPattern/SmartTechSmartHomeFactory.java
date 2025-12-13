package creationalDesignPatterns.abstractFactoryPattern;

public class SmartTechSmartHomeFactory implements SmartHomeFactory{
    @Override
    public SmartLight createSmartLight() {
        return new SmartTechSmartLight();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new SmartTechSmartThermostat();
    }

    @Override
    public SmartDoorLock createSmartDoorLock() {
        return new SmartTechSmartDoorLock();
    }
}
