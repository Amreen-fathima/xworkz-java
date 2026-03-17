class Diamond {

    int diamondId;
    String diamondName;
    double weight;

    Diamond(int diamondId, String diamondName, double weight) {
        this.diamondId = diamondId;
        this.diamondName = diamondName;
        this.weight = weight;
    }

    void displayDetails() {
        System.out.println(diamondId);
        System.out.println(diamondName);
        System.out.println(weight);
    }
}