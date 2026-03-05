class Waiter {

    static void takeOrder(String guestName, String dish) {
        System.out.println("Order taken from " + guestName + " for " + dish);
        OrderSystem.sendToKitchen(dish);
		System.out.println("Order ended");
    }
}