class Zoom {

    static void createAccount(String email, String password, String meetingName) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Meeting Name: " + meetingName);
    }

    public static void main(String[] args) {
        createAccount("zoom@gmail.com", "zoom@123", "Java Class");
    }
}
