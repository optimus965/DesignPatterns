package behavioralDesignPatterns.visitorpattern;

public class FoodItem implements CartItem {
    public String name;
    double price;
    double weight;
    public FoodItem(String name,double price,double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public  double getWeight() {
        return this.weight;
    }

    @Override
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.FoodItemVisit(this);
    }
}
