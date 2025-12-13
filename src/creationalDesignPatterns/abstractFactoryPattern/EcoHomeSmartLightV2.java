package creationalDesignPatterns.abstractFactoryPattern;

public class EcoHomeSmartLightV2 extends EcoHomeSmartLight{
    boolean set  = false;
    public void setNightGlow() {
        if(!set) {
            System.out.println("Setting the glow of the room to night");
            set = true;
        }
        else {
            System.out.println("turning off the glow of the room to normal");
            set = false;
        }
    }
    public void turnOnRGB() {
        System.out.println("Turning on the RGB lights");
    }
}
