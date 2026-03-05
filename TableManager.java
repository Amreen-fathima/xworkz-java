class TableManager {

    static void seatGuest(String guestName) {
        System.out.println("Guest seated: " + guestName);
        Waiter.takeOrder(guestName, "Pasta");
    }
}