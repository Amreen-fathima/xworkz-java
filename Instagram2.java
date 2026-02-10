class Instagram {

    static void createAccount(String username, String email, String password) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        createAccount("insta_rahul", "rahul@gmail.com", "insta@123");
    }
}
