class Fan {

    static boolean isRunning;

    static boolean onOrOff() {

        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Fan is turned On...");
        } else {
            isRunning = false;
            System.out.println("The Fan is turned Off...");
        }

        return isRunning;
    }
}
