class Profile {

    int profileId;
    String name;
    String designation;

    Profile(int profileId, String name, String designation) {
        this.profileId = profileId;
        this.name = name;
        this.designation = designation;
    }

    void displayDetails() {
        System.out.println(profileId);
        System.out.println(name);
        System.out.println(designation);
    }
}