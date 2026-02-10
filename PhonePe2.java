class PhonePe {

    static void createAccount(String name, long mobile, String upiPin) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("UPI PIN: " + upiPin);
    }

    public static void main(String[] args) {
        createAccount("Faizan", 9090909090L, "1234");
    }
}
