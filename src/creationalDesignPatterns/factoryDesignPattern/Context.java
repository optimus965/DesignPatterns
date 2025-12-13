package creationalDesignPatterns.factoryDesignPattern;

abstract public class Context {

    abstract public Button createButton();
    public void render() {
        Button button = createButton();
        button.onClick();
        button.render();
    }
}
