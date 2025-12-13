package behavioralDesignPatterns.stateDesignPattern;

public class VendingMachine {
    public int amount;
    public String itemCode;
    public VendingMachineState vendingMachineState;

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
    public void setSelectedAmount(int value) {
        this.amount = value;
    }
    public void setSelectedItem(String itemCode) {
        this.itemCode = itemCode;
    }
    public void selectItem(String itemCode) {
        this.vendingMachineState.selectItem(this,itemCode);
    }
    public void insertCoin(int amount) {
        this.vendingMachineState.insertCoin(this,amount);
    }
    public void dispenseItem() {
        this.vendingMachineState.dispenseItem(this);
    }
    public void reset() {
        this.itemCode = "";
        this.amount = 0;
        this.vendingMachineState = new IdleState();
    }

}
