class Lg {

    static String brand;
    static String model;
    static double price;
    static int capacityLitres;
    static String type;            
    static int warrantyYears;
    static boolean inverterTechnology;
    static String color;
    static int starRating;
    static boolean frostFree;

    public static boolean createRefrigerator(String bName, String mName,double p, int capacity,String rType, int warranty,boolean inverter,String rColor, int rating,
                                             boolean frost) {

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isColorValid = false;
        boolean isRatingValid = false;

        if (bName != null && !bName.isEmpty()) {
            brand = bName;
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (mName != null && !mName.isEmpty()) {
            model = mName;
            isModelValid = true;
        } else {
            System.out.println("Model is Invalid");
        }

        if (p > 0) {
            price = p;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (capacity > 0) {
            capacityLitres = capacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is Invalid");
        }

        if (rType != null && !rType.isEmpty()) {
            type = rType;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (warranty > 0) {
            warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is Invalid");
        }

        inverterTechnology = inverter;

        if (rColor != null && !rColor.isEmpty()) {
            color = rColor;
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (rating > 0 && rating <= 5) {
            starRating = rating;
            isRatingValid = true;
        } else {
            System.out.println("Star Rating is Invalid");
        }

        frostFree = frost;

        if (isBrandValid && isModelValid && isPriceValid &&
            isCapacityValid && isTypeValid &&
            isWarrantyValid && isColorValid &&
            isRatingValid) {

            System.out.println("Refrigerator Created Successfully");
            return true;
        }

        return false;
    }

    public static void getRefrigeratorDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Inverter Technology: " + inverterTechnology);
        System.out.println("Color: " + color);
        System.out.println("Star Rating: " + starRating);
        System.out.println("Frost Free: " + frostFree);
    }
}