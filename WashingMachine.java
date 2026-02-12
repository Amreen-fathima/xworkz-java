class WashingMachine {

    static boolean isOperating;

    static boolean onOrOff() {

        if (!isOperating) {
            isOperating = true;
            System.out.println("Washing Machine is turned On...");
        } else {
            isOperating = false;
            System.out.println("Washing Machine is turned Off...");
        }

        return isOperating;
    }
}
