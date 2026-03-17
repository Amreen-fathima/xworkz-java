class Factory {

    int factoryId;
    String factoryName;
    Machine machine;

    Factory(int factoryId, String factoryName, Machine machine) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.machine = machine;
    }

    void displayDetails() {
        System.out.println(factoryId);
        System.out.println(factoryName);
        machine.displayDetails();
    }
}