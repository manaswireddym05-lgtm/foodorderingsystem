public class Bill {

    private Cart cart;

    public Bill(Cart cart) {
        this.cart = cart;
    }

    public int calculateTotal() {

        int total = 0;

        for (CartItem item : cart.getCartItems()) {
            total = total + item.getSubtotal();
        }

        return total;
    }

    public void displayBill() {

        System.out.println("========== BILL ==========");

        for (CartItem item : cart.getCartItems()) {
            item.displayCartItem();
        }

        System.out.println("-------------------------");
        System.out.println("Total Amount: Rs." + calculateTotal());
        System.out.println("=========================");
    }
}