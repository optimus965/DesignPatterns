package behavioralDesignPatterns.visitorpattern;

public class ClothItem implements CartItem {
    String brand;
    double price;
    String size;
    public ClothItem(String brand,double price,String size) {
        this.brand = brand;
        this.price = price;
        this.size =size;
    }
    String getBrand() {
        return this.brand;
    }
    double getPrice() {
        return this.price;
    }
    String getSize() {
        return this.size;
    }

    @Override
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.ClothItemVisit(this);
    }
}
