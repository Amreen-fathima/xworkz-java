class Package {

    int packageId;
    String place;
    double price;

    Package(int packageId, String place, double price) {
        this.packageId = packageId;
        this.place = place;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(packageId);
        System.out.println(place);
        System.out.println(price);
    }
}