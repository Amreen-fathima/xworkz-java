class Girias {

    static String brand;
    static String model;
    static double price;
    static int capacityKG;
    static String type;
    static int warrantyYears;
    static int rpm;
    static boolean inverterTechnology;
    static String color;
    static int waterConsumption;

    public static boolean createWashingMachine(String bName, String mName,double p, int capacity,String tName, int warranty,int spinRPM, boolean inverter,String cName, int waterUse) {

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isRPMValid = false;
        boolean isColorValid = false;
        boolean isWaterValid = false;

        if (bName != null && !bName.isEmpty()) {
            Girias.brand = bName;
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (mName != null && !mName.isEmpty()) {
            Girias.model = mName;
            isModelValid = true;
        } else {
            System.out.println("Model is Invalid");
        }

        if (p > 0) {
            Girias.price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (capacity > 0) {
            Girias.capacityKG = capacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is Invalid");
        }

        if (tName != null && !tName.isEmpty()) {
            Girias.type = tName;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (warranty > 0) {
            Girias.warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is Invalid");
        }

        if (spinRPM > 0) {
            Girias.rpm = spinRPM;
            isRPMValid = true;
        } else {
            System.out.println("RPM is Invalid");
        }

        Girias.inverterTechnology = inverter;

        if (cName != null && !cName.isEmpty()) {
            Girias.color = cName;
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (waterUse > 0) {
            Girias.waterConsumption = waterUse;
            isWaterValid = true;
        } else {
            System.out.println("Water Consumption is Invalid");
        }

        if (isBrandValid && isModelValid && isPriceValid &&
            isCapacityValid && isTypeValid &&
            isWarrantyValid && isRPMValid &&
            isColorValid && isWaterValid) {

            System.out.println("Washing Machine Created Successfully");
            return true;
        }

        return false;
    }

    public static void getWashingMachineDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacityKG + " KG");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("RPM: " + rpm);
        System.out.println("Inverter Technology: " + inverterTechnology);
        System.out.println("Color: " + color);
        System.out.println("Water Consumption: " + waterConsumption + " L");
    }
}