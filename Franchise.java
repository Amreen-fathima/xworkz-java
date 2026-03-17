class Franchise {

    int franchiseId;
    String franchiseName;
    String country;

    Franchise(int franchiseId, String franchiseName, String country) {
        this.franchiseId = franchiseId;
        this.franchiseName = franchiseName;
        this.country = country;
    }

    void displayDetails() {
        System.out.println(franchiseId);
        System.out.println(franchiseName);
        System.out.println(country);
    }
}