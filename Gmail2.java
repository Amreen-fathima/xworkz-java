class Gmail {

    static void createAccount(String firstName, String lastName, String email, String password) {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        createAccount("Ayaan", "Khan", "ayaan@gmail.com", "gmail@123");
    }
}
