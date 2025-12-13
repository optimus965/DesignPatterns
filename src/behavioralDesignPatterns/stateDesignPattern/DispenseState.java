package behavioralDesignPatterns.stateDesignPattern;

public class DispenseState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("please wait let the item be dispensed and then you can try selecting the item");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("You already paid the money please wait....");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item is being dispensed: " + vendingMachine.itemCode);
        vendingMachine.setVendingMachineState(new IdleState());
    }
}
