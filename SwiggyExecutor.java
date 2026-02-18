class SwiggyExecutor {

   public static void main(String[] args) {

      String foodName = "Masala Dosa";

      double price = Swiggy.search(foodName);

      System.out.println("The price of " + foodName + " in Swiggy is " + price);

   }

}
