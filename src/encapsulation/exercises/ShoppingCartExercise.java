package encapsulation.exercises;

public class ShoppingCartExercise {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Chips", 1.40);
        shoppingCart.addItem("Chicken", 4.20);
        shoppingCart.addItem("Soda", 1.20);
        shoppingCart.addItem("Pen", 0.99);
        shoppingCart.removeItem("Pen", 0.99);
        shoppingCart.removeItem("Void", 99999);
        System.out.println("Total: " + shoppingCart.getTotalPrice());
        System.out.println("Applying 21% discount");
        shoppingCart.applyDiscount(21);
        System.out.println("Total: " + shoppingCart.getTotalPrice());
    }
}
