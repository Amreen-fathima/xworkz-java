class Museum {

    int museumId;
    String museumName;
    Diamond diamond;

    Museum(int museumId, String museumName, Diamond diamond) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.diamond = diamond;
    }

    void displayDetails() {
        System.out.println(museumId);
        System.out.println(museumName);
        diamond.displayDetails();
    }
}