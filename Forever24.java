class Forever24 {

    static String brand;
    static String clothName;
    static String type;       
    static String size;         
    static String color;
    static double price;
    static String material;
    static String gender;       
    static String season;       
    static boolean isAvailable;
    static int stock;
    static String countryOfOrigin;

    public static boolean createCloth(String bName, String cName, String tName,String sSize, String cColor, double cPrice,String mMaterial, String gGender,
                                      String sSeason, boolean available,int sStock, String origin) {

        boolean isBrandValid = false;
        boolean isClothValid = false;
        boolean isTypeValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isMaterialValid = false;
        boolean isGenderValid = false;
        boolean isSeasonValid = false;
        boolean isStockValid = false;
        boolean isOriginValid = false;

        if (bName != null && !bName.isEmpty()) {
            brand = bName;
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (cName != null && !cName.isEmpty()) {
            clothName = cName;
            isClothValid = true;
        } else {
            System.out.println("Cloth Name is Invalid");
        }

        if (tName != null && !tName.isEmpty()) {
            type = tName;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (sSize != null && !sSize.isEmpty()) {
            size = sSize;
            isSizeValid = true;
        } else {
            System.out.println("Size is Invalid");
        }

        if (cColor != null && !cColor.isEmpty()) {
            color = cColor;
            isColorValid = true;
        } else {
            System.out.println("Color is Invalid");
        }

        if (cPrice > 0) {
            price = cPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (mMaterial != null && !mMaterial.isEmpty()) {
            material = mMaterial;
            isMaterialValid = true;
        } else {
            System.out.println("Material is Invalid");
        }

        if (gGender != null && !gGender.isEmpty()) {
            gender = gGender;
            isGenderValid = true;
        } else {
            System.out.println("Gender is Invalid");
        }

        if (sSeason != null && !sSeason.isEmpty()) {
            season = sSeason;
            isSeasonValid = true;
        } else {
            System.out.println("Season is Invalid");
        }

        isAvailable = available;

        if (sStock >= 0) {
            stock = sStock;
            isStockValid = true;
        } else {
            System.out.println("Stock is Invalid");
        }

        if (origin != null && !origin.isEmpty()) {
            countryOfOrigin = origin;
            isOriginValid = true;
        } else {
            System.out.println("Country of Origin is Invalid");
        }

        if (isBrandValid && isClothValid && isTypeValid &&
            isSizeValid && isColorValid && isPriceValid &&
            isMaterialValid && isGenderValid && isSeasonValid &&
            isStockValid && isOriginValid) {

            System.out.println("Cloth Created Successfully");
            return true;
        }

        return false;
    }

    public static void getCloth() {
        System.out.println("Brand: " + brand);
        System.out.println("Cloth Name: " + clothName);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Gender: " + gender);
        System.out.println("Season: " + season);
        System.out.println("Available: " + isAvailable);
        System.out.println("Stock: " + stock);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}