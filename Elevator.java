class Elevator {

    static String brand;
    static int capacity;          
    static int currentFloor;
    static int totalFloors;
    static boolean isWorking;
    static String type;          
    static double speed;         

    public static boolean createElevator(String bName, int cap,int cFloor, int tFloors,boolean working,String eType, double eSpeed) {

        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isCurrentFloorValid = false;
        boolean isTotalFloorsValid = false;
        boolean isTypeValid = false;
        boolean isSpeedValid = false;

        if (bName != null && !bName.isEmpty()) {
            brand = bName;
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (cap > 0) {
            capacity = cap;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is Invalid");
        }

        if (tFloors > 0) {
            totalFloors = tFloors;
            isTotalFloorsValid = true;
        } else {
            System.out.println("Total Floors is Invalid");
        }

        if (cFloor >= 0 && cFloor <= tFloors) {
            currentFloor = cFloor;
            isCurrentFloorValid = true;
        } else {
            System.out.println("Current Floor is Invalid");
        }

        isWorking = working;

        if (eType != null && !eType.isEmpty()) {
            type = eType;
            isTypeValid = true;
        } else {
            System.out.println("Type is Invalid");
        }

        if (eSpeed > 0) {
            speed = eSpeed;
            isSpeedValid = true;
        } else {
            System.out.println("Speed is Invalid");
        }

        if (isBrandValid && isCapacityValid &&
            isCurrentFloorValid && isTotalFloorsValid &&
            isTypeValid && isSpeedValid) {

            System.out.println("Elevator Created Successfully");
            return true;
        }

        return false;
    }

    public static void getElevatorDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " persons");
        System.out.println("Current Floor: " + currentFloor);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Working Status: " + isWorking);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " m/s");
    }
}