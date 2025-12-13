package creationalDesignPatterns.abstractFactoryPattern;

public class EcoHomeSmartHomeFactory implements SmartHomeFactory{
    @Override
    public SmartLight createSmartLight() {
        // here we can customize like only specific users only can access this feature
        // then we can check whether the user is a premium one or not
        // based on that we will give v2 or v1
        // this smartLightV2 option is specific to ecoHome and this is how we can extend this one
        return new EcoHomeSmartLightV2();
    }

    @Override
    public SmartThermostat createSmartThermostat() {
        return new EcoHomeSmartThermostat();
    }

    @Override
    public SmartDoorLock createSmartDoorLock() {
        return new EcoHomeSmartDoorLock();
    }
}
