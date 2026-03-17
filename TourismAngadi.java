class TourismAngadi {

    int tourismId;
    String agencyName;
    Package pkg;

    TourismAngadi(int tourismId, String agencyName, Package pkg) {
        this.tourismId = tourismId;
        this.agencyName = agencyName;
        this.pkg = pkg;
    }

    void displayDetails() {
        System.out.println(tourismId);
        System.out.println(agencyName);
        pkg.displayDetails();
    }
}