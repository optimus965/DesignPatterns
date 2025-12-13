package behavioralDesignPatterns.stateDesignPattern;

public class HasMoneyState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("item has been selected now you can pay the cash");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Thank you for inserting the coin: " + amount);
        vendingMachine.setSelectedAmount(amount);
        vendingMachine.setVendingMachineState(new DispenseState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("your Item has been selected, but you haven't paid the money");
    }
}
