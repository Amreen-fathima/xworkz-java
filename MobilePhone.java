class MobilePhone {

    static boolean isActive;

    static boolean onOrOff() {

        if (!isActive) {
            isActive = true;
            System.out.println("Mobile is turned On...");
        } else {
            isActive = false;
            System.out.println("Mobile is turned Off...");
        }

        return isActive;
    }
}
