package behavioralDesignPatterns.stateDesignPattern;

public class StateMain {
    public static void main(String[] args) {
//     The State Design Pattern is a behavioral design pattern that lets an object change
//     its behavior when its internal state changes, as if it were switching to a different class
//     at runtime.
        VendingMachine vm = new VendingMachine();
        vm.setVendingMachineState(new IdleState());
        vm.dispenseItem();
        vm.insertCoin(1); // Invalid in IdleState
        vm.selectItem("A1");
        vm.insertCoin(1);
        vm.dispenseItem();

        System.out.println("\n--- Second Transaction ---");
        vm.selectItem("B2");
        vm.insertCoin(2);
        vm.dispenseItem();
    }
}
