class Tv {

    int tvId;
    String brand;
    Channel channel;

    Tv(int tvId, String brand, Channel channel) {
        this.tvId = tvId;
        this.brand = brand;
        this.channel = channel;
    }

    void displayDetails() {
        System.out.println(tvId);
        System.out.println(brand);
        channel.displayDetails();
    }
}