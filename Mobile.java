class Mobile {

    static void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Patient registered via mobile app");
        Reception.book(patientName, symptom, email, mobile);
    }
}