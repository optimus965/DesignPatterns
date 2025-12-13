package behavioralDesignPatterns.commandPattern;

public class SmartHomeController {
    private final Light light;
    private final ThermoStat thermostat;

    public SmartHomeController(Light light, ThermoStat thermostat) {
        this.light = light;
        this.thermostat = thermostat;
    }

    public void turnOnLight() {
        light.TurnOn();
    }

    public void turnOffLight() {
        light.TurnOff();
    }

    public void setThermostatTemperature(int temperature) {
        thermostat.setTemperature(temperature);
    }
}
