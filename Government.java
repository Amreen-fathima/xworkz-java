class Government {

    int governmentId;
    String countryName;
    Policy policy;

    Government(int governmentId, String countryName, Policy policy) {
        this.governmentId = governmentId;
        this.countryName = countryName;
        this.policy = policy;
    }

    void displayDetails() {
        System.out.println(governmentId);
        System.out.println(countryName);
        policy.displayDetails();
    }
}