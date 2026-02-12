class Laptop {

    static boolean powerStatus;

    static boolean onOrOff() {

        if (!powerStatus) {
            powerStatus = true;
            System.out.println("Laptop is turned On...");
        } else {
            powerStatus = false;
            System.out.println("Laptop is turned Off...");
        }

        return powerStatus;
    }
}
