class Food {

    static String name;
    static double price;
    static String type;   
    static int calories;
    static String hotelName;

    public static boolean createFood(String fName, double fPrice,String fType, int fCalories,String hName) {

        boolean isNameValid = false;
        boolean isPriceValid = false;
        boolean isTypeValid = false;
        boolean isCaloriesValid = false;
        boolean isHotelValid = false;

        if (fName != null && !fName.isEmpty()) {
            Food.name = fName;
            isNameValid = true;
        } else {
            System.out.println("Food Name is Invalid");
        }

        if (fPrice > 0) {
            Food.price = fPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (fType != null && !fType.isEmpty()) {
            Food.type = fType;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (fCalories > 0) {
            Food.calories = fCalories;
            isCaloriesValid = true;
        } else {
            System.out.println("Calories is Invalid");
        }

        if (hName != null && !hName.isEmpty()) {
            Food.hotelName = hName;
            isHotelValid = true;
        } else {
            System.out.println("Hotel Name is Invalid");
        }

        if (isNameValid && isPriceValid && isTypeValid &&
            isCaloriesValid && isHotelValid) {

            System.out.println("Food Created Successfully");
            return true;
        }

        return false;
    }

    public static void getFoodDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Calories: " + calories);
        System.out.println("Hotel Name: " + hotelName);
    }
}