package behavioralDesignPatterns.visitorpattern;

public class ElectronicItem implements CartItem {
    String name;
    double price;
    int warrantyYears;
    public ElectronicItem(String name,double price,int warrantyYears) {
        this.name = name;
        this.price = price;
        this.warrantyYears = warrantyYears;
    }
    String getName() {
        return this.name;
    }
    double getPrice() {
        return this.price;
    }
    int getWarrantyYears() {
        return this.warrantyYears;
    }


    @Override
    public void accept(ItemVisitor itemVisitor) {
        itemVisitor.ElectronicItemVisit(this);
    }
}
