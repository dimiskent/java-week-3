package encapsulation.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create a class ShoppingCart with:
      - private field items (ArrayList of Strings).
      - private field totalPrice (double).

 2. Add methods:
      - addItem(String item, double price) → adds item and increases total price.
      - removeItem(String item, double price) → removes item if it exists and decreases total price.
      - getTotalPrice() → returns current total.
      - getItems() → returns the list of items.

 3. Add validation:
      - No negative prices allowed.
      - If you try to remove an item that doesn't exist, print a message.

 4. Challenge:
      - Add a method applyDiscount(double percentage) → reduces total price by that percentage,
        but only if percentage is between 0 and 50.
*/

public class ShoppingCart
{
    private List<String> items;
    private double totalPrice = 0;
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void addItem(String item, double price) {
        if (isPriceSafe(price)) {
            items.add(item);
            totalPrice += price;
        } else System.out.println("Price must be positive");
    }
    public void removeItem(String item, double price) {
        int index = items.indexOf(item);
        if(index < 0) System.out.println("Item not found");
        else if (!isPriceSafe(price)) System.out.println("Price must be positive");
        else {
            totalPrice -= price;
            items.remove(item);
        }
    }
    public boolean isPriceSafe(double price) {
        return price > 0;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public List<String> getItems() {
        return items;
    }
    public void applyDiscount(double discount) {
        if(discount >= 0 && discount <= 50) {
            double remove = (discount / 100) * this.totalPrice;
            totalPrice -= remove;
        }
    }
}
