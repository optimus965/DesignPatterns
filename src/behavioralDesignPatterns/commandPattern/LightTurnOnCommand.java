package behavioralDesignPatterns.commandPattern;

public class LightTurnOnCommand implements Command {
    public Light light;
    public LightTurnOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Executing the LightOnCommand");
        this.light.TurnOn();
    }

    @Override
    public void undo() {
        System.out.println("Executing the undo Command in LightTurnOnCommand");
        this.light.TurnOff();

    }
    //    public
}
