class Mall {

    int mallId;
    String mallName;
    Shop shop;

    Mall(int mallId, String mallName, Shop shop) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.shop = shop;
    }

    void displayDetails() {
        System.out.println(mallId);
        System.out.println(mallName);
        shop.displayDetails();
    }
}