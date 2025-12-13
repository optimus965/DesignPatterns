package creationalDesignPatterns.abstractFactoryPattern;

interface SmartDoorLock {
    void lock();
    void unlock();
    boolean isLocked();
    void setPinCode(String pin);

}
