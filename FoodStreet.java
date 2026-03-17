class FoodStreet {

    int foodId;
    String foodName;
    double price;

    FoodStreet(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(foodId);
        System.out.println(foodName);
        System.out.println(price);
    }
}