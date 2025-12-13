package creationalDesignPatterns.abstractFactoryPattern;

public class EcoHomeSmartDoorLock implements SmartDoorLock{
    private boolean isDoorLocked = false;
    @Override
    public void lock() {
        isDoorLocked = true;
        System.out.println("Locking the door using EcoHomeSmartDoorLock");
    }

    @Override
    public void unlock() {
        isDoorLocked = false;
        System.out.println("unLocking the door using EcoHomeSmartDoorLock");
    }

    @Override
    public boolean isLocked() {
        System.out.println("door is locked: " + isDoorLocked);
        return isDoorLocked;
    }

    @Override
    public void setPinCode(String pin) {
        System.out.println("setting the pincode for door lock to: " + pin);
    }
}
