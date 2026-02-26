class MediCarePharma {

    static String companyName;
    static String medicineName;
    static String composition;
    static double price;
    static int quantity;          
    static String expiryDate;
    static boolean prescriptionRequired;
    static String type;          
    static String manufacturerCountry;

    public static boolean createMedicine(String cName, String mName,String comp, double mPrice,int qty, String expDate,boolean prescription,String mType, String country) {

        boolean isCompanyValid = false;
        boolean isMedicineValid = false;
        boolean isCompositionValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isExpiryValid = false;
        boolean isTypeValid = false;
        boolean isCountryValid = false;

        if (cName != null && !cName.isEmpty()) {
            companyName = cName;
            isCompanyValid = true;
        } else {
            System.out.println("Company Name is Invalid");
        }

        if (mName != null && !mName.isEmpty()) {
            medicineName = mName;
            isMedicineValid = true;
        } else {
            System.out.println("Medicine Name is Invalid");
        }

        if (comp != null && !comp.isEmpty()) {
            composition = comp;
            isCompositionValid = true;
        } else {
            System.out.println("Composition is Invalid");
        }

        if (mPrice > 0) {
            price = mPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        if (qty > 0) {
            quantity = qty;
            isQuantityValid = true;
        } else {
            System.out.println("Quantity is Invalid");
        }

        if (expDate != null && !expDate.isEmpty()) {
            expiryDate = expDate;
            isExpiryValid = true;
        } else {
            System.out.println("Expiry Date is Invalid");
        }

        prescriptionRequired = prescription;

        if (mType != null && !mType.isEmpty()) {
            type = mType;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (country != null && !country.isEmpty()) {
            manufacturerCountry = country;
            isCountryValid = true;
        } else {
            System.out.println("Manufacturer Country is Invalid");
        }

        if (isCompanyValid && isMedicineValid &&
            isCompositionValid && isPriceValid &&
            isQuantityValid && isExpiryValid &&
            isTypeValid && isCountryValid) {

            System.out.println("Medicine Created Successfully");
            return true;
        }

        return false;
    }

    public static void getMedicine() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Composition: " + composition);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity + " tablets");
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Prescription Required: " + prescriptionRequired);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer Country: " + manufacturerCountry);
    }
}