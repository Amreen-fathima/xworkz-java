class Earth {

    int planetId;
    String planetName;
    double radius;

    Earth(int planetId, String planetName, double radius) {
        this.planetId = planetId;
        this.planetName = planetName;
        this.radius = radius;
    }

    void displayDetails() {
        System.out.println(planetId);
        System.out.println(planetName);
        System.out.println(radius);
    }
}