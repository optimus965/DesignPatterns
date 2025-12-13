package creationalDesignPatterns.abstractFactoryPattern;

public class SmartTechSmartDoorLock implements SmartDoorLock{
    private boolean isLocked;
    @Override
    public void lock() {
        isLocked = true;
        System.out.println("Locking the door using SmartTech");
    }

    @Override
    public void unlock() {
        isLocked = false;
        System.out.println("Unlocking the door using SmartTech");
    }

    @Override
    public boolean isLocked() {
        System.out.println("the door is locked using smartTech: " + isLocked);
        return isLocked;
    }

    @Override
    public void setPinCode(String pin) {
        System.out.println("setting the pincode using smartTech to: " + pin);
    }
}
