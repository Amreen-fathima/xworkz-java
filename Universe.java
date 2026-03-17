class Universe {

    int universeId;
    String universeName;
    Earth earth;

    Universe(int universeId, String universeName, Earth earth) {
        this.universeId = universeId;
        this.universeName = universeName;
        this.earth = earth;
    }

    void displayDetails() {
        System.out.println(universeId);
        System.out.println(universeName);
        earth.displayDetails();
    }
}