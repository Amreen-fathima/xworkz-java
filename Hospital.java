// class Hospital{
 
    // public static String[] findDoctorsBySpecialization(String specialization) {
	  // System.out.println("invoked  findDoctorsBySpecialization");
	
	  // if(specialization == "General Medicine") {
	     // String[] generalMedicineDoctors = {"Dr.Yashwanth ", "Dr.Anita ", "Dr.Rakshitha  "}; 
		 // System.out.println("General medicine doctors are found");
	     // return generalMedicineDoctors;
	  // }
	  
	  // else if (specialization == "Ortho ")  {
	    // String[] orthoDoctors = {"Dr.Gngadhar", "Dr.Vikas Rao"};
	    // System.out.println("Ortho doctors are found");
	    // return orthoDoctors;
	  // }
	  
	  // else {
		  // System.out.println(specialization + "not found here");
	  // }
	
	  // return null;
	// }
	
	// public static void getDoctors(String[] doctors) {
		
		// System.out.println("fetching doctors...");
		// System.out.println("---------------------------");
		// for (String doctor : doctors) {
			// System.out.println(doctor);
			
		// }

		 // System.out.println("Above are the doctors List");
		 // System.out.println("---------------------------");
		 
	// }	

// }





class Hospital {

    static String[] findDoctorsBySpecialization(String specialization) {

        if (specialization.equals("Cardiac Sciences")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Dental Science")) {
            String[] doctors = {
                "Dr. Asha", "Dr. Kiran", "Dr. Meena",
                "Dr. Varun", "Dr. Tejas", "Dr. Harsha",
                "Dr. Bhavana", "Dr. Vivek", "Dr. Divya",
                "Dr. Akash", "Dr. Neha", "Dr. Rahul",
                "Dr. Nisha", "Dr. Prakash", "Dr. Pavan"
            };
            return doctors;
        }

        else if (specialization.equals("Dermatology")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ravi", "Dr. Suma",
                "Dr. Karthik", "Dr. Mehul", "Dr. Priya",
                "Dr. Sanjay", "Dr. Nandini", "Dr. Arjun",
                "Dr. Leena", "Dr. Vishal", "Dr. Rekha",
                "Dr. Divya", "Dr. Manoj", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization.equals("Diabetology/Endocrinology")) {
            String[] doctors = {
                "Dr. Pradeep", "Dr. Swati", "Dr. Nikhil",
                "Dr. Ananya", "Dr. Rajesh", "Dr. Priya",
                "Dr. Kiran", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak"
            };
            return doctors;
        }

        else if (specialization.equals("ENT")) {
            String[] doctors = {
                "Dr. Ritu", "Dr. Ajay", "Dr. Nisha",
                "Dr. Vikram", "Dr. Priya", "Dr. Kiran",
                "Dr. Anil", "Dr. Meera", "Dr. Rahul",
                "Dr. Swathi", "Dr. Raj", "Dr. Deepak",
                "Dr. Leena", "Dr. Arjun", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization.equals("Emergency and Trauma")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Foetal Medicine")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ramesh", "Dr. Priya",
                "Dr. Karthik", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Gastroenterology and Hepatobiliary Sciences")) {
            String[] doctors = {
                "Dr. Ritu", "Dr. Ajay", "Dr. Nisha",
                "Dr. Vikram", "Dr. Priya", "Dr. Kiran",
                "Dr. Anil", "Dr. Meera", "Dr. Rahul",
                "Dr. Swathi", "Dr. Raj", "Dr. Deepak",
                "Dr. Leena", "Dr. Arjun", "Dr. Sneha"
            };
            return doctors;
        }

        else if (specialization.equals("General Surgery")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Haematology")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Infectious Diseases")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Infertility medicine")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Internal Medicine")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Mental Health and Behavioural Sciences")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Nephrology")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Neurointerventional Radiology")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Neurology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Neurosurgery")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Obstetrics and Gynaecology")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Oncology")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Ophthalmology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Organ Transplant")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Orthopaedics")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Paediatrics")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Physiotherapy and Rehabilitation")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Plastic and Reconstructive Surgery")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Pulmonology")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Radiology")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Rheumatology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Support Specialties")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Thoracic Surgery")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Transfusion Medicine")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Urology")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
				"Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Endocrine Surgery")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Vascular Surgery")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Liver Transplant and Hepatobiliary Sciences")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Palliative Medicine")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Medical Genetics")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        else if (specialization.equals("Pain and Palliative Medicine")) {
            String[] doctors = {
                "Dr. Ramesh", "Dr. Suresh", "Dr. Mahesh",
                "Dr. Kavitha", "Dr. Anil", "Dr. Priya",
                "Dr. Raj", "Dr. Swathi", "Dr. Deepak",
                "Dr. Manjunath", "Dr. Pooja", "Dr. Arjun",
                "Dr. Sneha", "Dr. Rohit", "Dr. Lakshmi"
            };
            return doctors;
        }

        else if (specialization.equals("Geriatric Medicine")) {
            String[] doctors = {
                "Dr. Anita", "Dr. Ritu", "Dr. Kiran",
                "Dr. Priya", "Dr. Meera", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Neha", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Critical Care")) {
            String[] doctors = {
                "Dr. Rohit", "Dr. Kavitha", "Dr. Anil",
                "Dr. Priya", "Dr. Rajesh", "Dr. Varun",
                "Dr. Sneha", "Dr. Arjun", "Dr. Meera",
                "Dr. Kiran", "Dr. Leena", "Dr. Deepak",
                "Dr. Swati", "Dr. Nikhil", "Dr. Vishal"
            };
            return doctors;
        }

        else if (specialization.equals("Nuclear Medicine")) {
            String[] doctors = {
                "Dr. Neha", "Dr. Arjun", "Dr. Kavitha",
                "Dr. Rohit", "Dr. Deepak", "Dr. Sneha",
                "Dr. Rajesh", "Dr. Priya", "Dr. Nikhil",
                "Dr. Swati", "Dr. Kiran", "Dr. Leena",
                "Dr. Vishal", "Dr. Meera", "Dr. Anil"
            };
            return doctors;
        }

        return null; // If specialization doesn't match
    }

    static void displayDoctors(String[] doctors) {
        if (doctors != null) {
            for (String doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

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
            System.out.println("\nDoctors for specialization: " + spec);
            String[] doctors = findDoctorsBySpecialization(spec);
            displayDoctors(doctors);
        }
    }
}