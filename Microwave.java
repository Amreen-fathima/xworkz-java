class Microwave {

    static boolean isHeating;

    static boolean onOrOff() {

        if (!isHeating) {
            isHeating = true;
            System.out.println("Microwave is turned On...");
        } else {
            isHeating = false;
            System.out.println("Microwave is turned Off...");
        }

        return isHeating;
    }
}
