class LinkedIn {

    static void createAccount(String name, String email, String password, String jobTitle) {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Job Title: " + jobTitle);
    }

    public static void main(String[] args) {
        createAccount("Imran", "imran@linkedin.com", "link@123", "Student");
    }
}
