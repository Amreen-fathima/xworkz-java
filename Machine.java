class Machine {

    int machineId;
    String machineName;
    String type;

    Machine(int machineId, String machineName, String type) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.type = type;
    }

    void displayDetails() {
        System.out.println(machineId);
        System.out.println(machineName);
        System.out.println(type);
    }
}