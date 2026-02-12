class AC {

    static boolean cooling;

    static boolean onOrOff() {

        if (!cooling) {
            cooling = true;
            System.out.println("AC is turned On...");
        } else {
            cooling = false;
            System.out.println("AC is turned Off...");
        }

        return cooling;
    }
}
