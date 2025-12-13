package structuralDesignPatterns.decoratorPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new MilkCoffee();
        coffee = new IceCreamCoffee(new SugarMilkCoffee(coffee));
        coffee.add();
        coffee.getDescription();
        System.out.println(coffee.totalCost());
        Coffee coffee1 = new MilkCoffee();
        coffee1 = new SugarMilkCoffee(coffee1);
        coffee1.add();
        coffee1.getDescription();
        System.out.println(coffee1.totalCost());
    }
}
