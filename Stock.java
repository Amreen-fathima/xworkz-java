class Stock {

    int stockId;
    String stockName;
    double price;

    Stock(int stockId, String stockName, double price) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(stockId);
        System.out.println(stockName);
        System.out.println(price);
    }
}