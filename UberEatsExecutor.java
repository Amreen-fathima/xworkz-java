class UberEatsExecutor {

    public static void main(String[] args) {

        String foodName = "Pasta Alfredo";

        double price = UberEats.search(foodName);

        System.out.println("The price of " + foodName + " in UberEats is " + price);

    }

}