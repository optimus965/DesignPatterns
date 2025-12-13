package structuralDesignPatterns.decoratorPattern;

public class IceCreamCoffee implements Coffee{
    public Coffee coffee;
    public IceCreamCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public void add() {
        this.coffee.add();
        System.out.println("adding ice cream to the coffee");
    }

    @Override
    public void getDescription() {
        this.coffee.getDescription();
        System.out.println("ice cream has been added to it");
    }

    @Override
    public int totalCost() {
        int totalCost  = 30 + this.coffee.totalCost();
        return totalCost;
    }
}
