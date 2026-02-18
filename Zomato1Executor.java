class Zomato1Executor {

   public static void main(String[] args) {

      String foodName = "Burger";   

      double price = Zomato1.search(foodName);

      System.out.println("The price of " + foodName + " in Zomato is " + price);

   }

}
