package behavioralDesignPatterns.stateDesignPattern;

public interface VendingMachineState {
    public void selectItem(VendingMachine vendingMachine,String item);
    public void insertCoin(VendingMachine vendingMachine,int amount);
    public void dispenseItem(VendingMachine vendingMachine);
}
