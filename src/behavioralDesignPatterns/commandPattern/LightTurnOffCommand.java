package behavioralDesignPatterns.commandPattern;

public class LightTurnOffCommand implements Command {
    public Light light;
    public LightTurnOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Executing the LightOffCommand");
        this.light.TurnOff();
    }

    @Override
    public void undo() {
        System.out.println("Executing the undo Command in LightTurnOffCommand");
        this.light.TurnOn();
    }
}
