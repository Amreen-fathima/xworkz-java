class LinkedIn {

    int linkedinId;
    String company;
    Profile profile;

    LinkedIn(int linkedinId, String company, Profile profile) {
        this.linkedinId = linkedinId;
        this.company = company;
        this.profile = profile;
    }

    void displayDetails() {
        System.out.println(linkedinId);
        System.out.println(company);
        profile.displayDetails();
    }
}