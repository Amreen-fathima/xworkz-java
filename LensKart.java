class LensKart {

    int storeId;
    String storeLocation;
    Frame frame;

    LensKart(int storeId, String storeLocation, Frame frame) {
        this.storeId = storeId;
        this.storeLocation = storeLocation;
        this.frame = frame;
    }

    void displayDetails() {
        System.out.println(storeId);
        System.out.println(storeLocation);
        frame.displayDetails();
    }
}