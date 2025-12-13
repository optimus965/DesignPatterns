package behavioralDesignPatterns.stateDesignPattern;

public class IdleState implements  VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine,String item) {
        System.out.println("item has been selected: " + item);
        vendingMachine.setSelectedItem(item);
//        vendingMachine
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,int amount) {
        System.out.println("First select the item");

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Select the item and pay the cash then you can get it");
    }
}
