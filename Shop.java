class Shop {

    int shopId;
    String shopName;
    String category;

    Shop(int shopId, String shopName, String category) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.category = category;
    }

    void displayDetails() {
        System.out.println(shopId);
        System.out.println(shopName);
        System.out.println(category);
    }
}