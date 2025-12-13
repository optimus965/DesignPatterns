package creationalDesignPatterns.abstractFactoryPattern;

public class EcoHomeSmartThermostat implements SmartThermostat {
    double temp;
    public EcoHomeSmartThermostat() {
        temp = 0;

    }
    @Override
    public void setTemperature(double temp) {
        this.temp = temp;
        System.out.println("setting the temperature to: " + temp);
    }

    @Override
    public double getCurrentTemperature() {
        System.out.println("the current temperature is: " + temp);
        return temp;
    }

    @Override
    public void setMode(String mode) {
        System.out.println("setting the room temperature to the " + mode + "mode");
    }
}
