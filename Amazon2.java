class Amazon {

    static void createAccount(String name, String email, long mobile, String password) {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        createAccount("Ayesha", "ayesha@amazon.com", 9876543210L, "amazon@123");
    }
}
