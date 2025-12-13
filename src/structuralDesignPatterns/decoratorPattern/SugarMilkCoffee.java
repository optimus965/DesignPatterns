package structuralDesignPatterns.decoratorPattern;

public class SugarMilkCoffee implements Coffee{
    public Coffee coffee;
    public SugarMilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public void add() {
        this.coffee.add();
        System.out.println("adding the sugar to coffee");

    }

    @Override
    public void getDescription() {
        this.coffee.getDescription();
        System.out.println("sugar has been added to the sugar");
    }

    @Override
    public int totalCost() {
        int totalCost = 5 + this.coffee.totalCost();
        return totalCost;
    }
}
