class OrderSystem {

    static void sendToKitchen(String dish) {
        System.out.println("Order sent to kitchen: " + dish);
        Kitchen.receiveOrder(dish);
    }
}