class Pinterest {

    static void createAccount(String username, String email, String interest) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        createAccount("art_lover", "art@gmail.com", "Design");
    }
}
