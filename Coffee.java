class Coffee {

    int coffeeId;
    String coffeeName;
    double price;

    Coffee(int coffeeId, String coffeeName, double price) {
        this.coffeeId = coffeeId;
        this.coffeeName = coffeeName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(coffeeId);
        System.out.println(coffeeName);
        System.out.println(price);
    }
}