public class TestBill {

    public static void main(String[] args) {

        FoodMenu menu = new FoodMenu();
        Cart cart = new Cart();

        FoodItem pizza = menu.findFoodById(1);
        FoodItem burger = menu.findFoodById(2);

        cart.addItem(pizza, 2);
        cart.addItem(burger, 1);

        Bill bill = new Bill(cart);
        bill.displayBill();

        OrderConfirmation confirmation = new OrderConfirmation();
        confirmation.confirmOrder();
    }
}
