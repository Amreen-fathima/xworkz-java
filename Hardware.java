class Hardware {

    int hardwareId;
    String hardwareName;
    String brand;

    Hardware(int hardwareId, String hardwareName, String brand) {
        this.hardwareId = hardwareId;
        this.hardwareName = hardwareName;
        this.brand = brand;
    }

    void displayDetails() {
        System.out.println(hardwareId);
        System.out.println(hardwareName);
        System.out.println(brand);
    }
}