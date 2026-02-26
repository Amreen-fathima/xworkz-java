class PsFive {

    static String model;
    static String color;
    static double price;
    static int storageGB;
    static boolean wirelessController;
    static String processor;
    static int warrantyYears;
    static String edition;
    static boolean vrSupport;
    static int noOfGames;

    public static boolean createPsFive(String mName, String cName,double p, int storage,boolean wireless, String proc,int warranty, String ed,boolean vr, int games) {

        boolean isModelValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isStorageValid = false;
        boolean isProcessorValid = false;
        boolean isWarrantyValid = false;
        boolean isEditionValid = false;
        boolean isGamesValid = false;

        if (mName != null && !mName.isEmpty()) {
            PsFive.model = mName;
            isModelValid = true;
        } else {
            System.out.println("Model is Invalid");
        }

        if (cName != null && !cName.isEmpty()) {
            PsFive.color = cName;
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (p > 0) {
            PsFive.price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (storage > 0) {
            PsFive.storageGB = storage;
            isStorageValid = true;
        } else {
            System.out.println("Storage is Invalid");
        }

        PsFive.wirelessController = wireless;

        if (proc != null && !proc.isEmpty()) {
            PsFive.processor = proc;
            isProcessorValid = true;
        } else {
            System.out.println("Processor is Invalid");
        }

        if (warranty > 0) {
            PsFive.warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is Invalid");
        }

        if (ed != null && !ed.isEmpty()) {
            PsFive.edition = ed;
            isEditionValid = true;
        } else {
            System.out.println("Edition is Invalid");
        }

        PsFive.vrSupport = vr;

        if (games >= 0) {
            PsFive.noOfGames = games;
            isGamesValid = true;
        } else {
            System.out.println("Number of Games is Invalid");
        }

        if (isModelValid && isColorValid && isPriceValid &&
            isStorageValid && isProcessorValid &&
            isWarrantyValid && isEditionValid &&
            isGamesValid) {

            System.out.println("PS Five Created Successfully");
            return true;
        }

        return false;
    }

    public static void getPsFiveDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storageGB + "GB");
        System.out.println("Wireless Controller: " + wirelessController);
        System.out.println("Processor: " + processor);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Edition: " + edition);
        System.out.println("VR Support: " + vrSupport);
        System.out.println("Number of Games: " + noOfGames);
    }
}