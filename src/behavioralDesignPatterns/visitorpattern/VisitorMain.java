package behavioralDesignPatterns.visitorpattern;

import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        // Definition: The Visitor Design Pattern is a behavioral pattern that lets
        // you add new operations to existing object structures without modifying their classes.
        CartItem food = new FoodItem("Rice Bag", 500, 5);
        CartItem laptop = new ElectronicItem("Laptop", 60000, 2);
        CartItem shirt = new ClothItem("Peter England", 1500, "L");

        // Put items in a list
        List<CartItem> cartItems = List.of(food, laptop, shirt);

        // Create visitors
        DiscountVisitor discountVisitor = new DiscountVisitor();
        TaxVisitor taxVisitor = new TaxVisitor();

        // Apply visitors to each item
        for (CartItem item : cartItems) {
            item.accept(discountVisitor);
            item.accept(taxVisitor);
        }
    }
}
