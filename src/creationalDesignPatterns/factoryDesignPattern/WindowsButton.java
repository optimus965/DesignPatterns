package creationalDesignPatterns.factoryDesignPattern;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering the windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Binding the event in windows");
    }
}
