class VVPuram {

    int streetId;
    String location;
    FoodStreet foodStreet;

    VVPuram(int streetId, String location, FoodStreet foodStreet) {
        this.streetId = streetId;
        this.location = location;
        this.foodStreet = foodStreet;
    }

    void displayDetails() {
        System.out.println(streetId);
        System.out.println(location);
        foodStreet.displayDetails();
    }
}