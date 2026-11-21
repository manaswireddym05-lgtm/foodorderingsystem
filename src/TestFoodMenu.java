public class TestFoodMenu {

    public static void main(String[] args) {

        FoodMenu menu = new FoodMenu();

        menu.displayMenu();

        FoodItem item = menu.findFoodById(2);

        if (item != null) {
            System.out.println("Selected Food:");
            item.displayFood();
        } else {
            System.out.println("Food item not found");
        }
    }
}