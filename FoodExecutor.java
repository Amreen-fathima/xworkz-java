class FoodExecutor {

    public static void main(String[] args) {

        boolean isCreated = Food.createFood("Biryani",180.00,"Non-Veg",450, "Meghana Foods"
        );

        if (isCreated) {
            Food.getFoodDetails();
        } else {
            System.out.println("Food not created due to invalid data");
        }
    }
}