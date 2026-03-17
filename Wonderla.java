class Wonderla {

    int parkId;
    String parkLocation;
    LazyPool lazyPool;

    Wonderla(int parkId, String parkLocation, LazyPool lazyPool) {
        this.parkId = parkId;
        this.parkLocation = parkLocation;
        this.lazyPool = lazyPool;
    }

    void displayDetails() {
        System.out.println(parkId);
        System.out.println(parkLocation);
        lazyPool.displayDetails();
    }
}