public class TestCart {

    public static void main(String[] args) {

        FoodMenu menu = new FoodMenu();
        Cart cart = new Cart();

        FoodItem pizza = menu.findFoodById(1);
        FoodItem burger = menu.findFoodById(2);

        cart.addItem(pizza, 2);
        cart.addItem(burger, 1);

        cart.displayCart();

        System.out.println("Adding one more Burger...");
        cart.addItem(burger, 1);

        cart.displayCart();

        System.out.println("Removing Pizza...");
        cart.removeItem(1);

        cart.displayCart();
    }
}