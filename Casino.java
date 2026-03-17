class Casino {

    int casinoId;
    String casinoName;
    String location;

    Casino(int casinoId, String casinoName, String location) {
        this.casinoId = casinoId;
        this.casinoName = casinoName;
        this.location = location;
    }

    void displayDetails() {
        System.out.println(casinoId);
        System.out.println(casinoName);
        System.out.println(location);
    }
}