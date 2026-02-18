class ElectronicDevice {

    static boolean isOn = false;
    static int currentVolume = 0;
    static int maxVolume = 10;

    static void power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Device is turned ON");
        } else {
            isOn = false;
            System.out.println("Device is turned OFF");
        }
    }

    static void increaseVolume() {
        if (isOn) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume increased to: " + currentVolume);
            } else {
                System.out.println("Maximum volume reached");
            }
        } else {
            System.out.println("Please turn ON the device first");
        }
    }

    static void decreaseVolume() {
        if (isOn) {
            if (currentVolume > 0) {
                currentVolume--;
                System.out.println("Volume decreased to: " + currentVolume);
            } else {
                System.out.println("Minimum volume reached");
            }
        } else {
            System.out.println("Please turn ON the device first");
        }
    }
}
