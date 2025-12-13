package creationalDesignPatterns.factoryDesignPattern;

public class LinuxContext extends Context{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
