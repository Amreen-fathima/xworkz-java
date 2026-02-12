class Refridgerator {

    static boolean isCooling;

    static boolean onOrOff() {

        if (!isCooling) {
            isCooling = true;
            System.out.println("Refrigerator is turned On...");
        } else {
            isCooling = false;
            System.out.println("Refrigerator is turned Off...");
        }

        return isCooling;
    }
}
