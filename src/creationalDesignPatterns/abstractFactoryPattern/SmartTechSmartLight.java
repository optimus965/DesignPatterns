package creationalDesignPatterns.abstractFactoryPattern;

public class SmartTechSmartLight implements SmartLight{
    @Override
    public void turnOn() {
        System.out.println("turning on the lights using SmartTech");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off the lights using SmartTech");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("setting the brightness using SmartTech to: " + level);
    }

    @Override
    public void setColor(String color) {
        System.out.println("setting the color using smartTech to: " + color);
    }
}
