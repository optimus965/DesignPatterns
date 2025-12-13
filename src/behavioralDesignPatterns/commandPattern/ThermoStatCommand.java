package behavioralDesignPatterns.commandPattern;

public class ThermoStatCommand implements Command {
    public ThermoStat thermoStat;
    int previousTemperature = 0;
    int newTemperature = 0;
    public ThermoStatCommand(ThermoStat thermoStat,int newTemperature) {
        this.thermoStat = thermoStat;
        this.newTemperature = newTemperature;
    }
    @Override
    public void execute() {
        previousTemperature = thermoStat.getTemperature();
        thermoStat.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        int value = thermoStat.getTemperature();
        thermoStat.setTemperature(previousTemperature);
        previousTemperature = value;
    }
}
