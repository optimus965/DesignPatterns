package behavioralDesignPatterns.visitorpattern;

public class DiscountVisitor implements ItemVisitor{
    @Override
    public void FoodItemVisit(FoodItem foodItem) {
        System.out.println("Calculating the discount for the given foodItem: " + foodItem.name);
        System.out.println("for food category there will be 20% Discount, the amount to be paid is: " + (foodItem.price - (foodItem.price/100)*20));
    }

    @Override
    public void ClothItemVisit(ClothItem clothItem) {
        System.out.println("Calculating the discount for the given foodItem: " + clothItem.brand);
        System.out.println("for Clothing category there will be 40% Discount, the amount to be paid is: " + (clothItem.price -  (clothItem.price/100)*40));
    }

    @Override
    public void ElectronicItemVisit(ElectronicItem electronicItem) {
        System.out.println("Calculating the discount for the given foodItem: " + electronicItem.name);
        System.out.println("for Electronic category there will be 30% Discount, the amount to be paid is: " + (electronicItem.price - (electronicItem.price/100)*30));
    }
}
