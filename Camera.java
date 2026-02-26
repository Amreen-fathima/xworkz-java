class Camera {

    static String brand;
    static String model;
    static int megapixel;
    static int zoom;
    static boolean wifi;
    static boolean bluetooth;
    static int batteryCapacity;
    static double price;
    static String color;
    static int warrantyYears;

    public static boolean createCamera(String bName, String mName,int mp, int z,boolean w, boolean bt,int battery, double p,String cName, int warranty) {

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isMegapixelValid = false;
        boolean isZoomValid = false;
        boolean isBatteryValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;

        if (bName != null && !bName.isEmpty()) {
            Camera.brand = bName;
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (mName != null && !mName.isEmpty()) {
            Camera.model = mName;
            isModelValid = true;
        } else {
            System.out.println("Model is Invalid");
        }

        if (mp > 0) {
            Camera.megapixel = mp;
            isMegapixelValid = true;
        } else {
            System.out.println("Megapixel is Invalid");
        }

        if (z > 0) {
            Camera.zoom = z;
            isZoomValid = true;
        } else {
            System.out.println("Zoom is Invalid");
        }

        Camera.wifi = w;
        Camera.bluetooth = bt;

        if (battery > 0) {
            Camera.batteryCapacity = battery;
            isBatteryValid = true;
        } else {
            System.out.println("Battery Capacity is Invalid");
        }

        if (p > 0) {
            Camera.price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (cName != null && !cName.isEmpty()) {
            Camera.color = cName;
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (warranty > 0) {
            Camera.warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is Invalid");
        }

        if (isBrandValid && isModelValid && isMegapixelValid &&
            isZoomValid && isBatteryValid && isPriceValid &&
            isColorValid && isWarrantyValid) {

            System.out.println("Camera Created Successfully");
            return true;
        }

        return false;
    }

    public static void getCameraDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Zoom: " + zoom);
        System.out.println("WiFi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Battery: " + batteryCapacity);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}