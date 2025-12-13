package behavioralDesignPatterns.commandPattern;

public class ThermoStat {
    private int temperature = 20;

    public void setTemperature(int value) {
        System.out.println("Thermostat set to " + value + "°C");
        this.temperature = value;
    }
    public int getTemperature() {
        return this.temperature;
    }
}
