package behavioralDesignPatterns.visitorpattern;

public class TaxVisitor  implements ItemVisitor{
    @Override
    public void FoodItemVisit(FoodItem foodItem) {
        System.out.println("Calculating the TAX for the given foodItem: " + foodItem.name);
        System.out.println("for food category there will be 2% GST , the amount to be paid is: " + foodItem.price + (foodItem.price/100)*2);
    }

    @Override
    public void ClothItemVisit(ClothItem clothItem) {
        System.out.println("Calculating the TAX for the given foodItem: " + clothItem.brand);
        System.out.println("for Clothing category there will be 4% TAX, the amount to be paid is: " + clothItem.price + (clothItem.price/100)*4);
    }

    @Override
    public void ElectronicItemVisit(ElectronicItem electronicItem) {
        System.out.println("Calculating the TAX for the given foodItem: " + electronicItem.name);
        System.out.println("for Electronic category there will be 3% Discount, the amount to be paid is: " + electronicItem.price +  (electronicItem.price/100)*3);
    }
}
