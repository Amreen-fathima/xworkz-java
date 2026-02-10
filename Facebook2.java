class Facebook {

    static void createAccount(String fullName, String email, String password, String dob, String gender) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        createAccount("Rahul Sharma", "rahul@gmail.com", "fb@123", "10-08-2002", "Male");
    }
}
