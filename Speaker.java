class Speaker {

    static boolean isConnected;
    static int currentVolume = 0;
    static int maxVolume = 8;

    static boolean onOrOff() {

        if (!isConnected) {
            isConnected = true;
            System.out.println("The speaker is turned ON...");
        } else {
            isConnected = false;
            System.out.println("The speaker is turned OFF...");
        }

        return isConnected;
    }

    public static void increaseVolume() {

        System.out.println("increaseVolume is invoked...");
        System.out.println("Processing...");

        if (isConnected) {

            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume increased to: " + currentVolume);
            } else {
                System.out.println("You reached maximum volume...");
            }

        } else {
            System.out.println("Please turn ON the speaker first...");
        }
    }

    public static void decreaseVolume() {

        System.out.println("decreaseVolume is invoked...");

        if (isConnected) {

            if (currentVolume > 0) {
                currentVolume--;
                System.out.println("Volume decreased to: " + currentVolume);
            } else {
                System.out.println("You reached minimum volume...");
            }

        } else {
            System.out.println("Please turn ON the speaker first...");
        }
    }

    public static void main(String[] args) {

        onOrOff();       // Turn ON
        increaseVolume();
        increaseVolume();
        decreaseVolume();
        decreaseVolume();
        decreaseVolume();
    }
}
