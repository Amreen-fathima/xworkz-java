class ZeptoExecutor {

    public static void main(String[] args) {

        String foodName = "Amul Milk";

        double price = Zepto.search(foodName);

        System.out.println("The price of " + foodName + " in Zepto is " + price);

    }

}
