class Printer {

    static boolean isPrinting;

    static boolean onOrOff() {

        if (!isPrinting) {
            isPrinting = true;
            System.out.println("Printer is turned On...");
        } else {
            isPrinting = false;
            System.out.println("Printer is turned Off...");
        }

        return isPrinting;
    }
}
