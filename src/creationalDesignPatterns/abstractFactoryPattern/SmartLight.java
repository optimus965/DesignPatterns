package creationalDesignPatterns.abstractFactoryPattern;

public interface SmartLight {
    void turnOn();
    void turnOff();
    void setBrightness(int level);
    void setColor(String color);

}
