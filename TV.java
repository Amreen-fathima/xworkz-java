class TV {

    static boolean isOn;

    static boolean onOrOff() {

        if (isOn == false) {
            isOn = true;
            System.out.println("TV is turned On...");
        } else {
            isOn = false;
            System.out.println("TV is turned Off...");
        }

        return isOn;
    }
}
