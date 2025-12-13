package behavioralDesignPatterns.stateDesignPattern;

public class OutOfStock implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Currently items are out of Stock Please come Again Later");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Currently items are out of Stock Please come Again Later");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Currently items are out of Stock Please come Again Later");
    }
}
