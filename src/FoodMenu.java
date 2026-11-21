import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodMenu {

    private ArrayList<FoodItem> foodItems;

    public FoodMenu() {

        foodItems = new ArrayList<>();

        foodItems.add(new FoodItem(1, "Pizza", 150));
        foodItems.add(new FoodItem(2, "Burger", 100));
        foodItems.add(new FoodItem(3, "Sandwich", 80));
        foodItems.add(new FoodItem(4, "Biryani", 180));
        foodItems.add(new FoodItem(5, "French Fries", 90));
        foodItems.add(new FoodItem(6, "Ice Cream", 60));
    }

    public void displayMenu() {

        System.out.println("================================");
        System.out.println("       FOOD ORDERING SYSTEM");
        System.out.println("================================");

        System.out.println("ID    FOOD ITEM       PRICE");
        System.out.println("--------------------------------");

        for (FoodItem item : foodItems) {
            item.displayFood();
        }

        System.out.println("--------------------------------");
    }

    public List<FoodItem> getAllItems() {
        return Collections.unmodifiableList(foodItems);
    }

    public FoodItem findFoodById(int id) {

        for (FoodItem item : foodItems) {

            if (item.getFoodId() == id) {
                return item;
            }
        }

        return null;
    }
}