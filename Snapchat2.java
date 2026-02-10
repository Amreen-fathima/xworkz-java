class Snapchat {

    static void createAccount(String username, long phone, String dob) {
        System.out.println("Username: " + username);
        System.out.println("Phone: " + phone);
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        createAccount("snap_aliya", 9887766554L, "05-05-2003");
    }
}
