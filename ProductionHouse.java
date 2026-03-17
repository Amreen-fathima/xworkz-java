class ProductionHouse {

    int houseId;
    String houseName;
    Movie movie;

    ProductionHouse(int houseId, String houseName, Movie movie) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.movie = movie;
    }

    void displayDetails() {
        System.out.println(houseId);
        System.out.println(houseName);
        movie.displayDetails();
    }
}