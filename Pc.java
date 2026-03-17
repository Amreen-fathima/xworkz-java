class Pc {

    int pcId;
    String model;
    Hardware hardware;

    Pc(int pcId, String model, Hardware hardware) {
        this.pcId = pcId;
        this.model = model;
        this.hardware = hardware;
    }

    void displayDetails() {
        System.out.println(pcId);
        System.out.println(model);
        hardware.displayDetails();
    }
}