class Formula1 {

    int raceId;
    String raceLocation;
    Franchise franchise;

    Formula1(int raceId, String raceLocation, Franchise franchise) {
        this.raceId = raceId;
        this.raceLocation = raceLocation;
        this.franchise = franchise;
    }

    void displayDetails() {
        System.out.println(raceId);
        System.out.println(raceLocation);
        franchise.displayDetails();
    }
}