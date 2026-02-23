// class HospitalRunner  {

  // public static void main (String[] hos)  {
     // System.out.println("main started");
	   // String specialization = " General Medicine ";
	   // String[] doctors  = Hospital.findDoctorsBySpecialization(specialization);
	   // Hospital.getDoctors(doctors);
	   
	   // specialization= "Ortho";
	   // doctors = Hospital.findDoctorsBySpecialization(specialization);
	   // Hospital.getDoctors(doctors);
	   
	   // System.out.println("main ended");
    // }
// }


class HospitalRunner {

    public static void main(String[] args) {

        String[] specializations = {
            "Cardiac Sciences","Dental Science","Dermatology","Diabetology/Endocrinology","ENT",
            "Emergency and Trauma","Foetal Medicine","Gastroenterology and Hepatobiliary Sciences",
            "General Surgery","Haematology","Infectious Diseases","Infertility medicine","Internal Medicine",
            "Mental Health and Behavioural Sciences","Nephrology","Neurointerventional Radiology","Neurology",
            "Neurosurgery","Obstetrics and Gynaecology","Oncology","Ophthalmology","Organ Transplant",
            "Orthopaedics","Paediatrics","Physiotherapy and Rehabilitation","Plastic and Reconstructive Surgery",
            "Pulmonology","Radiology","Rheumatology","Support Specialties","Thoracic Surgery","Transfusion Medicine",
            "Urology","Endocrine Surgery","Vascular Surgery","Liver Transplant and Hepatobiliary Sciences",
            "Palliative Medicine","Medical Genetics","Pain and Palliative Medicine","Geriatric Medicine",
            "Critical Care","Nuclear Medicine"
        };

        for (String spec : specializations) {
            System.out.println("Doctors in " + spec + " : ");
            String[] doctors = Hospital.findDoctorsBySpecialization(spec);
            Hospital.displayDoctors(doctors);
            System.out.println("-------------------------");
        }
    }
}