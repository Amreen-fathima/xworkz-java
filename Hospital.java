class Hospital {

    static void bookAppointment(String patientName, String symptom) {
        System.out.println("Appointment booked for " + patientName);
        Nurse.basicCheck(patientName, symptom, 120, false);
    }
}