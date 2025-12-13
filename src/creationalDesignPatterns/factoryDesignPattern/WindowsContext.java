package creationalDesignPatterns.factoryDesignPattern;

public class WindowsContext extends Context{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
