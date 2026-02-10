class YouTube {

    static void createAccount(String channelName, String email) {
        System.out.println("Channel Name: " + channelName);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        createAccount("TechWorld", "tech@gmail.com");
    }
}
