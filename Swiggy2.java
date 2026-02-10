class Swiggy {

    static void createAccount(String name, long mobile, String address) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        createAccount("Neha", 8899776655L, "BTM Layout");
    }
}
