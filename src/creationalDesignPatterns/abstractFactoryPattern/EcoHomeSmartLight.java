package creationalDesignPatterns.abstractFactoryPattern;

public class EcoHomeSmartLight implements SmartLight{
    @Override
    public void turnOn() {
        System.out.println("turning on the light using EcoHome");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off the light using EcoHome");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("setting the brightness to the level: " + level);
    }

    @Override
    public void setColor(String color) {
        System.out.println("setting the color of the light to: " + color);
    }
}
