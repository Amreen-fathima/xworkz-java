class Groww {

    int growwId;
    String userName;
    Stock stock;

    Groww(int growwId, String userName, Stock stock) {
        this.growwId = growwId;
        this.userName = userName;
        this.stock = stock;
    }

    void displayDetails() {
        System.out.println(growwId);
        System.out.println(userName);
        stock.displayDetails();
    }
}