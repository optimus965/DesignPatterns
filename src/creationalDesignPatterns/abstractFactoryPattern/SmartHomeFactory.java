package creationalDesignPatterns.abstractFactoryPattern;

interface SmartHomeFactory {
    public SmartLight createSmartLight();
    public SmartThermostat createSmartThermostat();
    public SmartDoorLock createSmartDoorLock();

}
