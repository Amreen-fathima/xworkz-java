class Reception {

    static void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Reception booking for: " + patientName);
        System.out.println("Contact: " + email + " , " + mobile);

        Hospital.bookAppointment(patientName, symptom);
    }
}