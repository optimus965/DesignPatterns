package creationalDesignPatterns.abstractFactoryPattern;

public class SmartTechSmartThermostat implements SmartThermostat{
    private double temp;
    public SmartTechSmartThermostat() {
        temp = 0;
    }
    @Override
    public void setTemperature(double temp) {
        this.temp = temp;
        System.out.println("setting the temperature using smartTech to: " + temp);
    }

    @Override
    public double getCurrentTemperature() {
        System.out.println("getting the temperature of the room" + temp);
        return temp;
    }

    @Override
    public void setMode(String mode) {
        System.out.println("setting the room temperature to: " + mode);
    }
}
