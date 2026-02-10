class Twitter {

    static void createAccount(String username, String email, String password) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        createAccount("rahul_x", "rahul@x.com", "x@123");
    }
}
