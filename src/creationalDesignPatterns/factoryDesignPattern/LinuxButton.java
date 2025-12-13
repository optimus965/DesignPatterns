package creationalDesignPatterns.factoryDesignPattern;

public class LinuxButton implements  Button{
    @Override
    public void render() {
        System.out.println("Rendering the linux Button");
    }

    @Override
    public void onClick() {
        System.out.println("Binding the event in Linux");
    }
}
