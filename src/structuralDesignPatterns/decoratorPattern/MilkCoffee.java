package structuralDesignPatterns.decoratorPattern;

public class MilkCoffee implements Coffee{
    @Override
    public void add() {
        System.out.println("adding the Milk to the Coffee");
    }

    @Override
    public void getDescription() {
        System.out.println("Milk has been added to it");
    }

    @Override
    public int totalCost() {
        return 10;
    }
}
