class Kitchen {

    static void receiveOrder(String dish) {
        System.out.println("Kitchen received order: " + dish);
        HeadChef.cook(dish);
    }
}