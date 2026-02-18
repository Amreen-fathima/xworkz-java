class FoodPandaExecutor {

    public static void main(String[] args) {

        String foodName = "Hyderabadi Biryani";

        double price = FoodPanda.search(foodName);

        System.out.println("The price of " + foodName + " in FoodPanda is " + price);

    }

}
