import java.util.ArrayList;

public class Cart {

    private ArrayList<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(FoodItem foodItem, int quantity) {

        for (CartItem item : cartItems) {

            if (item.getFoodItem().getFoodId()
                    == foodItem.getFoodId()) {

                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }

        cartItems.add(new CartItem(foodItem, quantity));
    }

    public void removeItem(int foodId) {

        for (int i = 0; i < cartItems.size(); i++) {

            if (cartItems.get(i).getFoodItem().getFoodId()
                    == foodId) {

                cartItems.remove(i);
                System.out.println("Item removed successfully.");
                return;
            }
        }

        System.out.println("Item not found in cart.");
    }

    public void displayCart() {

        System.out.println("========== YOUR CART ==========");
        System.out.println("FOOD ITEM    QUANTITY    SUBTOTAL");

        for (CartItem item : cartItems) {
            item.displayCartItem();
        }

        System.out.println("==============================");
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}