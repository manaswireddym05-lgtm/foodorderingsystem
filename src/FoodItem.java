public class FoodItem {

    private int foodId;
    private String foodName;
    private int price;

    public FoodItem(int foodId, String foodName, int price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public void displayFood() {
        System.out.println(foodId + "    "
                + foodName + "    Rs." + price);
    }
}