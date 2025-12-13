package creationalDesignPatterns.abstractFactoryPattern;
//EcoHome may send REST request
//SmartTech may use MQTT protocol internally
public interface SmartThermostat {
    void setTemperature(double temp);
    double getCurrentTemperature();
    void setMode(String mode);
}
