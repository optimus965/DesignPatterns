package behavioralDesignPatterns.visitorpattern;

public interface ItemVisitor {
    public void FoodItemVisit(FoodItem foodItem);
    public void ClothItemVisit(ClothItem clothItem);
    public void ElectronicItemVisit(ElectronicItem electronicItem);

}
