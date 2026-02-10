class Zepto {

    static void createAccount(String name, long mobile, String location) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        createAccount("Rohit", 9123456789L, "Bangalore");
    }
}
