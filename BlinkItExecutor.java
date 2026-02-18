class BlinkItExecutor {

    public static void main(String[] args) {

        String foodName = "Detergent Powder 1kg";

        double price = BlinkIt.search(foodName);

        System.out.println("The price of " + foodName + " in BlinkIt is " + price);

    }

}
